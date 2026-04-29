# Student DevOps Java App

This project is a simple Java Spring Boot REST API created for the CSEB5143 DevOps: Tools and Technologies class project.

The purpose of this project is to demonstrate a basic DevOps workflow where a Java application is built using Maven, containerized using Docker, automated using Jenkins, and deployed using Kubernetes.

## Application Endpoints

| Endpoint | Description |
|---|---|
| `/` | Displays a welcome message |
| `/health` | Displays the application health status |

## Tools Used

- Git and GitHub for version control
- Maven for build automation
- Jenkins for CI/CD pipeline automation
- Docker for containerization
- Kubernetes for deployment

## Project Structure

```devops-spring-boot-app/
├── src/
│   └── main/java/com/yourpackage/
│       ├── Application.java
│       └── StudentController.java
├── k8s/
│   ├── deployment.yaml
│   └── service.yaml
├── Dockerfile
├── Jenkinsfile
├── pom.xml
└── README.md
