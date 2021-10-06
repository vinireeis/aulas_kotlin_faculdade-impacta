fun recalcular(percentual: Int, valor: Int): Int{
    var novo_salario: Int
    novo_salario = valor + (valor * percentual / 100)
    return novo_salario
}

fun main() {
    var percentual = 15
    println(recalcular(percentual, 3500))
}
