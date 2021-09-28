fun exibir(valor: Int) {

    if (valor > 1000 || valor < 100){
    }
    if(valor in 101..999){
        println("O valor $valor está dentro do range solicitado")
    }
}

fun main(){
    val n1: Int = 1100
    val n2: Int = 500
    val n3: Int = 60

    exibir(n1)
    exibir(n2)
    exibir(n3)
}