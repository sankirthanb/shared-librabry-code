import com.san.builds.Calculator

def call(Map pipelineparams) {
    Calculator calculator = new Calculator(this)
    
    // The pipeline block must be at the top level of the script
    pipeline {
        agent any
        environment {
            // Correct way to assign an environment variable from a parameter
            APP_NAME = "${pipelineparams.app_name}"
        }
        stages {
            stage('My Stage') {
                steps {
                    script {
                        println calculator.add(3, 4)
                        echo "This is sent by ${env.APP_NAME}"
                    }
                }
            }
        }
    }
}
