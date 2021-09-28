fun calcula(salario: Double, opcao: Int){

    when(opcao){
        1 -> println(salario + (salario * 0.30))
        2 -> println(salario + (salario * 0.40))
        3 -> println(salario + (salario * 0.60))
        4 -> println(salario + (salario * 0.60))
        else -> {
            println("Erro, digite uma opção válida")
        }
    }
}

fun main(){
    calcula(1100.0, 1)
    calcula(1100.0, 2)
    calcula(1100.0, 3)
    calcula(1100.0, 4)
    calcula(1100.0, 5)
}

    /*var opcao = 3 // para controlar o menu
    var dado = if(opcao == 1) 5 else -1
    var resultado = when (opcao){

        1 -> println("Café puro!")

        2 -> println("Café com Leite")

        3 -> {
            println("Leite")
            println("Da promoção")
        }

        else -> {
            println("Erro")
            println("escolha uma opção válida")
        }}

    println(resultado)}

*/
