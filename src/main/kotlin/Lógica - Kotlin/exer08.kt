fun main(){
    var n1:Double = 7.0
    var n2:Double = 7.0
    var n3:Double = 10.0


    var media:Double = (n1+n2+n3)/3
    if(media > 6){
        println("Aprovado de primeira!") }

    else{ var n4:Double = 10.0
        media = (media + n3)/2
        if(media>6){
            println("Parabéns, você foi Aprovado após a recuperação")
        }
        else{
            println("Infelizmente foi Reprovado")
            println(media)
        }
    }
}


