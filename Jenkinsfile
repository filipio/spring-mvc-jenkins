   pipeline {
       agent any

       tools {
           maven "M3"
           jdk "JDK 1.8"
       }

       stages {
           stage('Build') {
               steps {
                   sh "mvn clean compile"
               }
           }
           stage('Test'){
               steps{
                   sh "mvn test"
               }
           }
           stage('Deploy'){
                steps{
                    sh "mvn clean heroku:deploy"
                }
           }
       }
   }