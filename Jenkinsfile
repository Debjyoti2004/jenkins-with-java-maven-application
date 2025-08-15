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

        stage('Deploy & View Logs') {
            steps {
                dir('jenkins-with-java-maven-application') {
                    sh '''
                        echo "Starting the application and capturing logs..."
                        
                        # Start the app in the background, sending all output to app.log
                        nohup java -jar target/*.jar > app.log 2>&1 &
                        
                        echo "Waiting for 10 seconds for the app to start..."
                        sleep 10
                        
                        echo "--- Application Startup Log ---"
                        # Print the log file to the Jenkins console
                        cat app.log
                    '''
                }
            }
        }
    }
    post {
        always {
            echo 'Cleaning up workspace...'
            cleanWs()
        }
    }
}