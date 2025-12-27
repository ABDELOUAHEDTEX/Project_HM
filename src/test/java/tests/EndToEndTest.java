package tests;

import generator.ModelGenerator;
import generator.TerraformGenerator;
import cloudinfragen.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

/**
 * End-to-end test: Text -> Model -> Terraform
 */
public class EndToEndTest {
    
    @Test
    public void testEndToEndFlow() {
        // Simulate NLP output for: "Create a web server on AWS with an EC2 instance, an S3 bucket, a MySQL database, inside a VPC with a public subnet"
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
        resources.add(subnet);
        
        // Security Group
        Map<String, Object> sg = new HashMap<>();
        sg.put("type", "SecurityGroup");
        sg.put("name", "web-sg");
        sg.put("inboundRules", Arrays.asList("HTTP:80", "HTTPS:443"));
        resources.add(sg);
        
        // Compute Instance
        Map<String, Object> compute = new HashMap<>();
        compute.put("type", "ComputeInstance");
        compute.put("name", "web-server");
        compute.put("os", "linux");
        compute.put("securityGroups", Arrays.asList("web-sg"));
        resources.add(compute);
        
        // Storage Bucket
        Map<String, Object> bucket = new HashMap<>();
        bucket.put("type", "StorageBucket");
        bucket.put("name", "assets-bucket");
        resources.add(bucket);
        
        // Database
        Map<String, Object> db = new HashMap<>();
        db.put("type", "DatabaseInstance");
        db.put("name", "app-database");
        db.put("engine", "mysql");
        db.put("storageSize", 20);
        resources.add(db);
        
        nlpOutput.put("resources", resources);
        
        // Step 1: Generate Model
        ModelGenerator modelGen = new ModelGenerator();
        Infrastructure infra = modelGen.createModel(nlpOutput);
        
        assertNotNull(infra);
        assertEquals("AWS", infra.getProvider());
        assertEquals(6, infra.getResources().size());
        
        // Step 2: Generate Terraform
        TerraformGenerator tfGen = new TerraformGenerator();
        String terraform = tfGen.generate(infra);
        
        assertNotNull(terraform);
        assertTrue(terraform.contains("provider \"aws\""));
        assertTrue(terraform.contains("aws_instance"));
        assertTrue(terraform.contains("aws_s3_bucket"));
        assertTrue(terraform.contains("aws_db_instance"));
        assertTrue(terraform.contains("aws_vpc"));
        assertTrue(terraform.contains("aws_subnet"));
        
        // Verify all resources are in Terraform output
        assertTrue(terraform.contains("web-server"));
        assertTrue(terraform.contains("assets-bucket"));
        assertTrue(terraform.contains("app-database"));
    }
}

