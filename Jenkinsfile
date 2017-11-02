pipeline {

    agent any

    stages {
        
        stage('Compile'){
            steps{
                // Wat uitleg
                echo "Compiling..."
                build job:'Compile Code'
            }
        }
        stage('Test'){
            steps{
                // Wat uitleg
                echo "Testing..."
                build job:'Test'
            }
        }
        stage('Deploy'){
            steps{
                // Wat uitleg
                echo "Deploying..."
                build job:'Deploy'
            }
        }
    }
}
