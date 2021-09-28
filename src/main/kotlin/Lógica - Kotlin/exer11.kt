
fun qtd_impar_par (){
    var somapares: Int = 0
    var qtdimpares: Int = 0
    for (x in 1..800){
        if (x % 2 == 0){
            somapares += x
        }
        else {
            qtdimpares ++
        }
    }
    println("Soma pares: $somapares")
    println("Quantidade de Impares: $qtdimpares")
}

fun main(){
    qtd_impar_par()
}