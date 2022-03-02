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

    post {
            always {
                echo 'This will always run'
                archiveArtifacts artifacts: '**/target/**/*.jar', fingerprint: true
                junit '**/target/surefire-reports/*.xml'
            }
            success {
                echo 'This will run only if successful'
            }
            failure {
                echo 'This will run only if failed'
            }
            unstable {
                echo 'This will run only if the run was marked as unstable'
            }
            changed {
                echo 'This will run only if the state of the Pipeline has changed'
                echo 'For example, if the Pipeline was previously failing but is now successful'
            }
    }
}