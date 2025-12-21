"""
Tests unitaires pour Phase 3 - Model Generation
"""

import sys
import os
sys.path.append(os.path.dirname(__file__))

from metamodel import (
    CloudInfraModel, CloudProvider,
    ComputeInstance, DatabaseInstance, StorageBucket
)
from model_generator import ModelGenerator


def test_compute_generation():
    """Test: Génération d'instances compute"""
    parsed_data = {
        "provider": "AWS",
        "compute": [{
            "type": "EC2",
            "instanceType": "t2.micro",
            "count": 2
        }]
    }
    
    generator = ModelGenerator()
    model = generator.generate(parsed_data, "TestCompute")
    
    assert len(model.compute_instances) == 1
    assert model.compute_instances[0].engine == "EC2"
    assert model.compute_instances[0].instance_type == "t2.micro"
    assert model.compute_instances[0].count == 2
    
    print("✅ Test génération compute: PASSED")


def test_database_generation():
    """Test: Génération de bases de données"""
    parsed_data = {
        "provider": "AWS",
        "database": [{
            "type": "RDS",
            "engine": "Mysql",
            "instanceClass": "db.t3.small",
            "storage": "100GB"
        }]
    }
    
    generator = ModelGenerator()
    model = generator.generate(parsed_data, "TestDatabase")
    
    assert len(model.database_instances) == 1
    assert model.database_instances[0].engine == "RDS"
    assert model.database_instances[0].db_engine == "Mysql"
    assert model.database_instances[0].storage_size == "100GB"
    
    print("✅ Test génération database: PASSED")


def test_full_infrastructure():
    """Test: Infrastructure complète"""
    parsed_data = {
        "provider": "AWS",
        "compute": [{
            "type": "EC2",
            "instanceType": "t2.medium",
            "count": 3
        }],
        "database": [{
            "type": "RDS",
            "engine": "Mysql"
        }],
        "storage": [{
            "type": "S3",
            "purpose": "images"
        }],
        "network": [
            {"type": "VPC", "cidr": "10.0.0.0/16"},
            {"type": "LoadBalancer", "loadBalancerType": "application"}
        ]
    }
    
    generator = ModelGenerator()
    model = generator.generate(parsed_data, "FullInfra")
    
    # Vérifications
    assert model.name == "FullInfra"
    assert model.provider == CloudProvider.AWS
    assert len(model.compute_instances) == 1
    assert len(model.database_instances) == 1
    assert len(model.storage_buckets) == 1
    assert len(model.vpcs) == 1
    assert len(model.load_balancers) == 1
    
    # Vérifier les relations automatiques
    assert len(model.relations) > 0
    
    print("✅ Test infrastructure complète: PASSED")


def test_model_to_dict():
    """Test: Conversion modèle vers dictionnaire"""
    model = CloudInfraModel(
        name="TestModel",
        provider=CloudProvider.AWS
    )
    
    compute = ComputeInstance(
        engine="EC2",
        instance_type="t2.micro"
    )
    model.compute_instances.append(compute)
    
    model_dict = model.to_dict()
    
    assert "name" in model_dict
    assert model_dict["name"] == "TestModel"
    assert "resources" in model_dict
    assert "compute" in model_dict["resources"]
    assert len(model_dict["resources"]["compute"]) == 1
    
    print("✅ Test conversion to_dict: PASSED")


def test_relations_generation():
    """Test: Génération automatique des relations"""
    parsed_data = {
        "provider": "AWS",
        "compute": [{"type": "EC2", "instanceType": "t2.micro"}],
        "database": [{"type": "RDS", "engine": "Mysql"}]
    }
    
    generator = ModelGenerator()
    model = generator.generate(parsed_data, "TestRelations")
    
    # Vérifier qu'une relation compute->database existe
    assert len(model.relations) > 0
    
    # Trouver la relation connects_to
    connects_to_relations = [
        r for r in model.relations 
        if r.relation_type == "connects_to"
    ]
    assert len(connects_to_relations) > 0
    
    print("✅ Test génération relations: PASSED")


def test_multiple_resources():
    """Test: Plusieurs ressources du même type"""
    parsed_data = {
        "provider": "AWS",
        "compute": [
            {"type": "EC2", "instanceType": "t2.micro", "count": 2},
            {"type": "EC2", "instanceType": "t3.large", "count": 5}
        ],
        "database": [
            {"type": "RDS", "engine": "Mysql"},
            {"type": "DynamoDB"}
        ]
    }
    
    generator = ModelGenerator()
    model = generator.generate(parsed_data, "MultiResources")
    
    assert len(model.compute_instances) == 2
    assert len(model.database_instances) == 2
    
    print("✅ Test ressources multiples: PASSED")


def test_resource_ids():
    """Test: Génération d'IDs uniques"""
    model = CloudInfraModel(
        name="TestIDs",
        provider=CloudProvider.AWS
    )
    
    # Créer plusieurs ressources
    compute1 = ComputeInstance(engine="EC2")
    compute2 = ComputeInstance(engine="EC2")
    db1 = DatabaseInstance(engine="RDS")
    
    model.compute_instances.extend([compute1, compute2])
    model.database_instances.append(db1)
    
    # Vérifier que les IDs sont uniques
    all_ids = [r.id for r in model.get_all_resources()]
    assert len(all_ids) == len(set(all_ids)), "Les IDs ne sont pas uniques!"
    
    print("✅ Test IDs uniques: PASSED")


def run_all_tests():
    """Exécute tous les tests"""
    print("\n" + "="*60)
    print("🧪 TESTS PHASE 3 - MODEL GENERATION")
    print("="*60 + "\n")
    
    tests = [
        test_compute_generation,
        test_database_generation,
        test_full_infrastructure,
        test_model_to_dict,
        test_relations_generation,
        test_multiple_resources,
        test_resource_ids
    ]
    
    passed = 0
    failed = 0
    
    for test in tests:
        try:
            test()
            passed += 1
        except AssertionError as e:
            print(f"❌ {test.__name__}: FAILED - {e}")
            failed += 1
        except Exception as e:
            print(f"❌ {test.__name__}: ERROR - {e}")
            failed += 1
    
    print("\n" + "="*60)
    print(f"📊 RÉSULTATS: {passed} passés, {failed} échoués")
    print("="*60 + "\n")
    
    return failed == 0


if __name__ == "__main__":
    success = run_all_tests()
    sys.exit(0 if success else 1)