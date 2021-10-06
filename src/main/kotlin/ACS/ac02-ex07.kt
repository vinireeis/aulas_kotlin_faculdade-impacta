class Carro(modelo: String, ano: Int, velocidade: Int){
    var modelo = modelo
    var ano = 1900
    var velocidade = velocidade

    init {
        this.modelo = modelo
        this.ano = ano
        this.velocidade = velocidade
    }
}

fun main(){
    var c0 = Carro(modelo = "Pegeout", ano = 2012, velocidade = 190)
    var c1 = Carro(modelo = "Onix", ano = 2018, velocidade = 220)
    var c2 = Carro(modelo = "Fusca", ano = 2020, velocidade = 300)

    println(c1.ano)
    println(c2.ano)
}
