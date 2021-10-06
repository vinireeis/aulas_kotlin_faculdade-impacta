class Aluno(id: Int, nome: String, curso: String) {
    var id: Int
    var nome: String
    var curso: String

    init {
        this.id = id
        this.nome = nome
        this.curso = curso
    }

    fun listar_aluno() {
        println(
            "Nome: ${this.nome}\nCurso: ${this.curso}\nId: ${this.id}")
    }
}

fun main() {
    var aluno1 = Aluno(1, "Vinicius Dos Reis", "Sistemas de Informação")
    aluno1.listar_aluno()
}
