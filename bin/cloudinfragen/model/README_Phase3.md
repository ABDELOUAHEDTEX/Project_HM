# Phase 3 - Model Generation

## Installation
```bash
# 1. Créer le dossier
mkdir model
cd model

# 2. Copier les fichiers
# - metamodel.py
# - model_generator.py
# - test_model.py

# 3. Pas de dépendances supplémentaires !
# (utilise juste Python standard)
```

## Test
```bash
# Tester le méta-modèle
python metamodel.py

# Tester le générateur
python model_generator.py

# Tester l'intégration complète
cd ..
python end_to_end.py

# Mode interactif
python end_to_end.py --interactive
```

## Utilisation
```python
# Depuis Phase 2 vers Phase 3
from nlp_parser import CloudInfraParser
from model_generator import ModelGenerator

# Parser
parser = CloudInfraParser()
json_data = parser.parse("3 EC2 t2.medium avec MySQL")

# Générer le modèle
generator = ModelGenerator()
model = generator.generate(json_data, "MyInfra")

# Sauvegarder
import json
with open("model.json", "w") as f:
    json.dump(model.to_dict(), f, indent=2)
```

---

## 🎯 **Prochaines Étapes**

1. ✅ **Copier les fichiers** dans votre projet
2. ✅ **Tester** : `python test_model.py`
3. ✅ **Intégrer** : `python end_to_end.py`
4. 🔜 **Phase 4** : Code Generation (Terraform, AWS CLI)

Voulez-vous que je vous aide à tester tout ça ? 🚀