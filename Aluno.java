arquibo classe

package classes

fun main(){
    var aluno = Aluno(nome = "Marcelo",idade = 34,nota = 8 )
    println(aluno.nome+"  "+aluno.idade+"  "+aluno.nota)
}

arquivo Aluno

package classes

class Aluno (var nome:String, var idade:Int, var nota:Int){
}------------------------------------------------------------------------
-----------------------------------------------------------------------
arquivo Exercicios

package Exercicio1

import classes.Aluno

fun main() {
    var aposentadoria = Aposentadoria(Idade = 36, sexo = "F", tempoContr = 66).testa();
}


arquivo aposentadoria

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
}-----------------------------------------
-------------------------------------------
arquivo soma 
package Exercicio2

class soma(val lista : IntArray) {

    fun somaValores (){
       var total : Int;
       total=0
       for (item in lista.indices){
            total= (total * lista[item]);
       }
        print(total)

      //  print(lista[0]*lista[1]*lista[2]);
    }
}

arquivo exercicio 2
package Exercicio2

import classes.Aluno

fun main(){
    var teste = soma(lista = intArrayOf(1,2,3,4)).somaValores();

}
