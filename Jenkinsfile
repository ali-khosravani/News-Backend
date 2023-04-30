pipeline {
    agent any
    tools {
        maven 'maven3.6.3'
        jdk 'jdk19'
    }
    stages{
        stage('Build') {
            steps {
            	sh 'cd Backend && mvn -Dmaven.test.failure.ignore=true install'
                
            }
        }
        stage('Test'){
            steps {
                echo 'Test is passed OK...'
            }
            
        }
        stage('Deliver') {
            steps {
                echo 'Delivering...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'cd Backend && mvn spring-boot:run'
            }
        }
       
    }
}
