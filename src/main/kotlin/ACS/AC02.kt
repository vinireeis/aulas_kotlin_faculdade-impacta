fun reajuste(percentual: Int, salario: Int){
    var novo_salario: Int = 0
    novo_salario = (salario * (1 +(percentual/100)))
    println("Novo salario é $novo_salario")
}


fun main(){
    var salario = 1500
    reajuste(15, salario)

}

