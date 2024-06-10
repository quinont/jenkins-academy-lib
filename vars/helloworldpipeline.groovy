def call() {
    pipeline {
        agent any
    
        stages {
            stage('Step de Hello') {
                steps {
                    script {
                        sh "echo Hola desde Shared Libraries"
                        //sh "echo Valor que se paso ${parametro.valor1}. O valor 2: ${parametro.valor2}."
                    }
                }
            }
        }
    }
}
