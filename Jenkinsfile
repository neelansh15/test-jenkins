pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'About to run java!'
                javac helu.java
                java helu
                echo 'Finished compiling and running java'
            }
        }
    }
}
