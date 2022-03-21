pipeline {
  tools {
    gradle 'Gradle'  
  }
  agent any
  environment {
      NEW_VERSION = '1.3.0'
      SERVER_CREDENTIALS = credentials('my-credentials')
  }
  parameters {
      string(name:'VERSION', defaultValue:'1.0', description:'something')
      choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'somthing')
      booleanParam(name: 'executeTests', defaultValue: true, description: 'somethiing')
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
      when {
          expression {
              params.executeTests == true
          }
      }
      steps {
        echo "Test stage 2 executed"
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
