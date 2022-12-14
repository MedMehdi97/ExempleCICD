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
                bat "mvn clean verify sonar:sonar -Dsonar.login=SONAR_KEY"
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