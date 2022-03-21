def gv
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
      string(name:'TITLE', defaultValue:'my-app', description:'something')
      choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'somthing')
      booleanParam(name: 'executeTests', defaultValue: true, description: 'somethiing')
  }
  stages {
    stage("Init") {
        steps {
            script {
                gv = load "script.groovy"
            }
        }
    }
    stage("Build") {
        when {
          expression {
              GIT_BRANCH == 'main'
          }
        }
      steps {
          script {
              gv.buildApp()
          }
      }
    }
    stage("Test") {
      when {
          expression {
              params.executeTests == true
          }
      }
      steps {
          script {
              gv.testApp()
          }
      }  
    }
    stage("Deploy") {
      steps {
        script {
            gv.deployApp()
        }
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
