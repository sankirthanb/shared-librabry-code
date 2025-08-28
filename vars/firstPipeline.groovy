import com.san.builds.Calculator


def call(Map pipelineparams) { 
    Calculator calculator = new  Calculator(this)
    pipeline {
        environment {
        App_name = ${pipelineparams.app_name}
        }
        agent any 
        stages {
            stage {
                steps {
                    script {
                        println calculator.add(3,4)
                        echo "this is sent by ${App_name}"
                    }
                 }
        }
        
    }
}

} 
// ### since someone is calling me, i expect paramters so am called piplein params


