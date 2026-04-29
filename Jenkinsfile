pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                echo 'Cloning repository...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building with Maven...'
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Building Docker image...'
                bat 'docker build -t student-app .'
            }
        }

        stage('Run Container') {
            steps {
                echo 'Starting container...'
                bat 'docker stop student-app-container || true'
                bat 'docker rm student-app-container || true'
                bat 'docker run -d --name student-app-container -p 8080:8080 student-app'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                echo 'Deploying to Minikube...'
                bat 'kubectl apply -f k8s/deployment.yaml'
                bat 'kubectl apply -f k8s/service.yaml'
                bat 'kubectl rollout status deployment/student-app'
            }
        }
    }

    post {
        success { echo 'Pipeline completed successfully!' }
        failure { echo 'Pipeline failed. Check the logs.' }
    }
}
