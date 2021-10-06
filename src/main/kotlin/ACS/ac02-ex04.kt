class Aluno(nome: String, id: Int, ){
    var nome: String
    var id: Int

    init{
        this.nome = nome
        this.id = id
    }
}

class Turma(curso: String, id: Int, ){
    var curso: String
    var id: Int

    init{
        this.curso = curso
        this.id = id
    }
}

class Professor(nome: String, id: Int, ){
    var nome: String
    var id: Int

    init{
        this.nome = nome
        this.id = id
    }
}

fun main(){
    var obj: Any? = Turma("SI", 3)

    if (obj is Turma){
        println("é da classe Turma")
    }
    else if (obj is Aluno){
        println("é da classe Aluno")
    }
    else if (obj is Professor){
        println("é da classe Professor")
    }
}







