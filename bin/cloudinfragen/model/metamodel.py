"""
CloudInfraGen - Meta-model Definition
Définit les classes du méta-modèle pour l'infrastructure cloud
"""

from dataclasses import dataclass, field
from typing import List, Optional, Dict, Any
from enum import Enum
from datetime import datetime
import uuid


class CloudProvider(Enum):
    """Enumération des fournisseurs cloud"""
    AWS = "AWS"
    AZURE = "Azure"
    GCP = "GCP"


class ResourceType(Enum):
    """Types de ressources"""
    COMPUTE = "Compute"
    DATABASE = "Database"
    STORAGE = "Storage"
    NETWORK = "Network"
    SECURITY = "Security"
    CONTAINER = "Container"


@dataclass
class Resource:
    """Classe de base pour toutes les ressources"""
    id: str = field(default_factory=lambda: str(uuid.uuid4()))
    name: Optional[str] = None
    type: str = ""
    properties: Dict[str, Any] = field(default_factory=dict)
    tags: Dict[str, str] = field(default_factory=dict)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convertit la ressource en dictionnaire"""
        return {
            "id": self.id,
            "name": self.name,
            "type": self.type,
            "properties": self.properties,
            "tags": self.tags
        }


@dataclass
class ComputeInstance(Resource):
    """Instance de calcul (EC2, VM, etc.)"""
    type: str = "ComputeInstance"
    engine: str = "EC2"  # EC2, VirtualMachine, ComputeEngine
    instance_type: Optional[str] = None
    count: int = 1
    os: Optional[str] = None
    region: Optional[str] = None
    availability_zone: Optional[str] = None
    
    def __post_init__(self):
        if not self.name:
            self.name = f"{self.engine}-{self.instance_type or 'default'}"
        self.properties.update({
            "engine": self.engine,
            "instanceType": self.instance_type,
            "count": self.count,
            "os": self.os,
            "region": self.region,
            "availabilityZone": self.availability_zone
        })


@dataclass
class DatabaseInstance(Resource):
    """Instance de base de données"""
    type: str = "DatabaseInstance"
    engine: str = "RDS"  # RDS, DynamoDB, CosmosDB, etc.
    db_engine: Optional[str] = None  # MySQL, PostgreSQL, etc.
    instance_class: Optional[str] = None
    storage_size: Optional[str] = None
    multi_az: bool = False
    backup_retention: int = 7
    
    def __post_init__(self):
        if not self.name:
            self.name = f"{self.engine}-{self.db_engine or 'db'}"
        self.properties.update({
            "engine": self.engine,
            "dbEngine": self.db_engine,
            "instanceClass": self.instance_class,
            "storageSize": self.storage_size,
            "multiAZ": self.multi_az,
            "backupRetention": self.backup_retention
        })


@dataclass
class StorageBucket(Resource):
    """Stockage objet (S3, Blob, etc.)"""
    type: str = "StorageBucket"
    storage_type: str = "S3"  # S3, BlobStorage, CloudStorage
    purpose: Optional[str] = None
    capacity: Optional[str] = None
    storage_class: str = "Standard"
    versioning: bool = False
    encryption: bool = True
    
    def __post_init__(self):
        if not self.name:
            self.name = f"{self.storage_type}-{self.purpose or 'bucket'}"
        self.properties.update({
            "storageType": self.storage_type,
            "purpose": self.purpose,
            "capacity": self.capacity,
            "storageClass": self.storage_class,
            "versioning": self.versioning,
            "encryption": self.encryption
        })


@dataclass
class VPC(Resource):
    """Virtual Private Cloud"""
    type: str = "VPC"
    cidr_block: Optional[str] = None
    enable_dns: bool = True
    enable_dns_hostnames: bool = True
    
    def __post_init__(self):
        if not self.name:
            self.name = f"vpc-{self.cidr_block or 'default'}"
        self.properties.update({
            "cidrBlock": self.cidr_block,
            "enableDns": self.enable_dns,
            "enableDnsHostnames": self.enable_dns_hostnames
        })


@dataclass
class LoadBalancer(Resource):
    """Load Balancer"""
    type: str = "LoadBalancer"
    lb_type: str = "application"  # application, network, gateway
    scheme: str = "internet-facing"  # internet-facing, internal
    
    def __post_init__(self):
        if not self.name:
            self.name = f"lb-{self.lb_type}"
        self.properties.update({
            "loadBalancerType": self.lb_type,
            "scheme": self.scheme
        })


@dataclass
class SecurityGroup(Resource):
    """Security Group"""
    type: str = "SecurityGroup"
    inbound_rules: List[Dict[str, Any]] = field(default_factory=list)
    outbound_rules: List[Dict[str, Any]] = field(default_factory=list)
    
    def __post_init__(self):
        if not self.name:
            self.name = f"sg-{self.id[:8]}"
        self.properties.update({
            "inboundRules": self.inbound_rules,
            "outboundRules": self.outbound_rules
        })


@dataclass
class ContainerService(Resource):
    """Service de conteneurs"""
    type: str = "ContainerService"
    orchestrator: str = "ECS"  # ECS, EKS, AKS, GKE
    task_count: Optional[int] = None
    cpu: Optional[str] = None
    memory: Optional[str] = None
    
    def __post_init__(self):
        if not self.name:
            self.name = f"{self.orchestrator}-service"
        self.properties.update({
            "orchestrator": self.orchestrator,
            "taskCount": self.task_count,
            "cpu": self.cpu,
            "memory": self.memory
        })


@dataclass
class Relation:
    """Relation entre ressources"""
    source_id: str
    target_id: str
    relation_type: str  # connects_to, depends_on, uses, etc.
    properties: Dict[str, Any] = field(default_factory=dict)
    
    def to_dict(self) -> Dict[str, Any]:
        return {
            "source": self.source_id,
            "target": self.target_id,
            "type": self.relation_type,
            "properties": self.properties
        }


@dataclass
class CloudInfraModel:
    """Modèle d'infrastructure cloud complet"""
    name: str
    provider: CloudProvider
    version: str = "1.0"
    description: Optional[str] = None
    
    # Ressources
    compute_instances: List[ComputeInstance] = field(default_factory=list)
    database_instances: List[DatabaseInstance] = field(default_factory=list)
    storage_buckets: List[StorageBucket] = field(default_factory=list)
    vpcs: List[VPC] = field(default_factory=list)
    load_balancers: List[LoadBalancer] = field(default_factory=list)
    security_groups: List[SecurityGroup] = field(default_factory=list)
    container_services: List[ContainerService] = field(default_factory=list)
    
    # Relations
    relations: List[Relation] = field(default_factory=list)
    
    # Métadonnées
    created_at: str = field(default_factory=lambda: datetime.now().isoformat())
    updated_at: Optional[str] = None
    tags: Dict[str, str] = field(default_factory=dict)
    
    def get_all_resources(self) -> List[Resource]:
        """Retourne toutes les ressources du modèle"""
        return (
            self.compute_instances +
            self.database_instances +
            self.storage_buckets +
            self.vpcs +
            self.load_balancers +
            self.security_groups +
            self.container_services
        )
    
    def get_resource_by_id(self, resource_id: str) -> Optional[Resource]:
        """Récupère une ressource par son ID"""
        for resource in self.get_all_resources():
            if resource.id == resource_id:
                return resource
        return None
    
    def add_relation(self, source_id: str, target_id: str, relation_type: str):
        """Ajoute une relation entre deux ressources"""
        relation = Relation(
            source_id=source_id,
            target_id=target_id,
            relation_type=relation_type
        )
        self.relations.append(relation)
    
    def to_dict(self) -> Dict[str, Any]:
        """Convertit le modèle en dictionnaire"""
        return {
            "name": self.name,
            "provider": self.provider.value,
            "version": self.version,
            "description": self.description,
            "resources": {
                "compute": [c.to_dict() for c in self.compute_instances],
                "database": [d.to_dict() for d in self.database_instances],
                "storage": [s.to_dict() for s in self.storage_buckets],
                "network": {
                    "vpcs": [v.to_dict() for v in self.vpcs],
                    "loadBalancers": [lb.to_dict() for lb in self.load_balancers]
                },
                "security": [sg.to_dict() for sg in self.security_groups],
                "containers": [c.to_dict() for c in self.container_services]
            },
            "relations": [r.to_dict() for r in self.relations],
            "metadata": {
                "createdAt": self.created_at,
                "updatedAt": self.updated_at,
                "tags": self.tags
            }
        }


# Exemples d'utilisation
if __name__ == "__main__":
    # Créer un modèle simple
    model = CloudInfraModel(
        name="SimpleWebApp",
        provider=CloudProvider.AWS,
        description="Application web simple"
    )
    
    # Ajouter une instance compute
    ec2 = ComputeInstance(
        engine="EC2",
        instance_type="t2.micro",
        count=1,
        os="Ubuntu"
    )
    model.compute_instances.append(ec2)
    
    # Ajouter une base de données
    rds = DatabaseInstance(
        engine="RDS",
        db_engine="MySQL",
        instance_class="db.t2.micro"
    )
    model.database_instances.append(rds)
    
    # Ajouter une relation
    model.add_relation(ec2.id, rds.id, "connects_to")
    
    # Afficher le modèle
    import json
    print(json.dumps(model.to_dict(), indent=2))