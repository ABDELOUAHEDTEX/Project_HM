from nlp_parser import CloudInfraParser
import json

def main():
    parser = CloudInfraParser()
    
    print("="*80)
    print("🤖 CLOUDINFRAGEN - PARSER INTERACTIF")
    print("="*80)
    print("\n💡 Décrivez votre infrastructure en langage naturel")
    print("   (ou tapez 'exit' pour quitter)\n")
    
    while True:
        description = input("📝 Votre description > ")
        
        if description.lower() in ['exit', 'quit', 'q']:
            print("\n👋 Au revoir !")
            break
        
        if not description.strip():
            continue
        
        result = parser.parse(description)
        
        print("\n✅ Modèle généré:")
        print(json.dumps(result, indent=2, ensure_ascii=False))
        print("\n" + "-"*80 + "\n")

if __name__ == "__main__":
    main()