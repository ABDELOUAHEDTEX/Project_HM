"""
CloudInfraGen - Advanced Multi-Cloud Parser
Support pour AWS, Azure, GCP avec détection automatique
"""

import json
import re
from typing import Dict, List, Any, Optional, Tuple
from dataclasses import dataclass, asdict
from enum import Enum

class CloudProvider(Enum):
    """Énumération des fournisseurs cloud"""
    AWS = "AWS"
    AZURE = "Azure"
    GCP = "GCP"
    UNKNOWN = "Unknown"

@dataclass
class ComputeResource:
    """Ressource de calcul"""
    type: str
    instance_type: Optional[str] = None
    count: int = 1
    os: Optional[str] = None
    region: Optional[str] = None

@dataclass
class DatabaseResource:
    """Base de données"""
    type: str
    engine: Optional[str] = None
    instance_class: Optional[str] = None
    storage: Optional[str] = None
    multi_az: bool = False

@dataclass
class StorageResource:
    """Stockage"""
    type: str
    purpose: Optional[str] = None
    capacity: Optional[str] = None
    storage_class: Optional[str] = None

@dataclass
class NetworkResource:
    """Ressource réseau"""
    type: str
    cidr: Optional[str] = None
    load_balancer_type: Optional[str] = None
    subnets: Optional[int] = None

@dataclass
class SecurityResource:
    """Sécurité"""
    type: str
    inbound_rules: Optional[List[Dict]] = None
    outbound_rules: Optional[List[Dict]] = None

@dataclass
class ContainerResource:
    """Conteneur"""
    type: str
    task_count: Optional[int] = None
    orchestrator: Optional[str] = None


