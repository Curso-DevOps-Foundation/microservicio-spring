node {
  stage('Build'){
    checkout scm
    sh "chmod 777 gradlew"
     sh "./gradlew build"
  }
  
  stage('Test'){
  sh "./gradlew clean test"
  }
  
  stage('Sonar') {
    withSonarQubeEnv() { 
      sh "${scannerHome}/bin/sonar-scanner"
    }
  }
}
