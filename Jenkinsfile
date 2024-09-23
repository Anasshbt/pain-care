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
      always {
                // Archiver les artefacts (par exemple, les fichiers .jar ou autres fichiers générés hmmmmm)
                archiveArtifacts artifacts: '**/build/libs/*.jar', allowEmptyArchive: true

                // Vous pouvez également archiver d'autres fichiers comme des logs ou des rapports personnalisés
                archiveArtifacts artifacts: '**/build/reports/**/*.*', allowEmptyArchive: true
            }

        success {
            echo 'Build et test réussis!'
        }
        failure {
            echo 'Échec du pipeline.'
        }
    }
}
