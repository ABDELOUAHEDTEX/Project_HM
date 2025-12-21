from nlp_parser import CloudInfraParser
import json

parser = CloudInfraParser()

# Exemples variés
examples = {
    "Simple": "EC2 t2.micro",
    "Web App": "Serveur EC2 t2.small avec RDS MySQL",
    "E-commerce": "5 EC2 t3.large, RDS PostgreSQL db.m5.xlarge 500GB, S3 pour images, load balancer HTTPS",
    "Microservices": "Architecture sur EKS avec 20 pods, DynamoDB, S3 backup, API Gateway",
    "Sécurisé": "EC2 avec security group HTTP, HTTPS et SSH, VPC 10.0.0.0/16"
}

print("="*80)
print("📚 TESTS VARIÉS DU PARSER")
print("="*80)

for name, text in examples.items():
    print(f"\n🏗️  {name}")
    print(f"📝 Input: {text}")
    result = parser.parse(text)
    print(f"✅ Output:")
    print(json.dumps(result, indent=2, ensure_ascii=False))
    print("-"*80)