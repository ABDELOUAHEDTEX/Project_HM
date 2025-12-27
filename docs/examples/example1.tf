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

resource "aws_vpc" "main-vpc" {
  cidr_block = "10.0.0.0/16"
  tags = {
    Name = "main-vpc"
  }
}

resource "aws_subnet" "public-subnet" {
  vpc_id                  = aws_vpc.main-vpc.id
  cidr_block              = "10.0.1.0/24"
  map_public_ip_on_launch = true
}

resource "aws_security_group" "web-sg" {
  name = "web-sg"
  ingress {
    # HTTP:80
    from_port   = 0
    to_port     = 65535
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

resource "aws_instance" "web-server" {
  ami           = "ami-0c55b159cbfafe1f0"
  instance_type = "t2.micro"
  key_name      = "default-key"
  vpc_security_group_ids = [aws_security_group.web-sg.id]
}

resource "aws_s3_bucket" "assets-bucket" {
  bucket = "assets-bucket"
  versioning {
    enabled = true
  }
}

resource "aws_db_instance" "app-database" {
  identifier         = "app-database"
  engine             = "mysql"
  engine_version      = "8.0"
  instance_class      = "db.t2.micro"
  allocated_storage  = 20
  multi_az           = false
}

