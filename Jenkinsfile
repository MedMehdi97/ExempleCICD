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
                bat "mvn clean verify sonar:sonar -Dsonar.login=squ_04e2fa5b0b0266923a92be4d3a2d1caf68e4b493"
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