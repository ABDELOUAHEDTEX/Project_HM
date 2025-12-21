"""
CloudInfraGen - Model Generator
Transforme le JSON du parser NLP en modèle conforme au méta-modèle
"""

import sys
import os
sys.path.append(os.path.dirname(os.path.dirname(__file__)))

from typing import Dict, Any, List
from metamodel import (
    CloudInfraModel, CloudProvider,
    ComputeInstance, DatabaseInstance, StorageBucket,
    VPC, LoadBalancer, SecurityGroup, ContainerService
)


class ModelGenerator:
    """Génère un modèle d'infrastructure depuis le JSON du parser NLP"""
    
    def __init__(self):
        self.provider_map = {
            "AWS": CloudProvider.AWS,
            "Azure": CloudProvider.AZURE,
            "GCP": CloudProvider.GCP
        }
    
    def generate(
        self, 
        parsed_data: Dict[str, Any], 
        model_name: str = "GeneratedInfra",
        description: str = None
    ) -> CloudInfraModel:
        """
        Génère un modèle complet depuis le JSON du parser
        
        Args:
            parsed_data: JSON retourné par le parser NLP
            model_name: Nom du modèle à générer
            description: Description du modèle
            
        Returns:
            CloudInfraModel: Modèle validé et structuré
        """
        # Créer le modèle de base
        provider = self._get_provider(parsed_data.get("provider", "AWS"))
        
        model = CloudInfraModel(
            name=model_name,
            provider=provider,
            description=description or "Infrastructure générée automatiquement"
        )
        
        # Générer les ressources
        if "compute" in parsed_data:
            model.compute_instances = self._generate_compute(parsed_data["compute"])
        
        if "database" in parsed_data:
            model.database_instances = self._generate_database(parsed_data["database"])
        
        if "storage" in parsed_data:
            model.storage_buckets = self._generate_storage(parsed_data["storage"])
        
        if "network" in parsed_data:
            vpcs, lbs = self._generate_network(parsed_data["network"])
            model.vpcs = vpcs
            model.load_balancers = lbs
        
        if "security" in parsed_data:
            model.security_groups = self._generate_security(parsed_data["security"])
        
        if "container" in parsed_data:
            model.container_services = self._generate_containers(parsed_data["container"])
        
        # Générer les relations automatiques
        self._generate_relations(model)
        
        return model
    
    def _get_provider(self, provider_str: str) -> CloudProvider:
        """Convertit la string du provider en enum"""
        return self.provider_map.get(provider_str, CloudProvider.AWS)
    
    def _generate_compute(self, compute_data: List[Dict]) -> List[ComputeInstance]:
        """Génère les instances compute"""
        instances = []
        
        for data in compute_data:
            instance = ComputeInstance(
                engine=data.get("type", "EC2"),
                instance_type=data.get("instanceType"),
                count=data.get("count", 1),
                os=data.get("os"),
                region=data.get("region")
            )
            instances.append(instance)
        
        return instances
    
    def _generate_database(self, database_data: List[Dict]) -> List[DatabaseInstance]:
        """Génère les instances de base de données"""
        databases = []
        
        for data in database_data:
            db = DatabaseInstance(
                engine=data.get("type", "RDS"),
                db_engine=data.get("engine"),
                instance_class=data.get("instanceClass"),
                storage_size=data.get("storage"),
                multi_az=data.get("multiAZ", False)
            )
            databases.append(db)
        
        return databases
    
    def _generate_storage(self, storage_data: List[Dict]) -> List[StorageBucket]:
        """Génère les buckets de stockage"""
        buckets = []
        
        for data in storage_data:
            bucket = StorageBucket(
                storage_type=data.get("type", "S3"),
                purpose=data.get("purpose"),
                capacity=data.get("capacity"),
                storage_class=data.get("storageClass", "Standard")
            )
            buckets.append(bucket)
        
        return buckets
    
    def _generate_network(self, network_data: List[Dict]) -> tuple:
        """Génère les composants réseau"""
        vpcs = []
        load_balancers = []
        
        for data in network_data:
            net_type = data.get("type")
            
            if net_type == "VPC":
                vpc = VPC(
                    cidr_block=data.get("cidr"),
                    enable_dns=True
                )
                vpcs.append(vpc)
            
            elif net_type == "LoadBalancer":
                lb = LoadBalancer(
                    lb_type=data.get("loadBalancerType", "application"),
                    scheme="internet-facing"
                )
                load_balancers.append(lb)
        
        return vpcs, load_balancers
    
    def _generate_security(self, security_data: List[Dict]) -> List[SecurityGroup]:
        """Génère les security groups"""
        security_groups = []
        
        for data in security_data:
            sg = SecurityGroup(
                inbound_rules=data.get("inboundRules", []),
                outbound_rules=data.get("outboundRules", [])
            )
            security_groups.append(sg)
        
        return security_groups
    
    def _generate_containers(self, container_data: List[Dict]) -> List[ContainerService]:
        """Génère les services de conteneurs"""
        containers = []
        
        for data in container_data:
            container = ContainerService(
                orchestrator=data.get("type", "ECS"),
                task_count=data.get("taskCount")
            )
            containers.append(container)
        
        return containers
    
    def _generate_relations(self, model: CloudInfraModel):
        """Génère automatiquement les relations entre ressources"""
        
        # Relation: Compute -> Database
        for compute in model.compute_instances:
            for database in model.database_instances:
                model.add_relation(compute.id, database.id, "connects_to")
        
        # Relation: Compute -> Storage
        for compute in model.compute_instances:
            for storage in model.storage_buckets:
                model.add_relation(compute.id, storage.id, "uses")
        
        # Relation: LoadBalancer -> Compute
        for lb in model.load_balancers:
            for compute in model.compute_instances:
                model.add_relation(lb.id, compute.id, "distributes_to")
        
        # Relation: SecurityGroup -> Compute
        for sg in model.security_groups:
            for compute in model.compute_instances:
                model.add_relation(sg.id, compute.id, "protects")


