# Guide de Test avec un Cas Réel

Ce guide explique comment tester CloudInfraGen avec un cas réel d'infrastructure cloud.

## 📋 Vue d'ensemble

Le projet CloudInfraGen transforme des descriptions en langage naturel en code Terraform via 3 étapes :

1. **NLP Parser (Python)** : Texte → JSON structuré
2. **Model Generator (Java)** : JSON → Modèle EMF
3. **Terraform Generator (Java)** : Modèle EMF → Code Terraform

## 🚀 Méthode 1 : Utiliser le Parser NLP Python

### Étape 1 : Préparer l'environnement Python

```bash
cd nlp
pip install -r requirements.txt
```

### Étape 2 : Tester le parser avec un cas réel

Créez un fichier `test_input.txt` :

```
Je veux créer une infrastructure AWS avec :
- Un serveur web Linux dans un VPC avec un subnet public
- Une base de données MySQL avec 50GB de stockage
- Un bucket S3 pour les assets avec versioning activé
- Un groupe de sécurité autorisant HTTP et HTTPS
- Un load balancer pour distribuer le trafic
```

### Étape 3 : Exécuter le parser

```bash
python nlp_parser.py
```

Ou créez un script personnalisé :

```python
from nlp_parser import CloudInfraParser
import json

parser = CloudInfraParser()

text = """
Je veux créer une infrastructure AWS avec :
- Un serveur web Linux dans un VPC avec un subnet public
- Une base de données MySQL avec 50GB de stockage
- Un bucket S3 pour les assets avec versioning activé
- Un groupe de sécurité autorisant HTTP et HTTPS
"""

result = parser.parse(text)
print(json.dumps(result, indent=2, ensure_ascii=False))

# Sauvegarder dans un fichier JSON
with open('input.json', 'w', encoding='utf-8') as f:
    json.dump(result, f, indent=2, ensure_ascii=False)
```

## 🚀 Méthode 2 : Créer un JSON Manuellement

### Structure du JSON

```json
{
  "provider": "AWS",
  "resources": [
    {
      "type": "VPC",
      "name": "main-vpc",
      "cidr": "10.0.0.0/16"
    },
    {
      "type": "Subnet",
      "name": "public-subnet",
      "cidr": "10.0.1.0/24",
      "typeSubnet": "public",
      "vpc": "main-vpc"
    },
    {
      "type": "SecurityGroup",
      "name": "web-sg",
      "inboundRules": ["HTTP:80", "HTTPS:443"],
      "outboundRules": ["ALL"]
    },
    {
      "type": "ComputeInstance",
      "name": "web-server",
      "os": "linux",
      "image": "ami-0c55b159cbfafe1f0",
      "subnet": "public-subnet",
      "securityGroups": ["web-sg"],
      "region": "us-east-1",
      "tags": ["Environment=Production", "Project=WebApp"]
    },
    {
      "type": "DatabaseInstance",
      "name": "app-database",
      "engine": "mysql",
      "version": "8.0",
      "storageSize": 50,
      "multiAZ": true,
      "subnet": "public-subnet",
      "securityGroups": ["web-sg"]
    },
    {
      "type": "StorageBucket",
      "name": "assets-bucket",
      "versioning": true,
      "publicAccess": false
    },
    {
      "type": "LoadBalancer",
      "name": "app-lb",
      "type": "application"
    }
  ]
}
```

### Types de ressources supportés

- **ComputeInstance** : Serveur EC2/VM
- **AutoScalingGroup** : Groupe d'auto-scaling
- **ContainerService** : Service de conteneurs (ECS/EKS)
- **Function** : Fonction serverless (Lambda)
- **Volume** : Volume de stockage (EBS)
- **StorageBucket** : Bucket de stockage (S3)
- **FileSystem** : Système de fichiers (EFS)
- **DatabaseInstance** : Base de données relationnelle (RDS)
- **NoSQLDatabase** : Base de données NoSQL (DynamoDB)
- **VPC** : Réseau virtuel privé
- **Subnet** : Sous-réseau
- **RouteTable** : Table de routage
- **SecurityGroup** : Groupe de sécurité
- **LoadBalancer** : Équilibreur de charge
- **NetworkInterface** : Interface réseau
- **IAMRole** : Rôle IAM
- **IAMPolicy** : Politique IAM
- **Secret** : Secret (Secrets Manager)
- **MonitoringService** : Service de monitoring

## 🚀 Méthode 3 : Exécuter le Demo Java

### Étape 1 : Compiler le projet

```bash
mvn clean compile
```

### Étape 2 : Exécuter le demo

```bash
mvn exec:java -Dexec.mainClass="generator.CloudInfraGenDemo"
```

