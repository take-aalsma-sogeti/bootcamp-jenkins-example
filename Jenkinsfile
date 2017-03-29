#!groovy

node('master') {
 stage 'Checkout'
 checkout scm

 def mvnHome = tool 'M3'

 stage 'Compile'
 sh "${mvnHome}/bin/mvn clean compile"

 stage 'Test'
 sh "${mvnHome}/bin/mvn clean test"
}