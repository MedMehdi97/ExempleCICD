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
                withSonarQubeEnv(installationName: 'SonarQ1') {
                          bat './mvnw clean verify sonar:sonar'
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