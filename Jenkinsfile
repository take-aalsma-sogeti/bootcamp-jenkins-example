#!groovy

node{
 
    agent any
    
    stages{
        
        stage('Compile'){
            steps {
                //this is a comment
                echo 'Compiling ...'
                build job:'Compile Code'
            }
        }
        
        stage('Test'){
            steps{
                echo 'Testing...'
                build job:'Test'
            }
        stage('Deploy'){
            steps{
                echo 'Deploying...'
                build job:'Deploy'
            }
        }
        
    }
    
}