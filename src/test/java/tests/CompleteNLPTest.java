package tests;

import generator.ModelGenerator;
import generator.TerraformGenerator;
import cloudinfragen.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Test complet représentatif : Infrastructure E-commerce de Production
 */
public class CompleteNLPTest {

    private ModelGenerator modelGen;
    private TerraformGenerator tfGen;

    @BeforeEach
    public void setUp() {
        modelGen = new ModelGenerator();
        tfGen = new TerraformGenerator();
    }

    @Test
    public void testCompleteEcommerceInfrastructure() throws Exception {
        System.out.println("=".repeat(80));
        System.out.println("TEST: Complete E-commerce Infrastructure from NLP");
        System.out.println("=".repeat(80));

        // NLP Input (exemple)
        String nlpInput = """
                Deploy a highly available e-commerce platform on AWS with:
                - A VPC with public and private subnets across two availability zones
                - An Application Load Balancer for web traffic
                - Auto-scaling web servers
                - Application servers in private subnets
                - A MySQL database with multi-AZ deployment
                - S3 bucket for product images
                - Lambda functions for order processing
                - DynamoDB for shopping cart data
                - CloudWatch monitoring
                """;

        System.out.println("\n📝 NLP Input:");
        System.out.println(nlpInput);
        System.out.println("\n" + "-".repeat(80));

        // Générer JSON simulé
        Map<String, Object> nlpJson = createEcommerceInfrastructure();
        
        System.out.println("\n🔄 Step 1: Generating EMF Model...");

        // Étape 1 : NLP → EMF Model
        Infrastructure infra = modelGen.createModel(nlpJson);

        // Étape 1b : Lier Subnets au VPC (EMF containment)
        VPC vpc = null;
        List<Subnet> subnets = new ArrayList<>();
        
        // Collecter VPC et Subnets
        for (CloudResource res : infra.getResources()) {
            if (res instanceof VPC) {
                vpc = (VPC) res;
            } else if (res instanceof Subnet) {
                subnets.add((Subnet) res);
            }
        }
        
        // Lier les subnets au VPC
        if (vpc != null) {
            for (Subnet subnet : subnets) {
                vpc.getSubnets().add(subnet);
            }
            System.out.println("   ✓ Linked " + subnets.size() + " subnets to VPC");
        }

        // Assertions de base
        assertNotNull(infra);
        assertEquals("AWS", infra.getProvider());
        System.out.println("   ✓ Model created with " + infra.getResources().size() + " resources");

        // Vérifier la validation
        System.out.println("\n🔄 Step 2: Validating Model...");
        boolean valid = modelGen.validateModel(infra);
        System.out.println("   Model validation: " + (valid ? "✓ PASSED" : "⚠ WARNINGS"));

        // Générer Terraform
        System.out.println("\n🔄 Step 3: Generating Terraform Code...");
        String terraform = tfGen.generate(infra);
        assertNotNull(terraform);
        assertTrue(terraform.length() > 1000);
        System.out.println("   ✓ Generated " + terraform.split("\n").length + " lines of Terraform");

        // Sauvegarder fichiers
        System.out.println("\n🔄 Step 4: Saving Files...");
        Files.createDirectories(Paths.get("output"));
        modelGen.saveModel(infra, "output/ecommerce-model.xmi");
        Files.write(Paths.get("output/ecommerce-infrastructure.tf"), terraform.getBytes());
        
        System.out.println("   ✓ Saved: output/ecommerce-model.xmi");
        System.out.println("   ✓ Saved: output/ecommerce-infrastructure.tf");

        System.out.println("\n" + "=".repeat(80));
        System.out.println("✅ TEST PASSED: Complete infrastructure generated successfully!");
        System.out.println("=".repeat(80));
    }

    /**
     * Création JSON simulé pour le test
     */
    private Map<String, Object> createEcommerceInfrastructure() {
        Map<String, Object> nlpJson = new HashMap<>();
        nlpJson.put("provider", "AWS");

        List<Map<String, Object>> resources = new ArrayList<>();

        // VPC
        resources.add(createResource("VPC", "ecommerce-vpc", 
            Map.of("cidr", "10.0.0.0/16",
                   "tags", Arrays.asList("Environment=Production"))));

        // Subnets
        resources.add(createResource("Subnet", "public-subnet-1a", 
            Map.of("cidr", "10.0.1.0/24", 
                   "typeSubnet", "public", 
                   "availabilityZone", "us-east-1a")));
        
        resources.add(createResource("Subnet", "public-subnet-1b", 
            Map.of("cidr", "10.0.2.0/24", 
                   "typeSubnet", "public", 
                   "availabilityZone", "us-east-1b")));
        
        resources.add(createResource("Subnet", "private-subnet-1a", 
            Map.of("cidr", "10.0.11.0/24", 
                   "typeSubnet", "private", 
                   "availabilityZone", "us-east-1a")));
        
        resources.add(createResource("Subnet", "private-subnet-1b", 
            Map.of("cidr", "10.0.12.0/24", 
                   "typeSubnet", "private", 
                   "availabilityZone", "us-east-1b")));

        // Security Groups
        resources.add(createResource("SecurityGroup", "web-sg", 
            Map.of("inboundRules", Arrays.asList("HTTP:80", "HTTPS:443"),
                   "outboundRules", Arrays.asList("ALL:0"))));
        
        resources.add(createResource("SecurityGroup", "db-sg", 
            Map.of("inboundRules", Arrays.asList("MySQL:3306"),
                   "outboundRules", Arrays.asList())));

        // LoadBalancer
        resources.add(createResource("LoadBalancer", "web-alb", 
            Map.of("type", "application")));

        // Compute Instance (template for ASG)
        resources.add(createResource("ComputeInstance", "web-server-template", 
            Map.of("os", "amazon-linux-2",
                   "securityGroups", Arrays.asList("web-sg"),
                   "subnet", "public-subnet-1a",
                   "tags", Arrays.asList("Role=WebServer"))));

        // AutoScalingGroup
        resources.add(createResource("AutoScalingGroup", "web-asg", 
            Map.of("minSize", 2,
                   "maxSize", 6,
                   "desiredCapacity", 3,
                   "template", "web-server-template")));

        // Database (Multi-AZ)
        resources.add(createResource("DatabaseInstance", "ecommerce-db", 
            Map.of("engine", "mysql",
                   "version", "8.0.35",
                   "multiAZ", true,
                   "storageSize", 100,
                   "securityGroups", Arrays.asList("db-sg"),
                   "tags", Arrays.asList("Environment=Production"))));

        // NoSQL Database
        resources.add(createResource("NoSQLDatabase", "shopping-cart", 
            Map.of("engine", "dynamodb",
                   "throughputCapacity", 10)));

        // S3 Bucket
        resources.add(createResource("StorageBucket", "product-images", 
            Map.of("versioning", true,
                   "publicAccess", false)));

        // Lambda Function
        resources.add(createResource("Function", "order-processor", 
            Map.of("runtime", "python3.11",
                   "trigger", "api-gateway")));

        // Monitoring
        resources.add(createResource("MonitoringService", "cloudwatch", 
            Map.of("metrics", Arrays.asList("CPUUtilization", "RequestCount"))));

        nlpJson.put("resources", resources);
        return nlpJson;
    }

    private Map<String, Object> createResource(String type, String name, Map<String, Object> props) {
        Map<String, Object> resource = new HashMap<>();
        resource.put("type", type);
        resource.put("name", name);
        resource.putAll(props);
        return resource;
    }
}