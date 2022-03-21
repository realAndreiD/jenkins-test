pipeline {
  tools {
    gradle 'Gradle'  
  }
  agent any
  environment {
      NEW_VERSION = '1.3.0'
  }
  stages {
    stage("Build") {
        when {
          expression {
              //${NEW_VERSION} == '1.3.0'
          }
        }
      steps {
        echo "Build stage for version ${NEW_VERSION}"
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
      echo "Always"
    }
    success {
      echo "Success"
    }
    failure {
      echo "Failure"
    }
  }
}
