def call(Map params = [:]) {
    sh "echo Hola desde Shared Libraries"
    sh "echo Valor que se paso ${params.valor1}. O valor 2: ${params.valor2}."
}
