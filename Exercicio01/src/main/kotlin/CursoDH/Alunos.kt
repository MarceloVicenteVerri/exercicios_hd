package CursoDH

class  Aluno ( var  ra :  Int , var  nome :  String , var  sobrenome :  String ) {

    fun  assitirAula ( aula :  Aula ) {
        println ( " O / A aluno (a) $ {nome} está assistindo uma aula: $ {aula.materia.nome} " )
    }

    fun  fazerLicao ( aula :  Aula ) {
        println ( " O / A aluno (a) $ {nome} está fazendo uma lição de $ {aula.materia.nome} " )
    }
}