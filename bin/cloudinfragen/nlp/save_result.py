from nlp_parser import CloudInfraParser
import json
from datetime import datetime

parser = CloudInfraParser()

# Votre description
description = """
Infrastructure pour application e-commerce:
- 5 serveurs EC2 t3.large
- RDS MySQL db.m5.xlarge avec 1TB de stockage
- S3 pour images et videos
- Load balancer avec HTTPS
- Security group ports 80 et 443
- VPC 10.0.0.0/16
"""

result = parser.parse(description)

# Ajouter metadata
output = {
    "timestamp": datetime.now().isoformat(),
    "description": description.strip(),
    "parsed_model": result
}

# Sauvegarder en JSON
with open("infrastructure_model.json", "w", encoding="utf-8") as f:
    json.dump(output, f, indent=2, ensure_ascii=False)

print("✅ Modèle sauvegardé dans 'infrastructure_model.json'")
print(json.dumps(output, indent=2, ensure_ascii=False))