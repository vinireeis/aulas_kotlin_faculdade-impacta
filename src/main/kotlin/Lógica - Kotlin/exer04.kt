fun calcula(deposito: Double) {
    var rendimento: Double = deposito + (deposito * 0.013)
    println("Após 1 mês o seu novo saldo será de: $rendimento")
}

fun main(){
    calcula(3800.0)
}