# E-commerce Microservices Project

## 🚀 Project Overview

This project implements a simplified e-commerce platform using a microservices architecture. Each service is built with Spring Boot, containerized using Docker, and orchestrated with Kubernetes (k3s) using Helm charts for deployment. The setup is designed for local development and testing, providing a robust environment to run and manage the individual services.

The goal is to demonstrate a modern cloud-native application development workflow, from local build to containerization and Kubernetes deployment.

## ✨ Features

* **User Service:** Manages user authentication and profiles.
* **Order Service:** Handles order creation and management.
* **Payment Service:** Processes payments for orders.
* **Inventory Service:** Manages product stock and availability.
* **API Gateway (Placeholder):** Entry point for external clients (planned for future).
* **Service Discovery (Implicit with Kubernetes):** Services discover each other via Kubernetes DNS.
* **Centralized Logging & Monitoring (Planned):** Integration with logging and monitoring solutions.

## 🛠️ Technologies Used

* **Backend:** Java 17+, Spring Boot 3+
* **Build Tool:** Apache Maven
* **Containerization:** Docker
* **Container Orchestration:** Kubernetes (k3s)
* **Deployment:** Helm
* **Database:** (Placeholder, e.g., MySQL, PostgreSQL, H2 for local testing)
* **API Communication:** RESTful APIs
* **Scripting:** Bash

## 📂 Project Structure

ecom-microservices-project/
├── .env                  # Environment variables for local setup (ignored by Git)
├── .gitignore            # Git ignore file
├── deploy_local.sh       # Script for building, pushing, and deploying services
├── README.md             # This file
├── user-service/         # User Management Microservice
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
│   └── helm/user-service/ # Helm chart for user-service
│       ├── templates/
│       └── values.yaml
├── order-service/        # Order Management Microservice
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
│   └── helm/order-service/ # Helm chart for order-service
│       ├── templates/
│       └── values.yaml
├── payment-service/      # Payment Processing Microservice
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
│   └── helm/payment-service/ # Helm chart for payment-service
│       ├── templates/
│       └── values.yaml
├── inventory-service/    # Inventory Management Microservice
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
│   └── helm/inventory-service/ # Helm chart for inventory-service
│       ├── templates/
│       └── values.yaml
└── # ... other services/components