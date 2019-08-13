pipeline {
    agent any

    tools {
        gradle "Gradle 5.0"
    }

    stages {

        stage ('Unit Test') {
            steps {
                sh "gradle clean test"
            }
        }

        stage ('Build') {
            steps {
                sh "gradle build -x test"
            }
        }

        stage('Static Code Analysis') {
            steps {
                withSonarQubeEnv('sonarqube') {
                    sh "gradle --info sonarqube -x test"
                }
            }
        }

        stage('Quality Gates') {
            steps {
                script{
                    timeout(time: 10, unit: 'MINUTES') { // Just in case something goes wrong, pipeline will be killed after a timeout
                        def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
                        if (qg.status != 'OK') {
                            error "Pipeline aborted due to quality gate failure: ${qg.status}"
                        }
                    }
                }
            }
        }
    }
}