Ou depuis Eclipse :
1. Ouvrir `CloudInfraGenDemo.java`
2. Clic droit → Run As → Java Application

### Étape 3 : Vérifier les résultats

Le demo génère :
- Un modèle EMF dans `output/model.xmi`
- Du code Terraform affiché dans la console

## 🚀 Méthode 4 : Créer un Test Personnalisé

### Créer un nouveau test

Créez `src/test/java/tests/RealWorldTest.java` :

```java
package tests;

import generator.ModelGenerator;
import generator.TerraformGenerator;
import cloudinfragen.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class RealWorldTest {
    
    @Test
    public void testECommerceInfrastructure() {
        // Cas réel : Infrastructure e-commerce
        Map<String, Object> nlpOutput = new HashMap<>();
        nlpOutput.put("provider", "AWS");
        
        List<Map<String, Object>> resources = new ArrayList<>();
        
        // 1. VPC pour isoler l'infrastructure
        Map<String, Object> vpc = new HashMap<>();
        vpc.put("type", "VPC");
        vpc.put("name", "ecommerce-vpc");
        vpc.put("cidr", "10.0.0.0/16");
        resources.add(vpc);
        
        // 2. Subnets publics et privés
        Map<String, Object> publicSubnet = new HashMap<>();
        publicSubnet.put("type", "Subnet");
        publicSubnet.put("name", "public-subnet-1");
        publicSubnet.put("cidr", "10.0.1.0/24");
        publicSubnet.put("typeSubnet", "public");
        publicSubnet.put("vpc", "ecommerce-vpc");
        resources.add(publicSubnet);
        
        Map<String, Object> privateSubnet = new HashMap<>();
        privateSubnet.put("type", "Subnet");
        privateSubnet.put("name", "private-subnet-1");
        privateSubnet.put("cidr", "10.0.2.0/24");
        privateSubnet.put("typeSubnet", "private");
        privateSubnet.put("vpc", "ecommerce-vpc");
        resources.add(privateSubnet);
        
        // 3. Security Groups
        Map<String, Object> webSG = new HashMap<>();
        webSG.put("type", "SecurityGroup");
        webSG.put("name", "web-sg");
        webSG.put("inboundRules", Arrays.asList("HTTP:80", "HTTPS:443"));
        resources.add(webSG);
        
        Map<String, Object> dbSG = new HashMap<>();
        dbSG.put("type", "SecurityGroup");
        dbSG.put("name", "db-sg");
        dbSG.put("inboundRules", Arrays.asList("MySQL:3306"));
        resources.add(dbSG);
        
        // 4. Load Balancer
        Map<String, Object> lb = new HashMap<>();
        lb.put("type", "LoadBalancer");
        lb.put("name", "app-lb");
        lb.put("type", "application");
        resources.add(lb);
        
        // 5. Auto Scaling Group avec template
        Map<String, Object> webServer = new HashMap<>();
        webServer.put("type", "ComputeInstance");
        webServer.put("name", "web-server-template");
        webServer.put("os", "linux");
        webServer.put("securityGroups", Arrays.asList("web-sg"));
        resources.add(webServer);
        
        Map<String, Object> asg = new HashMap<>();
        asg.put("type", "AutoScalingGroup");
        asg.put("name", "web-asg");
        asg.put("minSize", 2);
        asg.put("maxSize", 10);
        asg.put("template", "web-server-template");
        resources.add(asg);
        
        // 6. Base de données
        Map<String, Object> db = new HashMap<>();
        db.put("type", "DatabaseInstance");
        db.put("name", "ecommerce-db");
        db.put("engine", "mysql");
        db.put("version", "8.0");
        db.put("storageSize", 100);
        db.put("multiAZ", true);
        db.put("subnet", "private-subnet-1");
        db.put("securityGroups", Arrays.asList("db-sg"));
        resources.add(db);
        
        // 7. Storage pour les assets
        Map<String, Object> bucket = new HashMap<>();
        bucket.put("type", "StorageBucket");
        bucket.put("name", "ecommerce-assets");
        bucket.put("versioning", true);
        bucket.put("publicAccess", false);
        resources.add(bucket);
        
        // 8. Lambda pour le traitement des images
        Map<String, Object> lambda = new HashMap<>();
        lambda.put("type", "Function");
        lambda.put("name", "image-processor");
        lambda.put("runtime", "python3.9");
        lambda.put("trigger", "s3");
        resources.add(lambda);
        
        nlpOutput.put("resources", resources);
        
        // Générer le modèle
        ModelGenerator modelGen = new ModelGenerator();
        Infrastructure infra = modelGen.createModel(nlpOutput);
        
        // Vérifications
        assertNotNull(infra);
        assertEquals("AWS", infra.getProvider());
        assertEquals(11, infra.getResources().size());
        
        // Générer Terraform
        TerraformGenerator tfGen = new TerraformGenerator();
        String terraform = tfGen.generate(infra);
        
        // Vérifier que le code Terraform contient les ressources attendues
        assertTrue(terraform.contains("aws_vpc"));
        assertTrue(terraform.contains("aws_subnet"));
        assertTrue(terraform.contains("aws_security_group"));
        assertTrue(terraform.contains("aws_lb"));
        assertTrue(terraform.contains("aws_autoscaling_group"));
        assertTrue(terraform.contains("aws_db_instance"));
        assertTrue(terraform.contains("aws_s3_bucket"));
        assertTrue(terraform.contains("aws_lambda_function"));
        
        // Afficher le résultat
        System.out.println("\n=== Code Terraform Généré ===");
        System.out.println(terraform);
    }
}
```

