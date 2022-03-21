pipeline {
  tools {
    gradle 'Gradle'  
  }
  agent any
  environment {
      NEW_VERSION = '1.3.0'
      SERVER_CREDENTIALS = credentials('my-credentials')
  }
  stages {
    stage("Build") {
        when {
          expression {
              GIT_BRANCH == 'main'
          }
        }
      steps {
        echo "Build stage for version ${NEW_VERSION}"
      }
    }
    stage("Test") {
      steps {
        echo "Test stage 2"
        echo "Credentials ${SERVER_CREDENTIALS}"
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
