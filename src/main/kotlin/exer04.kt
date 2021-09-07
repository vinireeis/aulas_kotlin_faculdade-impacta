fun calcula(deposito: Double) {
    var rendimento: Double = deposito + (deposito * 0.013)
    println(rendimento)
}

fun main(){
    calcula(3800.0)
}