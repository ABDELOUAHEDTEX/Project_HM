package generator;

import cloudinfragen.*;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Generates Terraform code from EMF model instances.
 */
public class TerraformGenerator {
    
    private int indentLevel = 0;
    private static final String INDENT = "  ";
    
    /**
     * Generates Terraform code for an Infrastructure model.
     */
    public String generate(Infrastructure infra) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        
        // Provider block
        pw.println("terraform {");
        indentLevel++;
        pw.println(indent() + "required_version = \">= 1.0\"");
        indentLevel--;
        pw.println("}");
        pw.println();
        
        // Provider configuration
        String provider = infra.getProvider().toLowerCase();
        pw.println(String.format("provider \"%s\" {", provider));
        indentLevel++;
        pw.println(indent() + "region = var.region");
        indentLevel--;
        pw.println("}");
        pw.println();
        
        // Variables
        pw.println("variable \"region\" {");
        indentLevel++;
        pw.println(indent() + "description = \"AWS region\"");
        pw.println(indent() + "type        = string");
        pw.println(indent() + "default     = \"us-east-1\"");
        indentLevel--;
        pw.println("}");
        pw.println();
        
        // Generate resources
        for (CloudResource resource : infra.getResources()) {
            generateResource(pw, resource, provider);
        }
        
