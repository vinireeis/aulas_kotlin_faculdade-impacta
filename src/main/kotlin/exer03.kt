fun valores(x: Double, y: Double): Unit {
    var recebe:Double = y
    var y:Double = x
    var x:Double = recebe


    println("O novo valor de x é: $x")
    println("O novo valor de y é: $y")
}

fun main(){
    val x:Double = 9.5
    val y:Double = 10.5
    valores(x, y)
}