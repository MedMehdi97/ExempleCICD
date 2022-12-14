pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat "mvn compile"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test -Punit"
            }
        }
        stage('Quality'){
            steps {
                withSonarQubeEnv(installationName: 'sq1') {
                          bat './mvnw clean varify sonar:sonar'
                }
            }
        }
        stage('Package') {
            steps {
                bat "mvn package"
                bat "docker build -t exemplecicd ."
            }
        }
    }
}