#!/usr/bin/env python3
"""
CloudInfraGen NLP Parser
Parses natural language descriptions of cloud infrastructure into structured JSON.
"""

import re
import json
from typing import Dict, List, Any, Optional


class CloudInfraParser:
    """Rule-based parser for cloud infrastructure descriptions."""
    
    # Resource type mappings
    RESOURCE_PATTERNS = {
        'ComputeInstance': [
            r'\b(?:ec2|compute|instance|vm|virtual machine|server)\b',
            r'\b(?:web server|app server|application server)\b'
        ],
        'StorageBucket': [
            r'\b(?:s3|storage bucket|bucket|object storage)\b',
            r'\b(?:blob storage|container)\b'
        ],
        'DatabaseInstance': [
            r'\b(?:rds|database|mysql|postgresql|postgres|sql server|oracle)\b',
            r'\b(?:relational database|sql database)\b'
        ],
        'NoSQLDatabase': [
            r'\b(?:dynamodb|mongodb|cassandra|nosql|document database)\b'
        ],
        'VPC': [
            r'\b(?:vpc|virtual private cloud|network)\b'
        ],
        'Subnet': [
            r'\b(?:subnet|sub-network)\b'
        ],
        'SecurityGroup': [
            r'\b(?:security group|firewall|sg)\b'
        ],
        'LoadBalancer': [
            r'\b(?:load balancer|lb|elb|alb|nlb)\b'
        ],
        'ContainerService': [
            r'\b(?:ecs|eks|kubernetes|k8s|container|docker)\b',
            r'\b(?:container service|orchestration)\b'
        ],
        'Function': [
            r'\b(?:lambda|function|faas|serverless)\b',
            r'\b(?:azure function|cloud function)\b'
        ],
        'Volume': [
            r'\b(?:volume|disk|ebs|storage volume)\b'
        ],
        'FileSystem': [
            r'\b(?:efs|nfs|file system|shared storage)\b'
        ]
    }
    
    # Provider patterns
    PROVIDER_PATTERNS = {
        'AWS': [r'\baws\b', r'\bamazon\b'],
        'Azure': [r'\bazure\b', r'\bmicrosoft azure\b'],
        'GCP': [r'\bgcp\b', r'\bgoogle cloud\b', r'\bgoogle\b']
    }
    
    # Property extraction patterns
    PROPERTY_PATTERNS = {
        'name': r'(?:named|called|name is|name:)\s+([a-z0-9\-_]+)',
        'image': r'(?:image|ami|os)\s+(?:is|:)?\s*([a-z0-9\-_/:]+)',
        'engine': r'(?:engine|type)\s+(?:is|:)?\s*([a-z0-9\-_]+)',
        'cidr': r'(?:cidr|cidr block)\s+(?:is|:)?\s*([0-9.]+/[0-9]+)',
        'typeSubnet': r'\b(public|private)\s+subnet',
        'os': r'\b(linux|windows|ubuntu|debian|centos|rhel)\b',
        'region': r'\b(?:region|in)\s+([a-z0-9\-]+)',
        'size': r'\b([0-9]+)\s*(?:gb|tb|mb)\b'
    }
    
    def parse(self, text: str) -> Dict[str, Any]:
        """
        Parse natural language text into structured JSON.
        
        Args:
            text: Natural language description of infrastructure
            
        Returns:
            Dictionary with provider and resources
        """
        text_lower = text.lower()
        
        # Extract provider
        provider = self._extract_provider(text_lower)
        if not provider:
            provider = 'AWS'  # Default
        
        # Extract resources
        resources = self._extract_resources(text_lower, text)
        
        return {
            'provider': provider,
            'resources': resources
        }
    
    def _extract_provider(self, text: str) -> Optional[str]:
        """Extract cloud provider from text."""
        for provider, patterns in self.PROVIDER_PATTERNS.items():
            for pattern in patterns:
                if re.search(pattern, text, re.IGNORECASE):
                    return provider
        return None
    
    def _extract_resources(self, text_lower: str, original_text: str) -> List[Dict[str, Any]]:
        """Extract resource types and properties from text."""
        resources = []
        resource_names = set()
        
        for resource_type, patterns in self.RESOURCE_PATTERNS.items():
            for pattern in patterns:
                matches = re.finditer(pattern, text_lower, re.IGNORECASE)
                for match in matches:
                    # Extract properties for this resource
                    resource = self._create_resource(
                        resource_type, 
                        match.start(), 
                        original_text,
                        resource_names
                    )
                    if resource:
                        resources.append(resource)
                        resource_names.add(resource.get('name', resource_type.lower()))
        
        # If no resources found, try to infer from context
        if not resources:
            resources = self._infer_resources(text_lower, original_text)
        
        return resources
    
    def _create_resource(
        self, 
        resource_type: str, 
        position: int, 
        text: str,
        existing_names: set
    ) -> Optional[Dict[str, Any]]:
        """Create a resource dictionary with extracted properties."""
        # Extract name
        name = self._extract_property('name', text, position)
        if not name:
            # Generate unique name
            base_name = resource_type.lower().replace('instance', '').replace('service', '')
            counter = 1
            name = f"{base_name}-{counter}"
            while name in existing_names:
                counter += 1
                name = f"{base_name}-{counter}"
        
        resource = {
            'type': resource_type,
            'name': name
        }
        
        # Extract type-specific properties
        if resource_type == 'ComputeInstance':
            os = self._extract_property('os', text, position)
            if os:
                resource['os'] = os
            image = self._extract_property('image', text, position)
            if image:
                resource['image'] = image
        
        elif resource_type == 'DatabaseInstance':
            engine = self._extract_property('engine', text, position)
            if engine:
                resource['engine'] = engine
            else:
                # Try to infer from context
                if re.search(r'\bmysql\b', text, re.IGNORECASE):
                    resource['engine'] = 'mysql'
                elif re.search(r'\bpostgres\b', text, re.IGNORECASE):
                    resource['engine'] = 'postgresql'
        
        elif resource_type == 'VPC':
            cidr = self._extract_property('cidr', text, position)
            if cidr:
                resource['cidr'] = cidr
            else:
                resource['cidr'] = '10.0.0.0/16'  # Default
        
        elif resource_type == 'Subnet':
            cidr = self._extract_property('cidr', text, position)
            if cidr:
                resource['cidr'] = cidr
            type_subnet = self._extract_property('typeSubnet', text, position)
            if type_subnet:
                resource['typeSubnet'] = type_subnet
            else:
                resource['typeSubnet'] = 'public'  # Default
        
        elif resource_type == 'StorageBucket':
            # No specific properties needed
        
        elif resource_type == 'NoSQLDatabase':
            engine = self._extract_property('engine', text, position)
            if engine:
                resource['engine'] = engine
        
        return resource
    
    def _extract_property(self, prop_name: str, text: str, position: int) -> Optional[str]:
        """Extract a specific property from text near the given position."""
        # Search in a window around the position
        window_start = max(0, position - 200)
        window_end = min(len(text), position + 200)
        window = text[window_start:window_end]
        
        pattern = self.PROPERTY_PATTERNS.get(prop_name)
        if pattern:
            match = re.search(pattern, window, re.IGNORECASE)
            if match:
                return match.group(1) if match.groups() else match.group(0)
        
        return None
    
    def _infer_resources(self, text_lower: str, original_text: str) -> List[Dict[str, Any]]:
        """Infer resources from context when explicit mentions are missing."""
        resources = []
        
        # Common patterns
        if 'web server' in text_lower or 'application' in text_lower:
            resources.append({
                'type': 'ComputeInstance',
                'name': 'web-server',
                'os': 'linux'
            })
        
        if 'database' in text_lower:
            resources.append({
                'type': 'DatabaseInstance',
                'name': 'database',
                'engine': 'mysql'
            })
        
        if 'storage' in text_lower or 'bucket' in text_lower:
            resources.append({
                'type': 'StorageBucket',
                'name': 'storage-bucket'
            })
        
        if 'vpc' in text_lower or 'network' in text_lower:
            resources.append({
                'type': 'VPC',
                'name': 'vpc',
                'cidr': '10.0.0.0/16'
            })
        
        return resources


def main():
    """Demo function with example inputs."""
    parser = CloudInfraParser()
    
    examples = [
        "Create a web server on AWS with an EC2 instance, an S3 bucket, a MySQL database, inside a VPC with a public subnet",
        "I need a Linux server with PostgreSQL database and storage bucket on Azure",
        "Set up a Kubernetes cluster with load balancer and private subnet in GCP"
    ]
    
    print("=" * 80)
    print("CloudInfraGen NLP Parser - Demo")
    print("=" * 80)
    
    for i, example in enumerate(examples, 1):
        print(f"\nExample {i}:")
        print(f"Input: {example}")
        result = parser.parse(example)
        print(f"Output:")
        print(json.dumps(result, indent=2))
        print("-" * 80)


if __name__ == '__main__':
    main()

