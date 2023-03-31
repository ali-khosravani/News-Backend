pipeline {
    agent any
    tools {
        maven 'maven3.6.3'
        jdk 'jdk19'
    }
    stages{
        stage('Build') {
            steps {
                sh './mvnw clean install -DskipTest'
            }
        }
        stage('Test'){
            steps {
                sh './mvnw test -Punit'
            }
        }
        stage('Deliver') {
            steps {
                echo 'Delivering...'
            }
        }
        stage('Deploy') {
            steps {
                sh 'mvn spring-boot:run'
            }
        }
    }
}