import com.builds.Calculator

Calculator calculator = new  Calculator(this)

Pipeline {
    agent any 
    stages {
        stage {
            steps {
                script {
                    println calculator.add(3,4)
                }
                 }
        }
        
    }
}