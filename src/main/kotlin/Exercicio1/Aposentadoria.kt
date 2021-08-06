package Exercicio1

class Aposentadoria(var Idade:Int, var sexo:String, var tempoContr:Int) {

    fun testa(){
        if(sexo=="M")
            if((Idade > 35) && (tempoContr >=60)) {
                println("Homem" )
                print("True")

            }
        if(sexo=="F")
            if((Idade > 30) && (tempoContr >=60)){
                println("Mulher")
                println("True")
            }

    }
}