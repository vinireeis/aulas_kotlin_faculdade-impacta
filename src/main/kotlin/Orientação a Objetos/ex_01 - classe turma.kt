class Turma(id_turma: Int, nome: String, qtd_alunos: Int){
    val id_turma: Int
    var nome: String
    var qtd_alunos: Int

    init {
        this.id_turma = id_turma
        this.nome = nome
        this.qtd_alunos = qtd_alunos
    }
}

fun main (args:Array<String>){
    val turma1 = Turma(10, "SI3B", 15)
    println(turma1)
    println("ID da turma: ${turma1.id_turma}, Nome da turma: ${turma1.nome}, quantidade alunos ${turma1.qtd_alunos}")
}
/**class Turma(id: Int, nome: String, qtdAlunos:Int) {
    init {
        println("ID: $id \nNome: $nome\nQuantidade de alunos:$qtdAlunos")
    }
}
fun main() {
    var obj = Turma(2, "ADS/SI", 70)
}*/