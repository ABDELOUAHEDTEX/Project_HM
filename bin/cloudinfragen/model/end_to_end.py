"""
CloudInfraGen - End-to-End Integration
Intégration complète Phase 2 (NLP) → Phase 3 (Model)
"""

import sys
import os
import json

# Ajouter les chemins
sys.path.append(os.path.join(os.path.dirname(__file__), '..', 'nlp'))
sys.path.append(os.path.join(os.path.dirname(__file__), '..', 'model'))

from nlp_parser import CloudInfraParser
from model_generator import ModelGenerator


class CloudInfraGenPipeline:
    """Pipeline complet NLP → Model"""
    
    def __init__(self):
        self.parser = CloudInfraParser()
        self.generator = ModelGenerator()
    
    def process(
        self, 
        description: str, 
        model_name: str = "GeneratedInfra"
    ) -> dict:
        """
        Traitement complet : description → JSON → modèle
        
        Args:
            description: Description en langage naturel
            model_name: Nom du modèle à générer
            
        Returns:
            dict: Modèle complet au format dictionnaire
        """
        print("="*80)
        print("🚀 CLOUDINFRAGEN - PIPELINE COMPLET")
        print("="*80)
        
        # Phase 2: Parser NLP
        print("\n📝 PHASE 2: Natural Language Processing")
        print("-"*80)
        print(f"Input: {description}")
        
        parsed_json = self.parser.parse(description)
        print(f"\n✅ JSON parsé:")
        print(json.dumps(parsed_json, indent=2, ensure_ascii=False))
        
        # Phase 3: Model Generation
        print("\n🏗️  PHASE 3: Model Generation")
        print("-"*80)
        
        model = self.generator.generate(
            parsed_json,
            model_name=model_name,
            description=description
        )
        
        model_dict = model.to_dict()
        
        print(f"✅ Modèle généré: {model.name}")
        print(f"   Provider: {model.provider.value}")
        print(f"   Ressources: {len(model.get_all_resources())}")
        print(f"   Relations: {len(model.relations)}")
        
        return model_dict
    
    def save_model(self, model_dict: dict, output_file: str):
        """Sauvegarde le modèle en JSON"""
        with open(output_file, 'w', encoding='utf-8') as f:
            json.dump(model_dict, f, indent=2, ensure_ascii=False)
        print(f"\n💾 Modèle sauvegardé: {output_file}")


def demo_simple():
    """Démonstration simple"""
    pipeline = CloudInfraGenPipeline()
    
    description = "Je veux 2 serveurs EC2 t2.micro avec RDS MySQL"
    
    model = pipeline.process(description, model_name="SimpleWebApp")
    
    print("\n📋 MODÈLE FINAL")
    print("="*80)
    print(json.dumps(model, indent=2, ensure_ascii=False))


def demo_complex():
    """Démonstration complexe"""
    pipeline = CloudInfraGenPipeline()
    
    description = """
    Infrastructure e-commerce:
    - 5 serveurs EC2 t3.large avec Ubuntu
    - RDS MySQL db.m5.xlarge avec 500GB
    - S3 pour images et videos
    - Load balancer application avec HTTPS
    - Security group ports 80 et 443
    - VPC 10.0.0.0/16
    """
    
    model = pipeline.process(description, model_name="ECommerceInfra")
    
    # Sauvegarder
    pipeline.save_model(model, "ecommerce_model.json")
    
    return model


def demo_microservices():
    """Démonstration microservices"""
    pipeline = CloudInfraGenPipeline()
    
    description = """
    Architecture microservices:
    - EKS avec 20 pods
    - RDS PostgreSQL db.r5.large
    - DynamoDB pour cache
    - S3 pour logs et backup
    - API Gateway
    - VPC 172.16.0.0/16
    """
    
    model = pipeline.process(description, model_name="MicroservicesInfra")
    
    # Sauvegarder
    pipeline.save_model(model, "microservices_model.json")
    
    return model


def demo_interactive():
    """Mode interactif"""
    pipeline = CloudInfraGenPipeline()
    
    print("\n" + "="*80)
    print("🤖 CLOUDINFRAGEN - MODE INTERACTIF")
    print("="*80)
    print("\n💡 Décrivez votre infrastructure en langage naturel")
    print("   (tapez 'exit' pour quitter)\n")
    
    while True:
        description = input("📝 Votre description > ")
        
        if description.lower() in ['exit', 'quit', 'q']:
            print("\n👋 Au revoir !")
            break
        
        if not description.strip():
            continue
        
        try:
            # Demander le nom du modèle
            model_name = input("🏷️  Nom du modèle (ou Enter pour 'MyInfra') > ").strip()
            if not model_name:
                model_name = "MyInfra"
            
            # Générer
            model = pipeline.process(description, model_name)
            
            # Demander si on sauvegarde
            save = input("\n💾 Sauvegarder le modèle? (o/n) > ").strip().lower()
            if save == 'o':
                filename = input("📁 Nom du fichier (sans .json) > ").strip()
                if not filename:
                    filename = model_name.lower().replace(" ", "_")
                pipeline.save_model(model, f"{filename}.json")
            
            print("\n" + "-"*80 + "\n")
        
        except Exception as e:
            print(f"\n❌ Erreur: {e}\n")


def run_all_demos():
    """Exécute toutes les démonstrations"""
    print("\n🎬 DÉMONSTRATIONS CLOUDINFRAGEN")
    print("="*80)
    
    # Demo 1: Simple
    print("\n\n1️⃣ DEMO SIMPLE")
    print("="*80)
    demo_simple()
    
    # Demo 2: Complex
    print("\n\n2️⃣ DEMO COMPLEXE (E-COMMERCE)")
    print("="*80)
    demo_complex()
    
    # Demo 3: Microservices
    print("\n\n3️⃣ DEMO MICROSERVICES")
    print("="*80)
    demo_microservices()
    
    print("\n\n✅ Toutes les démonstrations terminées!")
    print("📁 Fichiers générés: ecommerce_model.json, microservices_model.json")


if __name__ == "__main__":
    import sys
    
    if len(sys.argv) > 1 and sys.argv[1] == "--interactive":
        demo_interactive()
    elif len(sys.argv) > 1 and sys.argv[1] == "--all":
        run_all_demos()
    else:
        # Par défaut: demo simple
        demo_simple()
        
        print("\n\n💡 Options disponibles:")
        print("   python end_to_end.py                 # Demo simple")
        print("   python end_to_end.py --all           # Toutes les demos")
        print("   python end_to_end.py --interactive   # Mode interactif")