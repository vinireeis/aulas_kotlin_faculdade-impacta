
class Aluno(id: Int, nome: String, notas: List<Double>){
    init {
        println("ID: $id, Nome aluno: $nome, notas: $notas")
    }
}

fun main(){
    val lista_notas = arrayListOf<Double>()
    lista_notas.add(10.0)
    lista_notas.add(5.6)
    lista_notas.add(9.1)
    lista_notas.add(6.7)
    lista_notas.add(7.5)
    lista_notas.add(7.5)
    lista_notas.add(3.0)
    lista_notas.add(8.0)
    lista_notas.add(9.2)
    lista_notas.add(6.5)

    var aluno1 = Aluno(1,"Vinicius Reis", lista_notas)
}

/* class Aluno(id: Int, nome: String) {
val lista = arrayListOf<Double>()
    init {
    lista.add(5.2)
    lista.add(3.3)
    lista.add(7.2)
    lista.add(7.1)
    lista.add(8.3)
    lista.add(1.1)
    lista.add(1.2)
    lista.add(1.3)
    lista.add(1.8)
    lista.add(9.3)

    exibeLista(lista, id, nome)
    }

fun <T> exibeLista(lista: ArrayList<T>, id:Int, nome:String) {
 var valor:Double = 1.0
    println("O aluno: $id, de nome:$nome, teve as seguintes notas")
 for (valor in lista){
  println(valor)
 }
}
}

fun main() {
    var obj = Aluno(2, "Fabio")
}
 */

