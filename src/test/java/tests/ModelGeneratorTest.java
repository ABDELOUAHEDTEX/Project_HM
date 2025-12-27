package tests;

import generator.ModelGenerator;
import generator.TerraformGenerator;
import cloudinfragen.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

/**
 * Unit tests for ModelGenerator and TerraformGenerator.
 */
public class ModelGeneratorTest {
    
    private ModelGenerator modelGen;
    private TerraformGenerator tfGen;
    
    @BeforeEach
    public void setUp() {
        modelGen = new ModelGenerator();
        tfGen = new TerraformGenerator();
    }
    
    @Test
    public void testCreateModelWithComputeInstance() {
        Map<String, Object> nlpJson = new HashMap<>();
        nlpJson.put("provider", "AWS");
        
        List<Map<String, Object>> resources = new ArrayList<>();
        Map<String, Object> compute = new HashMap<>();
        compute.put("type", "ComputeInstance");
        compute.put("name", "test-server");
        compute.put("os", "linux");
        resources.add(compute);
        
        nlpJson.put("resources", resources);
        
        Infrastructure infra = modelGen.createModel(nlpJson);
        
        assertNotNull(infra);
        assertEquals("AWS", infra.getProvider());
        assertEquals(1, infra.getResources().size());
        assertTrue(infra.getResources().get(0) instanceof ComputeInstance);
        
        ComputeInstance ci = (ComputeInstance) infra.getResources().get(0);
        assertEquals("test-server", ci.getName());
        assertEquals("linux", ci.getOs());
    }
    
    @Test
    public void testCreateModelWithVPCAndSubnet() {
        Map<String, Object> nlpJson = new HashMap<>();
        nlpJson.put("provider", "AWS");
        
        List<Map<String, Object>> resources = new ArrayList<>();
        
        Map<String, Object> vpc = new HashMap<>();
        vpc.put("type", "VPC");
        vpc.put("name", "test-vpc");
        vpc.put("cidr", "10.0.0.0/16");
        resources.add(vpc);
        
        Map<String, Object> subnet = new HashMap<>();
        subnet.put("type", "Subnet");
        subnet.put("name", "test-subnet");
        subnet.put("cidr", "10.0.1.0/24");
        subnet.put("typeSubnet", "public");
        resources.add(subnet);
        
        nlpJson.put("resources", resources);
        
        Infrastructure infra = modelGen.createModel(nlpJson);
        
        assertNotNull(infra);
        assertEquals(2, infra.getResources().size());
        
        VPC vpcRes = null;
        Subnet subnetRes = null;
        for (CloudResource res : infra.getResources()) {
            if (res instanceof VPC) {
                vpcRes = (VPC) res;
            } else if (res instanceof Subnet) {
                subnetRes = (Subnet) res;
            }
        }
        
        assertNotNull(vpcRes);
        assertNotNull(subnetRes);
        assertEquals("10.0.0.0/16", vpcRes.getCidrBlock());
        assertEquals("10.0.1.0/24", subnetRes.getCidr());
    }
    
    @Test
    public void testValidateModel() {
        Map<String, Object> nlpJson = new HashMap<>();
        nlpJson.put("provider", "AWS");
        
        List<Map<String, Object>> resources = new ArrayList<>();
        
        Map<String, Object> sg = new HashMap<>();
        sg.put("type", "SecurityGroup");
        sg.put("name", "test-sg");
        resources.add(sg);
        
        Map<String, Object> compute = new HashMap<>();
        compute.put("type", "ComputeInstance");
        compute.put("name", "test-server");
        compute.put("securityGroups", Arrays.asList("test-sg"));
        resources.add(compute);
        
        nlpJson.put("resources", resources);
        
        Infrastructure infra = modelGen.createModel(nlpJson);
        
        // Verify model was created
        assertNotNull(infra);
        assertEquals(2, infra.getResources().size());
        
        // Verify ComputeInstance has security groups assigned
        ComputeInstance ci = infra.getResources().stream()
            .filter(r -> r instanceof ComputeInstance)
            .map(r -> (ComputeInstance) r)
            .findFirst()
            .orElse(null);
        
        assertNotNull(ci, "ComputeInstance should be created");
        assertFalse(ci.getSecurityGroups().isEmpty(), 
                   "ComputeInstance should have at least one security group");
        assertEquals("test-sg", ci.getSecurityGroups().get(0).getName());
    }
    
    @Test
    public void testTerraformGeneration() {
        Map<String, Object> nlpJson = new HashMap<>();
        nlpJson.put("provider", "AWS");
        
        List<Map<String, Object>> resources = new ArrayList<>();
        Map<String, Object> compute = new HashMap<>();
        compute.put("type", "ComputeInstance");
        compute.put("name", "test-server");
        resources.add(compute);
        
        nlpJson.put("resources", resources);
        
        Infrastructure infra = modelGen.createModel(nlpJson);
        String terraform = tfGen.generate(infra);
        
        assertNotNull(terraform);
        assertTrue(terraform.contains("terraform"));
        assertTrue(terraform.contains("provider"));
        assertTrue(terraform.toLowerCase().contains("aws"));
    }
    
    @Test
    public void testMultipleResourceTypes() {
        Map<String, Object> nlpJson = new HashMap<>();
        nlpJson.put("provider", "AWS");
        
        List<Map<String, Object>> resources = new ArrayList<>();
        
        resources.add(createResource("ComputeInstance", "server"));
        resources.add(createResource("StorageBucket", "bucket"));
        resources.add(createResource("DatabaseInstance", "database"));
        resources.add(createResource("VPC", "vpc"));
        
        nlpJson.put("resources", resources);
        
        Infrastructure infra = modelGen.createModel(nlpJson);
        
        assertEquals(4, infra.getResources().size());
        assertTrue(infra.getResources().stream().anyMatch(r -> r instanceof ComputeInstance));
        assertTrue(infra.getResources().stream().anyMatch(r -> r instanceof StorageBucket));
        assertTrue(infra.getResources().stream().anyMatch(r -> r instanceof DatabaseInstance));
        assertTrue(infra.getResources().stream().anyMatch(r -> r instanceof VPC));
    }
    
    private Map<String, Object> createResource(String type, String name) {
        Map<String, Object> resource = new HashMap<>();
        resource.put("type", type);
        resource.put("name", name);
        return resource;
    }
}