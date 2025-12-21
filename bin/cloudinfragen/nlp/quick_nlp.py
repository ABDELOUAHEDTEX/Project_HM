from nlp_parser import CloudInfraParser

parser = CloudInfraParser()

# Votre test
text = "Je veux 3 serveurs EC2 t2.medium avec MySQL et S3 pour images"
result = parser.parse(text)

print("Input:", text)
print("\nOutput:", result)