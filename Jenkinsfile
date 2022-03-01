pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'echo #nowar'
                bat 'mvn clean install'
                bat 'echo test multiple steps'
            }
        }
    }
}