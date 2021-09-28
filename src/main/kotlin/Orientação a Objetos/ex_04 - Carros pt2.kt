class Carro1(modelo: String, ano: Int, velocidade: Int){
    private var modelo: String
    private var ano = 1900
    private var velocidade: Int

    init {
        this.modelo =  modelo
        this.ano = ano
        this.velocidade = velocidade
    }

    fun getModelo (): String {
        return modelo
    }
    fun setModelo(modelo: String){
        this.modelo = modelo
    }
    fun getAno (): Int {
        return ano
    }
    fun setAno(ano: Int) {
        this.ano = ano
    }
    fun getVelocidade (): Int {
        return velocidade
    }
    fun setVelocidade(velocidade: Int) {
        this.velocidade = velocidade
    }
}

fun main(){
    var c0 = Carro1("Peugeot", 2012, 200)
    var c1 = Carro1("HB20", 2020, 200)
    var c2 = Carro1(modelo = "Fusca", ano = 1950, velocidade = 250)
    println("Ano do carro 1: ${c1.getAno()} \nano do carro 2: ${c2.getAno()}\n")

    var carros = arrayListOf(c0, c1, c2)

    for (x in carros){
        if (x.getAno() < 2000){
            println("Você precisa vender o ${x.getModelo()}")
        }
    }
}
