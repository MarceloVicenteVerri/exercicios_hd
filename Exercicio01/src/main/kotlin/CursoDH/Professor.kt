package CursoDH

class  Professor( var  nome :  String , var  rd :  Int ) {


        fun darAula(aula: Aula) {
            println("O professor ${nome} está dando a aula ${aula.materia.nome}")
        }

        fun fazerChamada(listaAlunos: ArrayList<Aluno>) {
            listaAlunos.forEach { aluno -> println("O aluno ${aluno.nome} está presente?") }
        }

}