### Exécuter le test

```bash
mvn test -Dtest=RealWorldTest
```

## 📝 Exemple Complet : Infrastructure de Production

### Cas d'usage : Application web avec haute disponibilité

**Description en langage naturel :**
```
Je veux créer une infrastructure AWS de production pour une application web avec :
- Un VPC avec 2 subnets publics et 2 subnets privés dans 2 zones de disponibilité
- Un load balancer application pour distribuer le trafic
- Un auto-scaling group de 2 à 10 instances EC2 Linux
- Une base de données RDS MySQL Multi-AZ avec 200GB
- Un bucket S3 pour les backups avec versioning
- Des security groups pour sécuriser les accès
- Un Lambda pour les tâches asynchrones
```

### JSON correspondant

Voir `docs/examples/production-infra.json` (à créer)

### Exécution

```bash
# 1. Générer le JSON avec le parser NLP
python nlp/nlp_parser.py < input.txt > input.json

# 2. Créer un script Java pour charger le JSON
# (voir section suivante)

# 3. Générer le Terraform
mvn exec:java -Dexec.mainClass="generator.CloudInfraGenDemo"
```

## 🔧 Script Utilitaire : Charger un JSON depuis un fichier

Créez `src/main/java/generator/JsonFileDemo.java` :

```java
package generator;

import cloudinfragen.Infrastructure;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Map;

public class JsonFileDemo {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage: java JsonFileDemo <input.json>");
            System.exit(1);
        }
        
        // Charger le JSON
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> nlpOutput = mapper.readValue(
            new File(args[0]), 
            Map.class
        );
        
        // Générer le modèle
        ModelGenerator modelGen = new ModelGenerator();
        Infrastructure infra = modelGen.createModel(nlpOutput);
        
        // Générer Terraform
        TerraformGenerator tfGen = new TerraformGenerator();
        String terraform = tfGen.generate(infra);
        
        // Sauvegarder
        String outputFile = args.length > 1 ? args[1] : "output.tf";
        java.nio.file.Files.write(
            java.nio.file.Paths.get(outputFile),
            terraform.getBytes()
        );
        
        System.out.println("✓ Terraform généré dans : " + outputFile);
    }
}
```

**Note :** Ajoutez Jackson au `pom.xml` pour le support JSON :

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.15.2</version>
</dependency>
```

## ✅ Checklist de Test

- [ ] Parser NLP fonctionne avec texte en français
- [ ] JSON généré est valide
- [ ] Modèle EMF créé sans erreur
- [ ] Validation du modèle passe
- [ ] Code Terraform généré est valide
- [ ] Toutes les ressources sont présentes dans le Terraform
- [ ] Les relations entre ressources sont correctes
- [ ] Le code Terraform peut être validé avec `terraform validate`

## 🐛 Dépannage

### Problème : Le parser ne détecte pas certaines ressources

**Solution :** Ajoutez des patterns dans `nlp/nlp_parser.py` dans `RESOURCE_PATTERNS`

### Problème : Erreur de validation du modèle

**Solution :** Vérifiez que :
- Les ComputeInstance ont au moins un SecurityGroup
- Les Subnets sont liés à un VPC
- Les AutoScalingGroups ont un template

### Problème : Code Terraform invalide

**Solution :** Vérifiez les logs et ajustez `TerraformGenerator.java` pour votre cas d'usage

## 📚 Ressources

- [Documentation Terraform AWS](https://registry.terraform.io/providers/hashicorp/aws/latest/docs)
- [Exemples Terraform](https://github.com/hashicorp/terraform-provider-aws/tree/main/examples)
- [EMF Documentation](https://www.eclipse.org/modeling/emf/)

