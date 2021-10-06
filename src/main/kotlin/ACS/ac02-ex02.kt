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
            "Curso: ${this.curso}\nId: ${this.id}\nO nome do aluno: ${this.nome}")
    }
}

    fun main() {
        var obj1 = Aluno(1, "Vinicius Reis", "Sistemas de Informação")
        obj1.listar_aluno()

    }