def call(Map params = [:]) {
    pipeline {
        agent any
    
        stages {
            stage('Step de Hello') {
                steps {
                    script {
                        sh "echo Hola desde Shared Libraries"
                        sh "echo Valor que se paso ${params.valor1}. O valor 2: ${params.valor2}."
                    }
                }
            }
        }
    }
}
