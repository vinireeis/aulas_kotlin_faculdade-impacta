fun calcula(num1:Double, num2:Double, operacao:String){
    var resultado:Double = 0.0
    if (operacao == "SOMAR"){
        resultado = num1 + num2
    }
    else if (operacao == "SUBTRAIR"){
        resultado = num1 - num2
    }
    else if (operacao == "MULTIPLICAR"){
        resultado = num1 * num2
    }
    else if (operacao == "DIVIDIR"){
        resultado = num1 / num2
    }
    print("$operacao, $resultado")
}

fun main(){
    var num1:Double
    var num2:Double
    var operacao:String
    num1 = 30.0
    num2 = 20.0
    operacao = "SUBTRAIR"
    calcula(num1,num2,operacao)

}