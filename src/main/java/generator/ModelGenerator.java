package generator;

import cloudinfragen.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import java.io.IOException;
import java.util.*;

/**
 * Generates EMF model instances from NLP JSON output.
 */
public class ModelGenerator {
    
    private CloudinfragenFactory factory;
    private ResourceSet resourceSet;
    private Map<String, CloudResource> resourceMap;
    
    public ModelGenerator() {
        factory = CloudinfragenFactory.eINSTANCE;
        resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("xml", new XMLResourceFactoryImpl());
        resourceMap = new HashMap<>();
    }
    
    /**
     * Creates an Infrastructure model from NLP JSON structure.
     * 
     * @param nlpJson Map representing the NLP output
     * @return Infrastructure model instance
     */
    public Infrastructure createModel(Map<String, Object> nlpJson) {
        Infrastructure infra = factory.createInfrastructure();
        
        String provider = (String) nlpJson.getOrDefault("provider", "AWS");
        infra.setProvider(provider);
        
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> resources = (List<Map<String, Object>>) nlpJson.get("resources");
        if (resources == null) {
            return infra;
        }
        
        // First pass: create all resources
        for (Map<String, Object> resourceData : resources) {
            CloudResource resource = createResource(resourceData);
            if (resource != null) {
                infra.getResources().add(resource);
                String name = (String) resourceData.getOrDefault("name", resource.getName());
                resourceMap.put(name, resource);
            }
        }
        
     // Second pass: establish relationships
        for (Map<String, Object> resourceData : resources) {
            String name = (String) resourceData.get("name");
            if (name == null) continue;

            CloudResource resource = resourceMap.get(name);
            if (resource != null) {
                establishRelationships(resource, resourceData);
            }
            if (resource == null) {
                String type = (String) resourceData.get("type");
                System.out.println("⚠ Unsupported resource type: " + type);
            }


        }

        
        return infra;
    }
    
