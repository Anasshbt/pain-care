pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    bat './gradlew clean build'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    bat './gradlew test'
                }
            }
        }

    }
    post {

        success {
            echo 'Build et test réussis!'
        }
        failure {
            echo 'Échec du pipeline.'
        }
    }
}
