"""
Tests pour le Simple Parser (sans SpaCy)
"""

import json
from test_nlp import SimpleCloudParser

def test_basic_compute():
    """Test : Serveur EC2 basique"""
    parser = SimpleCloudParser()
    result = parser.parse("Je veux un serveur EC2 t2.micro")
    
    assert "compute" in result
    assert result["compute"][0]["type"] == "EC2"
    assert result["compute"][0]["instanceType"] == "t2.micro"
    print("✅ Test compute basique : PASSED")

def test_compute_with_database():
    """Test : Serveur avec base de données"""
    parser = SimpleCloudParser()
    result = parser.parse("3 instances EC2 t2.medium avec RDS MySQL")
    
    assert "compute" in result
    assert result["compute"][0]["count"] == 3
    assert "database" in result
    assert "Mysql" in result["database"][0]["engine"]
    print("✅ Test compute + database : PASSED")

def test_complete_infrastructure():
    """Test : Infrastructure complète"""
    parser = SimpleCloudParser()
    text = "5 EC2 t3.large, RDS PostgreSQL db.t3.small 100GB, S3 pour images, load balancer HTTPS"
    result = parser.parse(text)
    
    assert "compute" in result
    assert result["compute"][0]["count"] == 5
    assert "database" in result
    assert "storage" in result
    assert "network" in result
    assert "security" in result
    print("✅ Test infrastructure complète : PASSED")

def test_security_groups():
    """Test : Security groups avec ports"""
    parser = SimpleCloudParser()
    result = parser.parse("EC2 avec security group HTTP, HTTPS et SSH")
    
    assert "security" in result
    rules = result["security"][0]["inboundRules"]
    ports = [rule["port"] for rule in rules]
    assert 80 in ports
    assert 443 in ports
    assert 22 in ports
    print("✅ Test security groups : PASSED")

def test_containers():
    """Test : Conteneurs EKS"""
    parser = SimpleCloudParser()
    result = parser.parse("Déployer 10 pods sur EKS avec RDS PostgreSQL")
    
    assert "container" in result
    assert result["container"][0]["type"] == "EKS"
    assert result["container"][0]["taskCount"] == 10
    print("✅ Test containers : PASSED")

def run_all_tests():
    """Exécute tous les tests"""
    print("\n" + "="*60)
    print("🧪 TESTS DU SIMPLE PARSER")
    print("="*60 + "\n")
    
    tests = [
        test_basic_compute,
        test_compute_with_database,
        test_complete_infrastructure,
        test_security_groups,
        test_containers
    ]
    
    passed = 0
    failed = 0
    
    for test in tests:
        try:
            test()
            passed += 1
        except AssertionError as e:
            print(f"❌ {test.__name__} : FAILED - {e}")
            failed += 1
        except Exception as e:
            print(f"❌ {test.__name__} : ERROR - {e}")
            failed += 1
    
    print("\n" + "="*60)
    print(f"📊 RÉSULTATS : {passed} passés, {failed} échoués")
    print("="*60 + "\n")
    
    return failed == 0

def demo_examples():
    """Démonstration avec exemples variés"""
    parser = SimpleCloudParser()
    
    examples = [
        "Je veux un serveur EC2 t2.micro",
        "3 serveurs EC2 t2.medium avec RDS MySQL et S3 pour images",
        "Infrastructure e-commerce: 5 EC2 t3.large, RDS PostgreSQL db.m5.xlarge 500GB, S3, load balancer HTTPS",
        "Microservices sur EKS avec 20 pods, DynamoDB, S3 backup",
        "VPC 10.0.0.0/16 avec 2 EC2 t2.small, RDS MySQL, API Gateway"
    ]
    
    print("\n" + "="*60)
    print("📚 EXEMPLES DE PARSING")
    print("="*60 + "\n")
    
    for i, example in enumerate(examples, 1):
        print(f"📝 Exemple {i}:")
        print(f"   Input: {example}\n")
        result = parser.parse(example)
        print(f"   ✅ Output:")
        print(f"   {json.dumps(result, indent=6, ensure_ascii=False)}\n")
        print("-"*60 + "\n")

if __name__ == "__main__":
    # Exécuter les tests
    success = run_all_tests()
    
    # Afficher les exemples si tests OK
    if success:
        demo_examples()
    else:
        print("⚠️  Certains tests ont échoué. Vérifiez le code.")