    private CloudResource createResource(Map<String, Object> data) {
        String type = (String) data.get("type");
        if (type == null) {
            return null;
        }
        
        CloudResource resource = null;
        String name = (String) data.getOrDefault("name", type.toLowerCase());
        String id = UUID.randomUUID().toString();
        
        switch (type) {
            case "ComputeInstance":
                ComputeInstance ci = factory.createComputeInstance();
                ci.setId(id);
                ci.setName(name);
                if (data.containsKey("os")) {
                    ci.setOs((String) data.get("os"));
                }
                if (data.containsKey("image")) {
                    ci.setKeypair((String) data.get("image"));
                }
                resource = ci;
                break;
                
            case "AutoScalingGroup":
                AutoScalingGroup asg = factory.createAutoScalingGroup();
                asg.setId(id);
                asg.setName(name);
                asg.setMinSize((Integer) data.getOrDefault("minSize", 1));
                asg.setMaxSize((Integer) data.getOrDefault("maxSize", 1));
                resource = asg;
                break;
                
            case "ContainerService":
                ContainerService cs = factory.createContainerService();
                cs.setId(id);
                cs.setName(name);
                cs.setClusterName((String) data.getOrDefault("clusterName", name));
                cs.setImage((String) data.getOrDefault("image", "nginx:latest"));
                cs.setNumberOfContainers((Integer) data.getOrDefault("numberOfContainers", 1));
                resource = cs;
                break;
                
            case "Function":
                Function func = factory.createFunction();
                func.setId(id);
                func.setName(name);
                func.setRuntime((String) data.getOrDefault("runtime", "python3.9"));
                func.setTrigger((String) data.getOrDefault("trigger", "http"));
                resource = func;
                break;
                
            case "Volume":
                Volume vol = factory.createVolume();
                vol.setId(id);
                vol.setName(name);
                vol.setSize((Integer) data.getOrDefault("size", 20));
                vol.setEncrypted((Boolean) data.getOrDefault("encrypted", false));
                resource = vol;
                break;
                
            case "StorageBucket":
                StorageBucket bucket = factory.createStorageBucket();
                bucket.setId(id);
                bucket.setName(name);
                bucket.setVersioning((Boolean) data.getOrDefault("versioning", false));
                bucket.setPublicAccess((Boolean) data.getOrDefault("publicAccess", false));
                resource = bucket;
                break;
                
            case "FileSystem":
                FileSystem fs = factory.createFileSystem();
                fs.setId(id);
                fs.setName(name);
                fs.setCapacityGB((Integer) data.getOrDefault("capacityGB", 100));
                fs.setEncrypted((Boolean) data.getOrDefault("encrypted", false));
                resource = fs;
                break;
                
            case "DatabaseInstance":
                DatabaseInstance db = factory.createDatabaseInstance();
                db.setId(id);
                db.setName(name);
                db.setEngine((String) data.getOrDefault("engine", "mysql"));
                db.setVersion((String) data.getOrDefault("version", "8.0"));
                db.setStorageSize((Integer) data.getOrDefault("storageSize", 20));
                db.setMultiAZ((Boolean) data.getOrDefault("multiAZ", false));
                resource = db;
                break;
                
            case "NoSQLDatabase":
                NoSQLDatabase nosql = factory.createNoSQLDatabase();
                nosql.setId(id);
                nosql.setName(name);
                nosql.setEngine((String) data.getOrDefault("engine", "dynamodb"));
                nosql.setThroughputCapacity((Integer) data.getOrDefault("throughputCapacity", 5));
                nosql.setReplicaCount((Integer) data.getOrDefault("replicaCount", 1));
                resource = nosql;
                break;
                
            case "VPC":
                VPC vpc = factory.createVPC();
                vpc.setId(id);
                vpc.setName(name);
                vpc.setCidrBlock((String) data.getOrDefault("cidr", "10.0.0.0/16"));
                resource = vpc;
                break;
                
            case "Subnet":
                Subnet subnet = factory.createSubnet();
                subnet.setId(id);
                subnet.setName(name);
                subnet.setCidr((String) data.getOrDefault("cidr", "10.0.1.0/24"));
                subnet.setTypeSubnet((String) data.getOrDefault("typeSubnet", "public"));
                subnet.setAvailabilityZone((String) data.getOrDefault("availabilityZone", "us-east-1a"));
                resource = subnet;
                break;
                
            case "RouteTable":
                RouteTable rt = factory.createRouteTable();
                rt.setId(id);
                rt.setName(name);
                @SuppressWarnings("unchecked")
                List<String> routes = (List<String>) data.getOrDefault("routes", new ArrayList<>());
                rt.getRoutes().addAll(routes);
                resource = rt;
                break;
                
            case "SecurityGroup":
                SecurityGroup sg = factory.createSecurityGroup();
                sg.setId(id);
                sg.setName(name);
                @SuppressWarnings("unchecked")
                List<String> inbound = (List<String>) data.getOrDefault("inboundRules", new ArrayList<>());
                sg.getInboundRules().addAll(inbound);
                @SuppressWarnings("unchecked")
                List<String> outbound = (List<String>) data.getOrDefault("outboundRules", new ArrayList<>());
                sg.getOutboundRules().addAll(outbound);
                resource = sg;
                break;
                
            case "LoadBalancer":
                LoadBalancer lb = factory.createLoadBalancer();
                lb.setId(id);
                lb.setName(name);
                lb.setType((String) data.getOrDefault("type", "application"));
                resource = lb;
                break;
                
            case "NetworkInterface":
                NetworkInterface ni = factory.createNetworkInterface();
                ni.setId(id);
                ni.setName(name);
                ni.setPrivateIP((String) data.getOrDefault("privateIP", ""));
                ni.setPublicIP((String) data.getOrDefault("publicIP", ""));
                resource = ni;
                break;
                
            case "IAMRole":
                IAMRole role = factory.createIAMRole();
                role.setId(id);
                role.setName(name);
                role.setAssumeRolePolicy((String) data.getOrDefault("assumeRolePolicy", ""));
                resource = role;
                break;
                
            case "IAMPolicy":
                IAMPolicy policy = factory.createIAMPolicy();
                policy.setId(id);
                policy.setName(name);
                @SuppressWarnings("unchecked")
                List<String> actions = (List<String>) data.getOrDefault("actions", new ArrayList<>());
                policy.getActions().addAll(actions);
                @SuppressWarnings("unchecked")
                List<String> resources = (List<String>) data.getOrDefault("resources", new ArrayList<>());
                policy.getResources().addAll(resources);
                resource = policy;
                break;
                
            case "Secret":
                Secret secret = factory.createSecret();
                secret.setId(id);
                secret.setName(name);
                secret.setKey((String) data.getOrDefault("key", ""));
                secret.setEncrypted((Boolean) data.getOrDefault("encrypted", true));
                resource = secret;
                break;
                
            case "MonitoringService":
                MonitoringService ms = factory.createMonitoringService();
                ms.setId(id);
                ms.setName(name);
                @SuppressWarnings("unchecked")
                List<String> metrics = (List<String>) data.getOrDefault("metrics", new ArrayList<>());
                ms.getMetrics().addAll(metrics);
                resource = ms;
                break;
        }
        
        // Set common attributes
        if (resource != null) {
            if (data.containsKey("region")) {
                resource.setRegion((String) data.get("region"));
            }
            @SuppressWarnings("unchecked")
            List<String> tags = (List<String>) data.getOrDefault("tags", new ArrayList<>());
            resource.getTags().addAll(tags);
        }
        
        return resource;
    }
    
