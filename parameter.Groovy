import hudson.model.*
import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import java.net.URL

  parameters {
    choice(name: 'version',
      choices: '20.08\n20.08.01\n20.08.02\n20.08.03',)
    }
  stages {
    stage('Example') {
      steps {
        echo "Trying: ${version}"
      }
    }
  }
