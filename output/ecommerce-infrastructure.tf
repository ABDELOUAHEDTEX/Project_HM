terraform {
  required_version = ">= 1.0"
}

provider "aws" {
  region = var.region
}

variable "region" {
  description = "AWS region"
  type        = string
  default     = "us-east-1"
}

resource "aws_vpc" "ecommerce-vpc" {
  cidr_block = "10.0.0.0/16"
  tags = {
    Name = "ecommerce-vpc"
  }
}

resource "aws_security_group" "web-sg" {
  name = "web-sg"
  ingress {
    # HTTP:80
    # HTTPS:443
    from_port   = 0
    to_port     = 65535
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

resource "aws_security_group" "db-sg" {
  name = "db-sg"
  ingress {
    # MySQL:3306
    from_port   = 0
    to_port     = 65535
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

resource "aws_instance" "web-server-template" {
  ami           = "ami-0c55b159cbfafe1f0"
  instance_type = "t2.micro"
  key_name      = "default-key"
  vpc_security_group_ids = [web-sg.id]
  tags = {
    "Role" = "WebServer"
  }
}

resource "aws_autoscaling_group" "web-asg" {
  min_size         = 2
  max_size         = 6
  launch_template {
    id = web-server-template.id
  }
}

resource "aws_db_instance" "ecommerce-db" {
  identifier = "ecommerce-db"
  engine     = "mysql"
  engine_version = "8.0.35"
  instance_class = "db.t2.micro"
  allocated_storage = 100
  multi_az = true
}

resource "aws_dynamodb_table" "shopping-cart" {
  name     = "shopping-cart"
  hash_key = "id"
  attribute {
    name = "id"
    type = "S"
  }
}

resource "aws_s3_bucket" "product-images" {
  bucket = "product-images"
  versioning {
    enabled = true
  }
}

resource "aws_lambda_function" "order-processor" {
  function_name = "order-processor"
  runtime       = "python3.11"
}

