package generator;

import cloudinfragen.Infrastructure;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Demo pour charger un JSON depuis un fichier et générer du Terraform.
 * 
 * Usage: java JsonFileDemo <input.json> [output.tf]
 */
public class JsonFileDemo {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java JsonFileDemo <input.json> [output.tf]");
            System.out.println("\nExemple:");
            System.out.println("  java JsonFileDemo docs/examples/example1.json output.tf");
            System.exit(1);
        }
        
        try {
            String inputFile = args[0];
            String outputFile = args.length > 1 ? args[1] : "output.tf";
            
            System.out.println("=".repeat(80));
            System.out.println("CloudInfraGen - JSON File Demo");
            System.out.println("=".repeat(80));
            System.out.println("Fichier d'entrée : " + inputFile);
            System.out.println("Fichier de sortie : " + outputFile);
            System.out.println();
            
            // Charger le JSON (format simple : Map)
            // Note: Pour un vrai parser JSON, ajoutez Jackson au pom.xml
            Map<String, Object> nlpOutput = loadSimpleJson(inputFile);
            
            // Étape 1: Générer le modèle EMF
            System.out.println("[Étape 1] Génération du modèle EMF...");
            ModelGenerator modelGen = new ModelGenerator();
            Infrastructure infra = modelGen.createModel(nlpOutput);
            
            System.out.println("✓ Modèle créé:");
            System.out.println("  Provider: " + infra.getProvider());
            System.out.println("  Ressources: " + infra.getResources().size());
            
            // Étape 2: Valider le modèle
            System.out.println("\n[Étape 2] Validation du modèle...");
            boolean isValid = modelGen.validateModel(infra);
            System.out.println("✓ Validation: " + (isValid ? "PASSÉ" : "ÉCHOUÉ"));
            
            if (!isValid) {
                System.err.println("⚠️  Le modèle n'est pas valide. Vérifiez les contraintes.");
            }
            
            // Étape 3: Générer Terraform
            System.out.println("\n[Étape 3] Génération du code Terraform...");
            TerraformGenerator tfGen = new TerraformGenerator();
            String terraform = tfGen.generate(infra);
            
            // Étape 4: Sauvegarder
            System.out.println("\n[Étape 4] Sauvegarde du code Terraform...");
            Files.write(Paths.get(outputFile), terraform.getBytes());
            System.out.println("✓ Code Terraform sauvegardé dans : " + outputFile);
            
            // Afficher un aperçu
            System.out.println("\n" + "=".repeat(80));
            System.out.println("Aperçu du code Terraform généré:");
            System.out.println("=".repeat(80));
            String[] lines = terraform.split("\n");
            int previewLines = Math.min(30, lines.length);
            for (int i = 0; i < previewLines; i++) {
                System.out.println(lines[i]);
            }
            if (lines.length > previewLines) {
                System.out.println("... (" + (lines.length - previewLines) + " lignes supplémentaires)");
            }
            System.out.println("=".repeat(80));
            
            System.out.println("\n✓ Génération terminée avec succès!");
            System.out.println("  Vous pouvez maintenant valider le code avec: terraform validate");
            
        } catch (Exception e) {
            System.err.println("❌ Erreur: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
    
    /**
     * Charge un JSON simple depuis un fichier.
     * Format attendu: JSON valide avec structure Map<String, Object>
     * 
     * Note: Cette implémentation est basique. Pour un vrai parser JSON,
     * ajoutez Jackson au pom.xml et utilisez ObjectMapper.
     */
    @SuppressWarnings("unchecked")
    private static Map<String, Object> loadSimpleJson(String filePath) throws IOException {
        // Pour l'instant, on utilise une approche simple
        // En production, utilisez Jackson ou Gson
        
        // Lire le fichier
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        
        // Parser JSON basique (pour démo)
        // En production, utilisez une vraie bibliothèque JSON
        System.out.println("⚠️  Note: Utilisez une bibliothèque JSON (Jackson) pour un vrai parsing.");
        System.out.println("   Pour l'instant, créez le Map manuellement dans le code.");
        
        // Retourner un exemple (à remplacer par un vrai parser)
        throw new UnsupportedOperationException(
            "Pour utiliser ce script, ajoutez Jackson au pom.xml:\n" +
            "<dependency>\n" +
            "    <groupId>com.fasterxml.jackson.core</groupId>\n" +
            "    <artifactId>jackson-databind</artifactId>\n" +
            "    <version>2.15.2</version>\n" +
            "</dependency>\n\n" +
            "Puis utilisez: ObjectMapper mapper = new ObjectMapper();\n" +
            "Map<String, Object> result = mapper.readValue(new File(filePath), Map.class);"
        );
    }
}