# Tests et exemples
def test_model_generator():
    """Test du générateur de modèle"""
    
    # JSON depuis le parser NLP (Phase 2)
    parsed_data = {
        "provider": "AWS",
        "compute": [{
            "type": "EC2",
            "instanceType": "t2.medium",
            "count": 3,
            "os": "Ubuntu"
        }],
        "database": [{
            "type": "RDS",
            "engine": "Mysql",
            "instanceClass": "db.t3.small",
            "storage": "100GB"
        }],
        "storage": [{
            "type": "S3",
            "purpose": "images"
        }],
        "network": [
            {"type": "VPC", "cidr": "10.0.0.0/16"},
            {"type": "LoadBalancer", "loadBalancerType": "application"}
        ],
        "security": [{
            "type": "SecurityGroup",
            "inboundRules": [
                {"port": 80, "protocol": "TCP"},
                {"port": 443, "protocol": "TCP"}
            ]
        }]
    }
    
    # Générer le modèle
    generator = ModelGenerator()
    model = generator.generate(
        parsed_data,
        model_name="ECommerceInfra",
        description="Infrastructure pour application e-commerce"
    )
    
    # Afficher le résultat
    import json
    result = model.to_dict()
    print("="*80)
    print("🏗️  MODÈLE GÉNÉRÉ")
    print("="*80)
    print(json.dumps(result, indent=2, ensure_ascii=False))
    
    # Statistiques
    print("\n" + "="*80)
    print("📊 STATISTIQUES")
    print("="*80)
    print(f"Nom: {model.name}")
    print(f"Provider: {model.provider.value}")
    print(f"Ressources Compute: {len(model.compute_instances)}")
    print(f"Bases de données: {len(model.database_instances)}")
    print(f"Buckets Storage: {len(model.storage_buckets)}")
    print(f"VPCs: {len(model.vpcs)}")
    print(f"Load Balancers: {len(model.load_balancers)}")
    print(f"Security Groups: {len(model.security_groups)}")
    print(f"Relations: {len(model.relations)}")
    print(f"Total ressources: {len(model.get_all_resources())}")


if __name__ == "__main__":
    test_model_generator()