class AdvancedCloudParser:
    """Parser NLP avancé avec support multi-cloud"""
    
    def __init__(self):
        self.provider_mappings = self._load_provider_mappings()
        
    def _load_provider_mappings(self) -> Dict:
        """Charge les mappings entre services cloud providers"""
        return {
            "compute": {
                "aws": "EC2",
                "azure": "VirtualMachine",
                "gcp": "ComputeEngine"
            },
            "database": {
                "relational": {
                    "aws": "RDS",
                    "azure": "AzureSQLDatabase",
                    "gcp": "CloudSQL"
                },
                "nosql": {
                    "aws": "DynamoDB",
                    "azure": "CosmosDB",
                    "gcp": "Firestore"
                }
            },
            "storage": {
                "object": {
                    "aws": "S3",
                    "azure": "BlobStorage",
                    "gcp": "CloudStorage"
                },
                "block": {
                    "aws": "EBS",
                    "azure": "ManagedDisk",
                    "gcp": "PersistentDisk"
                }
            },
            "container": {
                "managed": {
                    "aws": "ECS",
                    "azure": "ContainerInstances",
                    "gcp": "CloudRun"
                },
                "kubernetes": {
                    "aws": "EKS",
                    "azure": "AKS",
                    "gcp": "GKE"
                }
            }
        }
    
    def detect_provider(self, text: str) -> CloudProvider:
        """Détecte le fournisseur cloud mentionné"""
        text_lower = text.lower()
        
        # Détection explicite
        if any(kw in text_lower for kw in ["aws", "amazon", "ec2", "s3", "rds"]):
            return CloudProvider.AWS
        elif any(kw in text_lower for kw in ["azure", "microsoft"]):
            return CloudProvider.AZURE
        elif any(kw in text_lower for kw in ["gcp", "google cloud", "gke"]):
            return CloudProvider.GCP
        
        return CloudProvider.AWS  # Défaut
    
    def parse_advanced(self, text: str) -> Dict[str, Any]:
        """
        Parse avancé avec détection de relations et contraintes
        
        Returns:
            Dict avec ressources et relations
        """
        provider = self.detect_provider(text)
        
        # Extraction des ressources
        compute = self._extract_compute_advanced(text, provider)
        database = self._extract_database_advanced(text, provider)
        storage = self._extract_storage_advanced(text, provider)
        network = self._extract_network_advanced(text, provider)
        security = self._extract_security_advanced(text, provider)
        container = self._extract_container_advanced(text, provider)
        
        # Détection des contraintes
        constraints = self._extract_constraints(text)
        
        # Détection des relations
        relations = self._detect_relationships(
            compute, database, storage, network
        )
        
        result = {
            "metadata": {
                "provider": provider.value,
                "version": "2.0",
                "timestamp": None  # À ajouter si besoin
            },
            "resources": {}
        }
        
        if compute:
            result["resources"]["compute"] = [asdict(c) for c in compute]
        if database:
            result["resources"]["database"] = [asdict(d) for d in database]
        if storage:
            result["resources"]["storage"] = [asdict(s) for s in storage]
        if network:
            result["resources"]["network"] = [asdict(n) for n in network]
        if security:
            result["resources"]["security"] = [asdict(s) for s in security]
        if container:
            result["resources"]["container"] = [asdict(c) for c in container]
        
        if constraints:
            result["constraints"] = constraints
        if relations:
            result["relations"] = relations
        
        return result
    
    def _extract_compute_advanced(
        self, text: str, provider: CloudProvider
    ) -> List[ComputeResource]:
        """Extraction avancée des ressources compute"""
        resources = []
        text_lower = text.lower()
        
        # Patterns pour détecter compute
        compute_patterns = [
            r'(\d+)?\s*(?:serveur|instance|vm|ec2|virtual\s*machine)',
            r'compute\s*engine',
            r'app\s*service'
        ]
        
        for pattern in compute_patterns:
            matches = re.finditer(pattern, text_lower)
            for match in matches:
                # Type de service selon provider
                service_type = self.provider_mappings["compute"].get(
                    provider.value.lower(), "ComputeInstance"
                )
                
                resource = ComputeResource(type=service_type)
                
                # Quantité
                if match.group(1):
                    resource.count = int(match.group(1))
                
                # Type d'instance
                instance_patterns = {
                    CloudProvider.AWS: r't[23]\.(nano|micro|small|medium|large|xlarge|2xlarge)',
                    CloudProvider.AZURE: r'Standard_[A-Z]\d+[a-z]*_v\d+',
                    CloudProvider.GCP: r'[ne]\d+-(?:standard|highmem|highcpu)-\d+'
                }
                
                if provider in instance_patterns:
                    inst_match = re.search(instance_patterns[provider], text_lower)
                    if inst_match:
                        resource.instance_type = inst_match.group(0)
                
                # Système d'exploitation
                os_keywords = {
                    "linux": ["linux", "ubuntu", "centos", "debian"],
                    "windows": ["windows", "win"],
                }
                for os_name, keywords in os_keywords.items():
                    if any(kw in text_lower for kw in keywords):
                        resource.os = os_name.capitalize()
                        break
                
                # Région
                region_match = re.search(
                    r'(?:region|région)\s*:?\s*([a-z]{2}-[a-z]+-\d+)',
                    text_lower
                )
                if region_match:
                    resource.region = region_match.group(1)
                
                resources.append(resource)
                break  # Un seul compute par pattern
        
        return resources if resources else []
    
    def _extract_database_advanced(
        self, text: str, provider: CloudProvider
    ) -> List[DatabaseResource]:
        """Extraction avancée des bases de données"""
        databases = []
        text_lower = text.lower()
        
        # Détecter le type (relationnel vs NoSQL)
        is_nosql = any(kw in text_lower for kw in [
            "dynamodb", "cosmosdb", "firestore", "mongodb", "nosql"
        ])
        
        db_category = "nosql" if is_nosql else "relational"
        
        # Type de service selon provider
        service_type = self.provider_mappings["database"][db_category].get(
            provider.value.lower(), "Database"
        )
        
        db = DatabaseResource(type=service_type)
        
        # Moteur de base de données
        engines = {
            "mysql": ["mysql"],
            "postgresql": ["postgresql", "postgres"],
            "sqlserver": ["sql server", "sqlserver"],
            "oracle": ["oracle"],
            "mongodb": ["mongodb", "mongo"]
        }
        
        for engine_name, keywords in engines.items():
            if any(kw in text_lower for kw in keywords):
                db.engine = engine_name.capitalize()
                break
        
        # Classe d'instance
        instance_class_pattern = r'db\.[a-z]\d+\.(micro|small|medium|large|xlarge)'
        inst_match = re.search(instance_class_pattern, text_lower)
        if inst_match:
            db.instance_class = inst_match.group(0)
        
        # Capacité de stockage
        storage_match = re.search(r'(\d+)\s*(go|gb|gib|to|tb)', text_lower)
        if storage_match:
            db.storage = f"{storage_match.group(1)}{storage_match.group(2).upper()}"
        
        # Multi-AZ / Haute disponibilité
        if any(kw in text_lower for kw in ["multi-az", "haute disponibilité", "ha", "high availability"]):
            db.multi_az = True
        
        if any(kw in text_lower for kw in ["base", "database", "bdd", "rds", "sql"]):
            databases.append(db)
        
        return databases
    
    def _extract_storage_advanced(
        self, text: str, provider: CloudProvider
    ) -> List[StorageResource]:
        """Extraction avancée du stockage"""
        storage_resources = []
        text_lower = text.lower()
        
        # Détecter le type de stockage
        storage_type = "object"  # Défaut
        if any(kw in text_lower for kw in ["ebs", "disk", "volume"]):
            storage_type = "block"
        
        # Type de service
        service_type = self.provider_mappings["storage"][storage_type].get(
            provider.value.lower(), "Storage"
        )
        
        storage = StorageResource(type=service_type)
        
        # Usage / Purpose
        purposes = ["images", "videos", "documents", "backup", "logs", "static"]
        for purpose in purposes:
            if purpose in text_lower:
                storage.purpose = purpose
                break
        
        # Capacité
        capacity_match = re.search(r'(\d+)\s*(to|tb|go|gb|pio|pb)', text_lower)
        if capacity_match:
            storage.capacity = f"{capacity_match.group(1)}{capacity_match.group(2).upper()}"
        
        # Storage Class (AWS)
        if provider == CloudProvider.AWS:
            storage_classes = ["standard", "intelligent-tiering", "glacier", "deep archive"]
            for sc in storage_classes:
                if sc in text_lower:
                    storage.storage_class = sc.title()
                    break
        
        if any(kw in text_lower for kw in ["stockage", "storage", "bucket", "s3", "blob"]):
            storage_resources.append(storage)
        
        return storage_resources
    
    def _extract_network_advanced(
        self, text: str, provider: CloudProvider
    ) -> List[NetworkResource]:
        """Extraction avancée du réseau"""
        network_resources = []
        text_lower = text.lower()
        
        # VPC / Virtual Network
        if "vpc" in text_lower or "virtual network" in text_lower:
            vpc = NetworkResource(type="VPC")
            cidr_match = re.search(r'(\d+\.\d+\.\d+\.\d+/\d+)', text_lower)
            if cidr_match:
                vpc.cidr = cidr_match.group(1)
            
            # Nombre de subnets
            subnet_match = re.search(r'(\d+)\s*subnet', text_lower)
            if subnet_match:
                vpc.subnets = int(subnet_match.group(1))
            
            network_resources.append(vpc)
        
        # Load Balancer
        if any(kw in text_lower for kw in ["load balancer", "lb", "équilibreur"]):
            lb = NetworkResource(type="LoadBalancer")
            
            if "application" in text_lower or "alb" in text_lower:
                lb.load_balancer_type = "application"
            elif "network" in text_lower or "nlb" in text_lower:
                lb.load_balancer_type = "network"
            
            network_resources.append(lb)
        
        # API Gateway
        if "api gateway" in text_lower or "api" in text_lower and "gateway" in text_lower:
            network_resources.append(NetworkResource(type="APIGateway"))
        
        # CDN
        if any(kw in text_lower for kw in ["cdn", "cloudfront", "content delivery"]):
            network_resources.append(NetworkResource(type="CDN"))
        
        return network_resources
    
    def _extract_security_advanced(
        self, text: str, provider: CloudProvider
    ) -> List[SecurityResource]:
        """Extraction avancée de la sécurité"""
        security_resources = []
        text_lower = text.lower()
        
        if any(kw in text_lower for kw in ["security", "sécurité", "firewall"]):
            sg = SecurityResource(type="SecurityGroup")
            
            inbound_rules = []
            
            # Ports communs
            port_mappings = {
                "http": 80,
                "https": 443,
                "ssh": 22,
                "rdp": 3389,
                "mysql": 3306,
                "postgresql": 5432,
                "mongodb": 27017,
                "redis": 6379
            }
            
            for protocol, port in port_mappings.items():
                if protocol in text_lower:
                    inbound_rules.append({
                        "port": port,
                        "protocol": "TCP",
                        "description": protocol.upper()
                    })
            
            # Ports personnalisés
            custom_ports = re.findall(r'port\s+(\d+)', text_lower)
            for port in custom_ports:
                inbound_rules.append({
                    "port": int(port),
                    "protocol": "TCP",
                    "description": "Custom"
                })
            
            if inbound_rules:
                sg.inbound_rules = inbound_rules
            
            security_resources.append(sg)
        
        return security_resources
    
    def _extract_container_advanced(
        self, text: str, provider: CloudProvider
    ) -> List[ContainerResource]:
        """Extraction avancée des conteneurs"""
        containers = []
        text_lower = text.lower()
        
        is_kubernetes = any(kw in text_lower for kw in ["kubernetes", "k8s", "eks", "aks", "gke"])
        
        container_type = "kubernetes" if is_kubernetes else "managed"
        
        service_type = self.provider_mappings["container"][container_type].get(
            provider.value.lower(), "ContainerService"
        )
        
        container = ContainerResource(
            type=service_type,
            orchestrator="Kubernetes" if is_kubernetes else "Managed"
        )
        
        # Nombre de conteneurs/pods
        task_match = re.search(r'(\d+)\s*(?:conteneur|container|pod|task)', text_lower)
        if task_match:
            container.task_count = int(task_match.group(1))
        
        if any(kw in text_lower for kw in ["container", "conteneur", "docker", "kubernetes"]):
            containers.append(container)
        
        return containers
    
    def _extract_constraints(self, text: str) -> Dict[str, Any]:
        """Extrait les contraintes (budget, région, performance...)"""
        constraints = {}
        text_lower = text.lower()
        
        # Budget
        budget_keywords = ["budget", "coût", "cost", "prix", "price", "low-cost", "économique"]
        if any(kw in text_lower for kw in budget_keywords):
            constraints["budget"] = "limited"
        
        # Performance
        perf_keywords = ["performance", "haute performance", "high performance", "optimisé"]
        if any(kw in text_lower for kw in perf_keywords):
            constraints["performance"] = "high"
        
        # Sécurité
        sec_keywords = ["sécurisé", "secure", "compliance", "conforme", "encrypted"]
        if any(kw in text_lower for kw in sec_keywords):
            constraints["security"] = "high"
        
        # Disponibilité
        ha_keywords = ["haute disponibilité", "high availability", "ha", "multi-az", "multi-region"]
        if any(kw in text_lower for kw in ha_keywords):
            constraints["availability"] = "high"
        
        # Scalabilité
        scale_keywords = ["scalable", "auto-scaling", "élastique", "elastic"]
        if any(kw in text_lower for kw in scale_keywords):
            constraints["scalability"] = "auto"
        
        return constraints
    
    def _detect_relationships(
        self, 
        compute: List[ComputeResource],
        database: List[DatabaseResource],
        storage: List[StorageResource],
        network: List[NetworkResource]
    ) -> List[Dict]:
        """Détecte les relations entre ressources"""
        relations = []
        
        # Compute -> Database
        if compute and database:
            relations.append({
                "source": "compute",
                "target": "database",
                "type": "connects_to"
            })
        
        # Compute -> Storage
        if compute and storage:
            relations.append({
                "source": "compute",
                "target": "storage",
                "type": "uses"
            })
        
        # Network -> Compute (LoadBalancer -> EC2)
        if network and compute:
            for net in network:
                if net.type == "LoadBalancer":
                    relations.append({
                        "source": "network",
                        "target": "compute",
                        "type": "distributes_to"
                    })
        
        return relations


def demo_advanced_parser():
    """Démonstration du parser avancé"""
    parser = AdvancedCloudParser()
    
    examples = [
        "Infrastructure e-commerce AWS: 5 EC2 t3.large, RDS MySQL Multi-AZ db.m5.xlarge 500GB, S3 pour images, ALB HTTPS",
        "Azure: 3 VMs Standard_D2s_v3 avec Azure SQL Database et Blob Storage haute performance",
        "GCP: Architecture microservices sur GKE avec 20 pods, Cloud SQL PostgreSQL, Cloud Storage"
    ]
    
    print("🚀 DÉMONSTRATION PARSER AVANCÉ\n")
    print("="*80)
    
    for i, example in enumerate(examples, 1):
        print(f"\n📝 Exemple {i}:")
        print(f"Input: {example}")
        print(f"\n✅ Output:")
        result = parser.parse_advanced(example)
        print(json.dumps(result, indent=2, ensure_ascii=False))
        print("-"*80)


if __name__ == "__main__":
    demo_advanced_parser()