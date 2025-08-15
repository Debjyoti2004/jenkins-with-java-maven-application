pipeline {
    agent any

    tools {
        maven 'maven-tool'
    }
    
    stages {
        stage('Clone Repository') {
            steps {
                sh 'rm -rf jenkins-with-java-maven-application'
                
                sh 'git clone https://github.com/Debjyoti2004/jenkins-with-java-maven-application.git'
            }
        }

        stage('Build') {
            steps {
                dir('jenkins-with-java-maven-application') {
                    sh 'mvn clean package'
                }
            }
        }
    }
}