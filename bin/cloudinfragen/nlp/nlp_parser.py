"""
CloudInfraGen - Simple Parser (Sans SpaCy)
Version minimaliste utilisant uniquement regex
"""

import re
import json
from typing import Dict, List, Any

class CloudInfraParser:
    """Parser simplifié sans dépendance SpaCy"""
    
    def __init__(self):
        self.patterns = self._load_patterns()
    
    def _load_patterns(self) -> Dict:
        """Charge les patterns regex pour l'extraction"""
        return {
            "compute": {
                "instance_types": r'(t[23]\.(nano|micro|small|medium|large|xlarge|2xlarge)|m[45]\.(large|xlarge)|c[45]\.(large|xlarge))',
                "count": r'(\d+)\s*(serveur|instance|vm|ec2)',
                "os": r'(linux|windows|ubuntu|centos|debian|amazon\s*linux)'
            },
            "database": {
                "type": r'(rds|dynamodb|aurora|documentdb|elasticache)',
                "engine": r'(mysql|postgresql|postgres|mariadb|oracle|sqlserver|mongodb|redis)',
                "instance_class": r'(db\.[a-z]\d+\.(micro|small|medium|large|xlarge))',
                "storage": r'(\d+)\s*(go|gb|gib|to|tb)'
            },
            "storage": {
                "type": r'(s3|ebs|efs|glacier)',
                "purpose": r'(images?|videos?|documents?|backup|logs?|static|media)',
                "capacity": r'(\d+)\s*(to|tb|go|gb|pio|pb)'
            },
            "network": {
                "vpc": r'vpc\s*(\d+\.\d+\.\d+\.\d+/\d+)?',
                "load_balancer": r'(load\s*balancer|alb|nlb|elb|équilibreur)',
                "lb_type": r'(application|network)',
                "api_gateway": r'api\s*gateway',
                "cdn": r'(cloudfront|cdn|content\s*delivery)'
            },
            "security": {
                "security_group": r'security\s*group',
                "ports": r'port[s]?\s+(\d+)',
                "http": r'\b(http)\b(?!s)',
                "https": r'https',
                "ssh": r'ssh'
            },
            "container": {
                "type": r'(ecs|eks|kubernetes|k8s|docker)',
                "count": r'(\d+)\s*(conteneur|container|pod|task)'
            }
        }
    
    def parse(self, text: str) -> Dict[str, Any]:
        """
        Parse le texte et extrait les composants
        
        Args:
            text: Description en langage naturel
            
        Returns:
            Dict contenant les composants extraits
        """
        text_lower = text.lower()
        
        result = {
            "provider": self._detect_provider(text_lower),
            "compute": self._extract_compute(text_lower),
            "database": self._extract_database(text_lower),
            "storage": self._extract_storage(text_lower),
            "network": self._extract_network(text_lower),
            "security": self._extract_security(text_lower),
            "container": self._extract_container(text_lower)
        }
        
        # Nettoyer les catégories vides
        result = {k: v for k, v in result.items() if v}
        
        return result
    
    def _detect_provider(self, text: str) -> str:
        """Détecte le fournisseur cloud"""
        if any(kw in text for kw in ["aws", "amazon", "ec2"]):
            return "AWS"
        elif any(kw in text for kw in ["azure", "microsoft"]):
            return "Azure"
        elif any(kw in text for kw in ["gcp", "google"]):
            return "GCP"
        return "AWS"
    
    def _extract_compute(self, text: str) -> List[Dict]:
        """Extrait les ressources compute"""
        if not any(kw in text for kw in ["serveur", "instance", "vm", "ec2", "compute"]):
            return []
        
        compute = {"type": "EC2"}
        
        # Type d'instance
        match = re.search(self.patterns["compute"]["instance_types"], text)
        if match:
            compute["instanceType"] = match.group(0)
        
        # Quantité
        match = re.search(self.patterns["compute"]["count"], text)
        if match:
            compute["count"] = int(match.group(1))
        else:
            compute["count"] = 1
        
        # Système d'exploitation
        match = re.search(self.patterns["compute"]["os"], text)
        if match:
            compute["os"] = match.group(0).capitalize()
        
        return [compute]
    
    def _extract_database(self, text: str) -> List[Dict]:
        """Extrait les bases de données"""
        if not any(kw in text for kw in ["base", "database", "bdd", "rds", "mysql", "postgresql", "sql"]):
            return []
        
        db = {}
        
        # Type
        match = re.search(self.patterns["database"]["type"], text, re.IGNORECASE)
        if match:
            db["type"] = match.group(0).upper()
        else:
            db["type"] = "RDS"
        
        # Moteur
        match = re.search(self.patterns["database"]["engine"], text, re.IGNORECASE)
        if match:
            db["engine"] = match.group(0).capitalize()
        
        # Classe d'instance
        match = re.search(self.patterns["database"]["instance_class"], text)
        if match:
            db["instanceClass"] = match.group(0)
        
        # Stockage
        match = re.search(self.patterns["database"]["storage"], text)
        if match:
            db["storage"] = f"{match.group(1)}{match.group(2).upper()}"
        
        return [db]
    
    def _extract_storage(self, text: str) -> List[Dict]:
        """Extrait le stockage"""
        if not any(kw in text for kw in ["stockage", "storage", "bucket", "s3", "ebs", "efs"]):
            return []
        
        storage = {}
        
        # Type
        match = re.search(self.patterns["storage"]["type"], text, re.IGNORECASE)
        if match:
            storage["type"] = match.group(0).upper()
        else:
            storage["type"] = "S3"
        
        # Usage
        match = re.search(self.patterns["storage"]["purpose"], text)
        if match:
            storage["purpose"] = match.group(0)
        
        # Capacité
        match = re.search(self.patterns["storage"]["capacity"], text)
        if match:
            storage["capacity"] = f"{match.group(1)}{match.group(2).upper()}"
        
        return [storage]
    
    def _extract_network(self, text: str) -> List[Dict]:
        """Extrait les composants réseau"""
        network = []
        
        # VPC
        if "vpc" in text:
            vpc = {"type": "VPC"}
            match = re.search(self.patterns["network"]["vpc"], text)
            if match and match.group(1):
                vpc["cidr"] = match.group(1)
            network.append(vpc)
        
        # Load Balancer
        if re.search(self.patterns["network"]["load_balancer"], text):
            lb = {"type": "LoadBalancer"}
            match = re.search(self.patterns["network"]["lb_type"], text)
            if match:
                lb["loadBalancerType"] = match.group(0)
            network.append(lb)
        
        # API Gateway
        if re.search(self.patterns["network"]["api_gateway"], text):
            network.append({"type": "APIGateway"})
        
        # CDN
        if re.search(self.patterns["network"]["cdn"], text):
            network.append({"type": "CDN"})
        
        return network
    
    def _extract_security(self, text: str) -> List[Dict]:
        """Extrait la sécurité"""
        if not any(kw in text for kw in ["security", "sécurité", "firewall"]):
            return []
        
        sg = {"type": "SecurityGroup"}
        rules = []
        
        # Ports communs
        if re.search(self.patterns["security"]["http"], text):
            rules.append({"port": 80, "protocol": "TCP"})
        if re.search(self.patterns["security"]["https"], text):
            rules.append({"port": 443, "protocol": "TCP"})
        if re.search(self.patterns["security"]["ssh"], text):
            rules.append({"port": 22, "protocol": "TCP"})
        
        # Ports personnalisés
        for match in re.finditer(self.patterns["security"]["ports"], text):
            port = int(match.group(1))
            if port not in [r["port"] for r in rules]:
                rules.append({"port": port, "protocol": "TCP"})
        
        if rules:
            sg["inboundRules"] = rules
        
        return [sg]
    
    def _extract_container(self, text: str) -> List[Dict]:
        """Extrait les conteneurs"""
        if not any(kw in text for kw in ["container", "conteneur", "ecs", "eks", "kubernetes"]):
            return []
        
        container = {}
        
        # Type
        match = re.search(self.patterns["container"]["type"], text, re.IGNORECASE)
        if match:
            service = match.group(0).upper()
            if service in ["K8S", "KUBERNETES"]:
                container["type"] = "EKS"
            else:
                container["type"] = service
        else:
            container["type"] = "ECS"
        
        # Quantité
        match = re.search(self.patterns["container"]["count"], text)
        if match:
            container["taskCount"] = int(match.group(1))
        
        return [container]


# Tests
def main():
    """Test du parser simple"""
    parser = CloudInfraParser()
    
    examples = [
        "Je veux un serveur EC2 t2.micro",
        "3 instances EC2 t2.medium avec RDS MySQL",
        "Infrastructure: 5 EC2 t3.large, RDS PostgreSQL db.t3.small 100GB, S3 pour images",
        "Application avec load balancer, security group HTTP et HTTPS",
        "Microservices sur EKS avec 10 pods, DynamoDB, S3 backup"
    ]
    
    print("🧪 Tests du Parser NLP\n")
    print("="*80)
    
    for i, example in enumerate(examples, 1):
        print(f"\n📝 Test {i}:")
        print(f"Input: {example}")
        result = parser.parse(example)
        print(f"\n✅ Output:")
        print(json.dumps(result, indent=2, ensure_ascii=False))
        print("-"*80)


if __name__ == "__main__":
    main()