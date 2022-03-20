pipeline {
  tools {
    gradle 'Gradle'  
  }
  agent any
  stages {
    stage("Build") {
      steps {
        echo "Build stage"
        sh './gradlew -v'
      }
    }
    stage("Test") {
      steps {
        echo "Test stage 2"   
      }  
    }
    stage("Deploy") {
      steps {
        echo "Deploy stage"
      }
    }  
  }
  post {
    always {
      
    }
    success {
      
    }
    failure {
      
    }
  }
}
