# CloudInfraGen

**CloudInfraGen** is a Model-Driven Engineering (MDE) tool that transforms natural language descriptions of cloud infrastructure into deployable Infrastructure as Code (IaC). The system uses EMF/Ecore for metamodeling, NLP for parsing, and generates Terraform code.

## Vision

Enable developers to describe cloud infrastructure in plain English and automatically generate validated, provider-agnostic models that can be transformed into multiple IaC formats (Terraform, CloudFormation, etc.).

## Architecture

```
Natural Language Input
    ↓
[NLP Parser] → Structured JSON
    ↓
[Model Generator] → EMF Model Instance (conforms to metamodel)
    ↓
[Model Validation] → Validated Model
    ↓
[Terraform Generator] → Terraform Code (.tf files)
```

### Components

1. **Metamodel** (`model/metamodel.ecore`): EMF/Ecore metamodel defining cloud infrastructure concepts
2. **NLP Module** (`nlp/`): Python-based parser that extracts infrastructure entities from natural language
3. **Model Generator** (`generator/ModelGenerator.java`): Converts NLP JSON to EMF model instances
4. **Terraform Generator** (`generator/TerraformGenerator.java`): M2T transformation from model to Terraform
5. **Tests** (`tests/`): Unit and end-to-end tests

## Metamodel

The metamodel is provider-agnostic and supports AWS, Azure, and GCP. It defines the following resource categories:

### Core
- **Infrastructure**: Root container with provider attribute
- **CloudResource**: Abstract base class for all resources

### Compute
- **ComputeInstance**: Virtual machines (EC2, Azure VM, GCE)
- **AutoScalingGroup**: Auto-scaling groups with template reference
- **ContainerService**: Container orchestration (ECS, AKS, GKE)
- **Function**: Serverless functions (Lambda, Azure Functions, Cloud Functions)

### Storage
- **Volume**: Block storage (EBS, Azure Disk, Persistent Disk)
- **StorageBucket**: Object storage (S3, Blob Storage, Cloud Storage)
- **FileSystem**: Shared file systems (EFS, Azure Files, Filestore)

### Database
- **DatabaseInstance**: Relational databases (RDS, Azure SQL, Cloud SQL)
- **NoSQLDatabase**: NoSQL databases (DynamoDB, Cosmos DB, Firestore)

### Network
- **VPC**: Virtual private clouds
- **Subnet**: Subnets with type (public/private) and VPC containment
- **RouteTable**: Routing tables
- **SecurityGroup**: Firewall rules
- **LoadBalancer**: Load balancers
- **NetworkInterface**: Network interfaces

### Security
- **IAMRole**: IAM roles with assume role policies
- **IAMPolicy**: IAM policies with actions and resources
- **Secret**: Secrets management

### Monitoring
- **MonitoringService**: Monitoring and alerting services

### Constraints

- A `Subnet` must belong to exactly one `VPC` (containment)
- A `ComputeInstance` must reference at least one `SecurityGroup`
- An `AutoScalingGroup` must reference a `ComputeInstance` template
- All resources inherit from `CloudResource` with common attributes (id, name, region, tags)

See `docs/metamodel/metamodel.mmd` for the complete diagram.

## NLP Flow

The NLP parser uses rule-based pattern matching to extract:

1. **Provider**: AWS, Azure, or GCP
2. **Resource Types**: Compute, Storage, Database, Network resources
3. **Properties**: Names, configurations, relationships

### Example Input

```
"Create a web server on AWS with an EC2 instance, an S3 bucket, 
a MySQL database, inside a VPC with a public subnet"
```

### Example Output (JSON)

```json
{
  "provider": "AWS",
  "resources": [
    {
      "type": "ComputeInstance",
      "name": "web-server",
      "os": "linux"
    },
    {
      "type": "StorageBucket",
      "name": "assets-bucket"
    },
    {
      "type": "DatabaseInstance",
      "engine": "mysql"
    },
    {
      "type": "VPC",
      "cidr": "10.0.0.0/16"
    },
    {
      "type": "Subnet",
      "typeSubnet": "public"
    }
  ]
}
```

## How to Run

### Prerequisites

- Java 17+
- Maven 3.6+
- Python 3.8+ (for NLP module)
- Eclipse with EMF (for metamodel editing/regeneration)

### Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd cloudinfragen.metamodel
   ```

2. **Build the Java project**
   ```bash
   mvn clean compile
   ```

3. **Setup NLP module** (optional)
   ```bash
   cd nlp
   pip install -r requirements.txt
   python nlp_parser.py  # Run demo
   ```

### Running Demos

#### End-to-End Demo

```bash
mvn exec:java -Dexec.mainClass="generator.CloudInfraGenDemo"
```

This demonstrates the complete flow:
1. NLP JSON input
2. EMF model generation
3. Model validation
4. Terraform code generation

#### NLP Parser Demo

```bash
cd nlp
python nlp_parser.py
```

Shows 3 example inputs and their JSON outputs.

### Running Tests

```bash
mvn test
```

Tests include:
- Unit tests for model generation
- Unit tests for Terraform generation
- End-to-end test (JSON → Model → Terraform)

## Example: Complete Flow

### Input (Natural Language)
```
"Create a web server on AWS with an EC2 instance, an S3 bucket, 
a MySQL database, inside a VPC with a public subnet"
```

### Generated Model (XMI)
The model is saved as `output/model.xmi` and contains:
- Infrastructure root with provider="AWS"
- VPC with CIDR 10.0.0.0/16
- Public subnet
- Compute instance
- Storage bucket
- Database instance

### Generated Terraform

See `docs/examples/example1.tf` for the complete Terraform output.

Key resources generated:
- `aws_vpc` for the VPC
- `aws_subnet` for the subnet
- `aws_instance` for the compute instance
- `aws_s3_bucket` for storage
- `aws_db_instance` for the database
- `aws_security_group` for security

## Project Structure

```
CloudInfraGen/
├── model/
│   ├── metamodel.ecore          # EMF metamodel definition
│   └── metamodel.genmodel       # EMF code generation model
├── src/
│   └── cloudinfragen/           # Generated EMF model code
├── generator/
│   ├── ModelGenerator.java      # NLP JSON → EMF Model
│   ├── TerraformGenerator.java  # EMF Model → Terraform
│   └── CloudInfraGenDemo.java  # End-to-end demo
├── nlp/
│   ├── nlp_parser.py            # Natural language parser
│   └── requirements.txt         # Python dependencies
├── tests/
│   ├── ModelGeneratorTest.java  # Unit tests
│   └── EndToEndTest.java        # E2E test
├── docs/
│   ├── metamodel/
│   │   └── metamodel.mmd        # Mermaid diagram
│   └── examples/
│       ├── example1.json        # Example NLP output
│       └── example1.tf          # Example Terraform output
├── pom.xml                      # Maven configuration
└── README.md                    # This file
```

## Metamodel Regeneration

After modifying `model/metamodel.ecore`, regenerate the Java code:

1. Open `model/metamodel.genmodel` in Eclipse
2. Right-click → Generate Model Code
3. Or use EMF code generation tools

**Note**: The metamodel has been updated with all required classes. Regeneration is needed to sync Java code with the updated metamodel.

## Design Decisions

1. **Provider-Agnostic Metamodel**: Resources are abstracted from provider-specific implementations
2. **Rule-Based NLP**: Deterministic parsing without ML training requirements
3. **EMF for Metamodeling**: Industry-standard MDE framework
4. **M2T Transformation**: Direct model-to-text for Terraform generation
5. **Validation**: Model conformance checks before code generation

## Limitations & Future Work

- NLP parser is rule-based; ML-based parsing could improve accuracy
- Terraform generator currently focuses on AWS; Azure/GCP support is partial
- VS Code extension is planned but not yet implemented
- Model validation constraints are basic; OCL constraints could be added

## Testing

The project includes:

- **Unit Tests**: Model generation, Terraform generation
- **End-to-End Test**: Complete flow from JSON to Terraform
- **Validation Tests**: Model conformance checks

Run tests with:
```bash
mvn test
```

## License

Academic project developed as part of the Final Semester Project – ENSIAS 2025.  
Free to use for educational and research purposes.

## Authors

- ABDELOUAHED AKABBAB
- HIBA ALAOUI

---

**Status**: Production-ready for academic demonstration. All core components implemented and tested.
