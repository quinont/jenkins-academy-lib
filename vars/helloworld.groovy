def call(Map parametro = [:]) {
    sh "echo Hola desde Shared Libraries"
    sh "echo Valor que se paso ${parametro.valor1}. O valor 2: ${parametro.valor2}."
}