    private void establishRelationships(CloudResource resource, Map<String, Object> data) {
        if (resource instanceof ComputeInstance) {
            ComputeInstance ci = (ComputeInstance) resource;
            
            // Link subnet
            if (data.containsKey("subnet")) {
                String subnetName = (String) data.get("subnet");
                CloudResource subnetResource = resourceMap.get(subnetName);
                if (subnetResource instanceof Subnet) {
                    // Note: EMF bidirectional references are managed automatically
                    // We need to set the reference properly
                    // TODO: Set subnet reference when EMF model supports it
                }
            }
            
            // Link security groups
            @SuppressWarnings("unchecked")
            List<String> sgNames = (List<String>) data.getOrDefault("securityGroups", new ArrayList<>());
            for (String sgName : sgNames) {
                CloudResource sg = resourceMap.get(sgName);
                if (sg instanceof SecurityGroup) {
                    ci.getSecurityGroups().add((SecurityGroup) sg);
                }
            }
        }
        
        if (resource instanceof DatabaseInstance) {
            DatabaseInstance db = (DatabaseInstance) resource;
            
            if (data.containsKey("subnet")) {
                String subnetName = (String) data.get("subnet");
                CloudResource subnet = resourceMap.get(subnetName);
                if (subnet instanceof Subnet) {
                    // Set reference
                }
            }
            
            @SuppressWarnings("unchecked")
            List<String> sgNames = (List<String>) data.getOrDefault("securityGroups", new ArrayList<>());
            for (String sgName : sgNames) {
                CloudResource sg = resourceMap.get(sgName);
                if (sg instanceof SecurityGroup) {
                    db.getSecurityGroups().add((SecurityGroup) sg);
                }
            }
        }
        
        if (resource instanceof Subnet) {
            // Subnet relationships are handled through containment in VPC
            if (data.containsKey("vpc")) {
                String vpcName = (String) data.get("vpc");
                CloudResource vpc = resourceMap.get(vpcName);
                if (vpc instanceof VPC) {
                    // Subnet is contained in VPC, so it's already linked
                }
            }
        }
        
        if (resource instanceof AutoScalingGroup) {
            AutoScalingGroup asg = (AutoScalingGroup) resource;
            
            if (data.containsKey("template")) {
                String templateName = (String) data.get("template");
                CloudResource template = resourceMap.get(templateName);
                if (template instanceof ComputeInstance) {
                    asg.setTemplate((ComputeInstance) template);
                }
            }
        }
        
        if (resource instanceof Function) {
            Function func = (Function) resource;
            
            if (data.containsKey("iamRole")) {
                String roleName = (String) data.get("iamRole");
                CloudResource role = resourceMap.get(roleName);
                if (role instanceof IAMRole) {
                    func.setIamRole((IAMRole) role);
                }
            }
        }
    }
    
    /**
     * Saves the model to XMI file.
     */
    public void saveModel(Infrastructure infra, String filePath) throws IOException {
        Resource resource = resourceSet.createResource(URI.createFileURI(filePath));
        resource.getContents().add(infra);
        resource.save(Collections.EMPTY_MAP);
    }
    
    /**
     * Validates the model for conformance.
     */
    public boolean validateModel(Infrastructure infra) {
        // Basic validation
        if (infra.getProvider() == null || infra.getProvider().isEmpty()) {
            return false;
        }
        
        // Validate that Subnets belong to VPCs
        for (CloudResource res : infra.getResources()) {
            if (res instanceof Subnet) {
                Subnet subnet = (Subnet) res;
                if (subnet.getVpc() == null) {
                    return false;
                }
            }
            
            if (res instanceof ComputeInstance) {
                ComputeInstance ci = (ComputeInstance) res;
                if (ci.getSecurityGroups().isEmpty()) {
                    return false; // Must have at least one security group
                }
            }
            
            if (res instanceof AutoScalingGroup) {
                AutoScalingGroup asg = (AutoScalingGroup) res;
                if (asg.getTemplate() == null) {
                    return false; // Must have a template
                }
            }
        }
        
        return true;
    }
}

