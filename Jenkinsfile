pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                javac 'helu.java'
                java 'helu'
            }
        }
    }
}