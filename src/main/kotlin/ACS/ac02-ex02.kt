class Aluno(id: Int, nome: String, curso: String) {
    var id: Int
    var nome: String
    var curso: String

    init {
        this.id = id
        this.nome = nome
        this.curso = curso
    }
}

fun main() {
    var aluno1 = Aluno(1, "Vinicius Dos Reis Oliveira", "Sistemas de Informação")
    println("Id: ${aluno1.id}\nNome: ${aluno1.nome}\nCurso: ${aluno1.curso}\n")
}