        return sw.toString();
    }
    
    private void generateResource(PrintWriter pw, CloudResource resource, String provider) {
        if (resource instanceof ComputeInstance) {
            generateComputeInstance(pw, (ComputeInstance) resource, provider);
        } else if (resource instanceof StorageBucket) {
            generateStorageBucket(pw, (StorageBucket) resource, provider);
        } else if (resource instanceof DatabaseInstance) {
            generateDatabaseInstance(pw, (DatabaseInstance) resource, provider);
        } else if (resource instanceof VPC) {
            generateVPC(pw, (VPC) resource, provider);
        } else if (resource instanceof Subnet) {
            generateSubnet(pw, (Subnet) resource, provider);
        } else if (resource instanceof SecurityGroup) {
            generateSecurityGroup(pw, (SecurityGroup) resource, provider);
        } else if (resource instanceof LoadBalancer) {
            generateLoadBalancer(pw, (LoadBalancer) resource, provider);
        } else if (resource instanceof AutoScalingGroup) {
            generateAutoScalingGroup(pw, (AutoScalingGroup) resource, provider);
        } else if (resource instanceof ContainerService) {
            generateContainerService(pw, (ContainerService) resource, provider);
        } else if (resource instanceof Function) {
            generateFunction(pw, (Function) resource, provider);
        } else if (resource instanceof Volume) {
            generateVolume(pw, (Volume) resource, provider);
        } else if (resource instanceof FileSystem) {
            generateFileSystem(pw, (FileSystem) resource, provider);
        } else if (resource instanceof NoSQLDatabase) {
            generateNoSQLDatabase(pw, (NoSQLDatabase) resource, provider);
        }
    }
    
    private void generateComputeInstance(PrintWriter pw, ComputeInstance ci, String provider) {
        String resourceName = sanitizeName(ci.getName());
        String resourceType = provider.equals("aws") ? "aws_instance" : 
                             provider.equals("azure") ? "azurerm_virtual_machine" : 
                             "google_compute_instance";
        
        pw.println(String.format("resource \"%s\" \"%s\" {", resourceType, resourceName));
        indentLevel++;
        
        if (provider.equals("aws")) {
            pw.println(indent() + String.format("ami           = \"%s\"", 
                ci.getOs() != null && ci.getOs().contains("ubuntu") ? "ami-0c55b159cbfafe1f0" : "ami-0c55b159cbfafe1f0"));
            pw.println(indent() + "instance_type = \"t2.micro\"");
            pw.println(indent() + String.format("key_name      = \"%s\"", 
                ci.getKeypair() != null ? ci.getKeypair() : "default-key"));
            
            if (ci.getSubnet() != null) {
                pw.println(indent() + String.format("subnet_id     = %s.id", 
                    sanitizeName(ci.getSubnet().getName())));
            }
            
            if (!ci.getSecurityGroups().isEmpty()) {
                pw.print(indent() + "vpc_security_group_ids = [");
                for (int i = 0; i < ci.getSecurityGroups().size(); i++) {
                    pw.print(sanitizeName(ci.getSecurityGroups().get(i).getName()) + ".id");
                    if (i < ci.getSecurityGroups().size() - 1) {
                        pw.print(", ");
                    }
                }
                pw.println("]");
            }
        }
        
        if (ci.getRegion() != null) {
            pw.println(indent() + String.format("region = \"%s\"", ci.getRegion()));
        }
        
        if (!ci.getTags().isEmpty()) {
            pw.println(indent() + "tags = {");
            indentLevel++;
            for (String tag : ci.getTags()) {
                String[] parts = tag.split("=");
                if (parts.length == 2) {
                    pw.println(indent() + String.format("\"%s\" = \"%s\"", parts[0], parts[1]));
                }
            }
            indentLevel--;
            pw.println(indent() + "}");
        }
        
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateStorageBucket(PrintWriter pw, StorageBucket bucket, String provider) {
        String resourceName = sanitizeName(bucket.getName());
        String resourceType = provider.equals("aws") ? "aws_s3_bucket" : 
                             provider.equals("azure") ? "azurerm_storage_container" : 
                             "google_storage_bucket";
        
        pw.println(String.format("resource \"%s\" \"%s\" {", resourceType, resourceName));
        indentLevel++;
        pw.println(indent() + String.format("bucket = \"%s\"", bucket.getName()));
        
        if (bucket.isVersioning()) {
            pw.println(indent() + "versioning {");
            indentLevel++;
            pw.println(indent() + "enabled = true");
            indentLevel--;
            pw.println(indent() + "}");
        }
        
        if (bucket.isPublicAccess()) {
            pw.println(indent() + "acl = \"public-read\"");
        }
        
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateDatabaseInstance(PrintWriter pw, DatabaseInstance db, String provider) {
        String resourceName = sanitizeName(db.getName());
        String resourceType = provider.equals("aws") ? "aws_db_instance" : 
                             provider.equals("azure") ? "azurerm_mysql_server" : 
                             "google_sql_database_instance";
        
        pw.println(String.format("resource \"%s\" \"%s\" {", resourceType, resourceName));
        indentLevel++;
        
        if (provider.equals("aws")) {
            pw.println(indent() + String.format("identifier = \"%s\"", db.getName()));
            pw.println(indent() + String.format("engine     = \"%s\"", db.getEngine()));
            pw.println(indent() + String.format("engine_version = \"%s\"", 
                db.getVersion() != null ? db.getVersion() : "8.0"));
            pw.println(indent() + "instance_class = \"db.t2.micro\"");
            pw.println(indent() + String.format("allocated_storage = %d", db.getStorageSize()));
            pw.println(indent() + String.format("multi_az = %s", db.isMultiAZ()));
            
            if (db.getSubnet() != null) {
                pw.println(indent() + String.format("db_subnet_group_name = %s.name", 
                    sanitizeName(db.getSubnet().getName())));
            }
        }
        
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateVPC(PrintWriter pw, VPC vpc, String provider) {
        String resourceName = sanitizeName(vpc.getName());
        String resourceType = provider.equals("aws") ? "aws_vpc" : 
                             provider.equals("azure") ? "azurerm_virtual_network" : 
                             "google_compute_network";
        
        pw.println(String.format("resource \"%s\" \"%s\" {", resourceType, resourceName));
        indentLevel++;
        pw.println(indent() + String.format("cidr_block = \"%s\"", vpc.getCidrBlock()));
        pw.println(indent() + String.format("tags = {"));
        indentLevel++;
        pw.println(indent() + String.format("Name = \"%s\"", vpc.getName()));
        indentLevel--;
        pw.println(indent() + "}");
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateSubnet(PrintWriter pw, Subnet subnet, String provider) {
        String resourceName = sanitizeName(subnet.getName());
        String resourceType = provider.equals("aws") ? "aws_subnet" : 
                             provider.equals("azure") ? "azurerm_subnet" : 
                             "google_compute_subnetwork";
        
        pw.println(String.format("resource \"%s\" \"%s\" {", resourceType, resourceName));
        indentLevel++;
        
        if (subnet.getVpc() != null) {
            pw.println(indent() + String.format("vpc_id     = %s.id", 
                sanitizeName(subnet.getVpc().getName())));
        }
        pw.println(indent() + String.format("cidr_block = \"%s\"", subnet.getCidr()));
        
        if (subnet.getAvailabilityZone() != null) {
            pw.println(indent() + String.format("availability_zone = \"%s\"", 
                subnet.getAvailabilityZone()));
        }
        
        if (subnet.getTypeSubnet() != null && subnet.getTypeSubnet().equals("public")) {
            pw.println(indent() + "map_public_ip_on_launch = true");
        }
        
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateSecurityGroup(PrintWriter pw, SecurityGroup sg, String provider) {
        String resourceName = sanitizeName(sg.getName());
        String resourceType = provider.equals("aws") ? "aws_security_group" : 
                             provider.equals("azure") ? "azurerm_network_security_group" : 
                             "google_compute_firewall";
        
        pw.println(String.format("resource \"%s\" \"%s\" {", resourceType, resourceName));
        indentLevel++;
        pw.println(indent() + String.format("name = \"%s\"", sg.getName()));
        
        if (!sg.getInboundRules().isEmpty()) {
            pw.println(indent() + "ingress {");
            indentLevel++;
            for (String rule : sg.getInboundRules()) {
                pw.println(indent() + String.format("# %s", rule));
            }
            pw.println(indent() + "from_port   = 0");
            pw.println(indent() + "to_port     = 65535");
            pw.println(indent() + "protocol    = \"tcp\"");
            pw.println(indent() + "cidr_blocks = [\"0.0.0.0/0\"]");
            indentLevel--;
            pw.println(indent() + "}");
        }
        
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateLoadBalancer(PrintWriter pw, LoadBalancer lb, String provider) {
        String resourceName = sanitizeName(lb.getName());
        String resourceType = provider.equals("aws") ? "aws_lb" : 
                             provider.equals("azure") ? "azurerm_lb" : 
                             "google_compute_backend_service";
        
        pw.println(String.format("resource \"%s\" \"%s\" {", resourceType, resourceName));
        indentLevel++;
        pw.println(indent() + String.format("name = \"%s\"", lb.getName()));
        pw.println(indent() + String.format("load_balancer_type = \"%s\"", lb.getType()));
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateAutoScalingGroup(PrintWriter pw, AutoScalingGroup asg, String provider) {
        String resourceName = sanitizeName(asg.getName());
        pw.println(String.format("resource \"aws_autoscaling_group\" \"%s\" {", resourceName));
        indentLevel++;
        pw.println(indent() + String.format("min_size         = %d", asg.getMinSize()));
        pw.println(indent() + String.format("max_size         = %d", asg.getMaxSize()));
        if (asg.getDesiredCapacity() > 0) {
            pw.println(indent() + String.format("desired_capacity = %d", asg.getDesiredCapacity()));
        }
        if (asg.getTemplate() != null) {
            pw.println(indent() + String.format("launch_template {"));
            indentLevel++;
            pw.println(indent() + String.format("id = %s.id", sanitizeName(asg.getTemplate().getName())));
            indentLevel--;
            pw.println(indent() + "}");
        }
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateContainerService(PrintWriter pw, ContainerService cs, String provider) {
        String resourceName = sanitizeName(cs.getName());
        pw.println(String.format("resource \"aws_ecs_cluster\" \"%s\" {", resourceName));
        indentLevel++;
        pw.println(indent() + String.format("name = \"%s\"", cs.getClusterName()));
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateFunction(PrintWriter pw, Function func, String provider) {
        String resourceName = sanitizeName(func.getName());
        String resourceType = provider.equals("aws") ? "aws_lambda_function" : 
                             provider.equals("azure") ? "azurerm_function_app" : 
                             "google_cloudfunctions_function";
        
        pw.println(String.format("resource \"%s\" \"%s\" {", resourceType, resourceName));
        indentLevel++;
        pw.println(indent() + String.format("function_name = \"%s\"", func.getName()));
        pw.println(indent() + String.format("runtime       = \"%s\"", func.getRuntime()));
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateVolume(PrintWriter pw, Volume vol, String provider) {
        String resourceName = sanitizeName(vol.getName());
        String resourceType = provider.equals("aws") ? "aws_ebs_volume" : 
                             provider.equals("azure") ? "azurerm_managed_disk" : 
                             "google_compute_disk";
        
        pw.println(String.format("resource \"%s\" \"%s\" {", resourceType, resourceName));
        indentLevel++;
        pw.println(indent() + String.format("size = %d", vol.getSize()));
        pw.println(indent() + String.format("encrypted = %s", vol.isEncrypted()));
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateFileSystem(PrintWriter pw, FileSystem fs, String provider) {
        String resourceName = sanitizeName(fs.getName());
        pw.println(String.format("resource \"aws_efs_file_system\" \"%s\" {", resourceName));
        indentLevel++;
        pw.println(indent() + String.format("creation_token = \"%s\"", fs.getName()));
        pw.println(indent() + String.format("encrypted       = %s", fs.isEncrypted()));
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private void generateNoSQLDatabase(PrintWriter pw, NoSQLDatabase nosql, String provider) {
        String resourceName = sanitizeName(nosql.getName());
        pw.println(String.format("resource \"aws_dynamodb_table\" \"%s\" {", resourceName));
        indentLevel++;
        pw.println(indent() + String.format("name     = \"%s\"", nosql.getName()));
        pw.println(indent() + String.format("hash_key = \"id\""));
        pw.println(indent() + "attribute {");
        indentLevel++;
        pw.println(indent() + "name = \"id\"");
        pw.println(indent() + "type = \"S\"");
        indentLevel--;
        pw.println(indent() + "}");
        indentLevel--;
        pw.println("}");
        pw.println();
    }
    
    private String indent() {
        return INDENT.repeat(indentLevel);
    }
    
    private String sanitizeName(String name) {
        if (name == null) {
            return "resource";
        }
        return name.replaceAll("[^a-zA-Z0-9_-]", "-").toLowerCase();
    }
}

