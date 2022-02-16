pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'About to compile and run java!'
                javac helu.java
                java helu
                echo 'Finished compiling and running java'
            }
        }
    }
}
