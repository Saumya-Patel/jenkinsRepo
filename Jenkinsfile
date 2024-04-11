pipeline {
    agent any
    tools {
        maven "maven_home"
    }
    stages {
        // stage('Build') {
        //     steps {
        //         // Clean and build the Maven project
        //         sh 'mvn clean install -U'
        //     }
        // }
        stage('Build') {
            steps {
                script {
                   bat 'mvn clean package'
                  // bat 'cd DevOps && mvn package' 
                }
            }
        }
        stage('Test') {
            steps {
                // Run tests
                bat 'mvn test'
            }
        }
        
        stage('Clean Up') {
            steps {
                // Clean up any temporary files or resources
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
