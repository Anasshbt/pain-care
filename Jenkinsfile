pipeline {
    agent any

    tools {
        gradle 'Gradle' // Assurez-vous que "Gradle" correspond au nom de l'installation configurée dans Jenkins
    }

    stages {
        stage('Build') {
            steps {
                bat 'gradlew clean build'
            }
        }
        stage('Test') {
            steps {

                bat 'gradlew test'
            }
        }
    }

    post {
        success {
            echo 'Build and tests succeeded!'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}
