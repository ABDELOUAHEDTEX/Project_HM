# Exemples d'Infrastructure

Ce dossier contient des exemples d'infrastructures cloud pour tester CloudInfraGen.

## 📁 Fichiers

- **example1.json** : Infrastructure simple avec VPC, subnet, serveur web, base de données et bucket S3
- **example1.tf** : Code Terraform généré correspondant
- **production-infra.json** : Infrastructure de production avec haute disponibilité

## 🚀 Utilisation

### Méthode 1 : Via le Demo Java (modifier le code)

1. Ouvrez `src/main/java/generator/CloudInfraGenDemo.java`
2. Remplacez le contenu de `nlpOutput` par le JSON de l'exemple
3. Exécutez : `mvn exec:java -Dexec.mainClass="generator.CloudInfraGenDemo"`

### Méthode 2 : Créer un test JUnit

```java
@Test
public void testProductionInfra() {
    ObjectMapper mapper = new ObjectMapper();
    Map<String, Object> nlpOutput = mapper.readValue(
        new File("docs/examples/production-infra.json"),
        Map.class
    );
    
    ModelGenerator modelGen = new ModelGenerator();
    Infrastructure infra = modelGen.createModel(nlpOutput);
    
    TerraformGenerator tfGen = new TerraformGenerator();
    String terraform = tfGen.generate(infra);
    
    // Vérifier et sauvegarder
    Files.write(Paths.get("output/production.tf"), terraform.getBytes());
}
```

### Méthode 3 : Script Python → Java

```bash
# 1. Générer JSON avec le parser NLP
python nlp/nlp_parser.py < input.txt > input.json

# 2. Utiliser le JSON dans votre code Java
```

## 📝 Structure des Exemples

Chaque exemple JSON suit cette structure :

```json
{
  "provider": "AWS|Azure|GCP",
  "resources": [
    {
      "type": "ResourceType",
      "name": "resource-name",
      // Propriétés spécifiques au type
    }
  ]
}
```

## ✅ Validation

Avant d'utiliser le code Terraform généré :

1. Vérifiez la syntaxe : `terraform fmt`
2. Validez le code : `terraform validate`
3. Planifiez l'infrastructure : `terraform plan`
4. Appliquez avec précaution : `terraform apply`

**⚠️ Attention :** Les exemples sont à des fins de démonstration. Adaptez-les à vos besoins avant de les utiliser en production.

