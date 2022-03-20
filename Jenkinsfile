CODE_CHANGES = true
pipeline {
  tools {
    gradle 'Gradle'  
  }
  agent any
  stages {
    stage("Build") {
        when {
          expression {
              BRANCH_NAME == 'dev' && CODE_CHANGES == true
          }
        }
      steps {
        echo "Build stage"
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
