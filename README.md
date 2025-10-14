# 🧠 CloudInfraGen – Natural Language to Cloud Infrastructure Generator

## 🚀 Project Overview

**CloudInfraGen** is a VS Code extension that enables developers to **describe cloud infrastructure in natural language**  
(e.g., *“I want an EC2 web server with a MySQL database and an S3 bucket for images”*)  
and automatically generates an **abstract infrastructure model** that can later be transformed into multiple  
Infrastructure as Code (IaC) formats — such as Terraform, AWS CLI, or CloudFormation.

This project follows a **Model-Driven Engineering (MDE)** approach:
> User description → Model conforming to a meta-model → Transformation into deployable infrastructure code.

---

## 🎯 Objectives

- Simplify cloud infrastructure creation using natural language.  
- Reduce manual configuration errors and deployment time.  
- Seamlessly integrate infrastructure generation within **Visual Studio Code**.  
- Design a **cloud meta-model** that can support multiple providers (AWS, Azure, GCP…).  

---

## 🏗️ Technical Vision
Natural language description
↓
NLP analysis → Extraction of cloud entities
↓
Generation of an abstract model (conforming to meta-model)
↓
Model transformation (M2T / M2M)
↓
Infrastructure as Code (Terraform, AWS CLI, YAML…)

---

## ⚙️  Technologies

| Component | Possible Technologies |
|------------|------------------------|
| VS Code Extension | TypeScript + VS Code API |
| NLP Engine | Python (SpaCy / Transformers) or Node.js (NLP.js) |
| MDE Engine | EMF, PyEcore, or custom framework |
| Code Generation | M2T / Terraform Templates / AWS CLI |
| Visualization | Mermaid.js, Draw.io API |
| Model Storage | JSON / XMI |

---

## 🧩 Project Phases (6 Stages)

### **Phase 1 — Meta-model Design**
- Identify the key cloud infrastructure concepts (Compute, Database, Storage, Network, SecurityGroup…).  
- Define relationships and constraints between these concepts.  
- Formalize the **CloudInfraGen Meta-Model** (UML or Ecore).  
**Deliverables:**  
  - Meta-model diagram  
  - Conceptual documentation  

---

### **Phase 2 — Natural Language Processing (NLP) Module**
- Study NLP options: SpaCy, Transformers, NLP.js.  
- Define the entities to extract (resource type, properties, provider…).  
- Build a prototype that takes a natural language description and outputs a structured JSON.  
**Deliverables:**  
  - Python/Node.js parsing script  
  - Example input/output JSON  

---

### **Phase 3 — Model Generation (Model Conformance)**
- Convert NLP output into a **model instance** that conforms to the meta-model.  
- Validate semantic relationships and dependencies.  
**Deliverables:**  
  - JSON or XMI representation of the model  
  - Conversion function (NLP → Model)  

---

### **Phase 4 — Model Transformations (M2T / M2M)**
- Define transformation rules:
  - **M2T:** Model to Terraform / AWS CLI / YAML code.  
  - **M2M:** Model to provider-specific models.  
- Implement a first Terraform generator as proof of concept.  
**Deliverables:**  
  - Transformation rules  
  - Generated example output  

---

### **Phase 5 — VS Code Extension Development**
- Build the VS Code plugin:
  - User interface (text input, command palette, model preview).  
  - Communication with NLP and generation modules.  
- Optional: **graphical preview** of the generated architecture.  
**Deliverables:**  
  - Functional prototype  
  - Workflow demo (screenshots or short video)  

---

### **Phase 6 — Validation, Testing & Documentation**
- End-to-end validation (text → model → code).  
- Evaluate NLP accuracy and generated code correctness.  
- Write the **final documentation**:
  - Technical report  
  - User guide  
  - README & demo examples  
**Deliverables:**  
  - Test results  
  - Full documentation package  

---

## 📂 Recommended Project Structure
CloudInfraGen/
│
├── README.md
├── docs/
│ ├── metamodel/
│ ├── transformations/
│ └── examples/
│
├── nlp/
│ └── prototype.py
│
├── model/
│ ├── metamodel.json
│ └── generator/
│
├── vscode-extension/
│ ├── src/
│ └── package.json
│
└── tests/




---

## 🧭 Roadmap Overview

- [ ] Phase 1 — Meta-model Design  
- [ ] Phase 2 — NLP Prototype  
- [ ] Phase 3 — Model Generation  
- [ ] Phase 4 — IaC Code Generation  
- [ ] Phase 5 — VS Code Extension  
- [ ] Phase 6 — Testing & Documentation  

---

## 👥 Team 
# ABDELOUAHED AKABBAB


## 📄 License

Academic project developed as part of the **Final SEMESTER Project** – ENSIAS 2025.  
Free to use for educational and research purposes.

---


