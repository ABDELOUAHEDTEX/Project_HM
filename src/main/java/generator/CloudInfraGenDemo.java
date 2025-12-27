package generator;

import cloudinfragen.Infrastructure;
import java.util.*;

/**
 * End-to-end demo: Natural language -> NLP JSON -> EMF Model -> Terraform
 */
public class CloudInfraGenDemo {
    
    public static void main(String[] args) {
        System.out.println("=".repeat(80));
        System.out.println("CloudInfraGen - End-to-End Demo");
        System.out.println("=".repeat(80));
        
        // Example NLP JSON output (simulating NLP parser output)
        Map<String, Object> nlpOutput = new HashMap<>();
        nlpOutput.put("provider", "AWS");
        
        List<Map<String, Object>> resources = new ArrayList<>();
        
        // VPC
        Map<String, Object> vpc = new HashMap<>();
        vpc.put("type", "VPC");
        vpc.put("name", "main-vpc");
        vpc.put("cidr", "10.0.0.0/16");
        resources.add(vpc);
        
        // Subnet
        Map<String, Object> subnet = new HashMap<>();
        subnet.put("type", "Subnet");
        subnet.put("name", "public-subnet");
        subnet.put("cidr", "10.0.1.0/24");
        subnet.put("typeSubnet", "public");
        subnet.put("vpc", "main-vpc");
        resources.add(subnet);
        
        // Security Group
        Map<String, Object> sg = new HashMap<>();
        sg.put("type", "SecurityGroup");
        sg.put("name", "web-sg");
        List<String> inboundRules = Arrays.asList("HTTP:80", "HTTPS:443");
        sg.put("inboundRules", inboundRules);
        resources.add(sg);
        
        // Compute Instance
        Map<String, Object> compute = new HashMap<>();
        compute.put("type", "ComputeInstance");
        compute.put("name", "web-server");
        compute.put("os", "linux");
        compute.put("subnet", "public-subnet");
        compute.put("securityGroups", Arrays.asList("web-sg"));
        resources.add(compute);
        
        // Storage Bucket
        Map<String, Object> bucket = new HashMap<>();
        bucket.put("type", "StorageBucket");
        bucket.put("name", "assets-bucket");
        bucket.put("versioning", true);
        resources.add(bucket);
        
        // Database
        Map<String, Object> db = new HashMap<>();
        db.put("type", "DatabaseInstance");
        db.put("name", "app-database");
        db.put("engine", "mysql");
        db.put("storageSize", 20);
        db.put("subnet", "public-subnet");
        db.put("securityGroups", Arrays.asList("web-sg"));
        resources.add(db);
        
        nlpOutput.put("resources", resources);
        
        // Step 1: Generate EMF Model
        System.out.println("\n[Step 1] Generating EMF Model from NLP JSON...");
        ModelGenerator modelGen = new ModelGenerator();
        Infrastructure infra = modelGen.createModel(nlpOutput);
        
        System.out.println("✓ Model created:");
        System.out.println("  Provider: " + infra.getProvider());
        System.out.println("  Resources: " + infra.getResources().size());
        
        // Step 2: Validate Model
        System.out.println("\n[Step 2] Validating Model...");
        boolean isValid = modelGen.validateModel(infra);
        System.out.println("✓ Model validation: " + (isValid ? "PASSED" : "FAILED"));
        
        // Step 3: Generate Terraform
        System.out.println("\n[Step 3] Generating Terraform Code...");
        TerraformGenerator tfGen = new TerraformGenerator();
        String terraformCode = tfGen.generate(infra);
        
        System.out.println("✓ Terraform code generated:");
        System.out.println("-".repeat(80));
        System.out.println(terraformCode);
        System.out.println("-".repeat(80));
        
        // Step 4: Save model to file (optional)
        try {
            String modelPath = "output/model.xmi";
            modelGen.saveModel(infra, modelPath);
            System.out.println("\n[Step 4] Model saved to: " + modelPath);
        } catch (Exception e) {
            System.err.println("Warning: Could not save model: " + e.getMessage());
        }
        
        System.out.println("\n" + "=".repeat(80));
        System.out.println("Demo completed successfully!");
        System.out.println("=".repeat(80));
    }
}

