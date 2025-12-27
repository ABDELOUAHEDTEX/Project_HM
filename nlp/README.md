# NLP Module

This module parses natural language descriptions of cloud infrastructure into structured JSON.

## Installation

```bash
pip install -r requirements.txt
python -m spacy download en_core_web_sm
```

## Usage

```python
from nlp_parser import CloudInfraParser

parser = CloudInfraParser()
result = parser.parse("Create a web server on AWS with an EC2 instance and S3 bucket")
print(result)
```

## Example Output

```json
{
  "provider": "AWS",
  "resources": [
    {
      "type": "ComputeInstance",
      "name": "web-server",
      "os": "linux"
    },
    {
      "type": "StorageBucket",
      "name": "storage-bucket"
    }
  ]
}
```

## Running Demo

```bash
python nlp_parser.py
```

