node {
  stage('Build'){
    figlet "Build"
    checkout scm
    sh "chmod 777 gradlew"
     sh "./gradlew build"
  }
  
  stage('Test'){
    figlet "Test"
    sh "./gradlew clean test"
  }
  
  stage('Sonar') {
    figlet "Sonar"
    withSonarQubeEnv() { 
      sh "./gradlew sonarqube"
    }
  }
}
