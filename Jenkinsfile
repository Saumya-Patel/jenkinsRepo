pipeline {
    agent any
    tools {
        maven "maven_home"
    }
    stages {
        stage('Build') {
            steps {
                script {
                    bat 'mvn clean package'
                }
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Clean Up') {
            steps {
                bat 'mvn clean'
            }
        }
    }
    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}

