pipeline {
    agent any
    tools {
        maven "maven_home"
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building the Maven project...'
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }

        stage('Clean') {
            steps {
                echo 'Cleaning up...'
                sh 'mvn clean'
            }
        }

        stage('Deploy') {
    steps {
        echo 'Deploying the artifact...'
        bat 'start mvn deploy'
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

