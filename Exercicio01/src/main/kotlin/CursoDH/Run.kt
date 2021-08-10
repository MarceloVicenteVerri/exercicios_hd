package CursoDH

fun main() {
    var ana = Aluno(123, " Ana ", " Cortez ")
    var marcelo = Aluno(456, " Marcelo ", " Verri ")
    var ricardo = Aluno(789, " Ricardo ", " Taira ")
    var listaAlunos = arrayListOf<Aluno>(ana, marcelo, ricardo)

    var romario = Professor(" Romário ", 987)
    var jonathas = Professor(" Jonathas ", 654)

    var listaProfessores = arrayListOf<Professor>(romario, jonathas)

    var kotlin = Materia(" Kotlin ")
    var android = Materia(" Android ")

    var aulaIntroKotlin = Aula(kotlin, " 19:30 ", " 21:30 ")
    var aulaIntroAndroid = Aula(android, " 19:30 ", " 20:30 ")
    var listaAulas = arrayListOf<Aula>(aulaIntroKotlin, aulaIntroAndroid)

    var cursoMobile = Curso(" Desenvolvimento Mobile Android com Kotlin ", listaAulas, listaAlunos, listaProfessores)
    println(" O curso $ {cursoMobile.nomeCurso} foi criado com sucesso ")

    ana.assitirAula(aulaIntroKotlin)
    ana.fazerLicao(aulaIntroKotlin)

    marcelo.assitirAula(aulaIntroAndroid)
    marcelo.fazerLicao(aulaIntroAndroid)

    ricardo.assitirAula(aulaIntroKotlin)
    ricardo.fazerLicao(aulaIntroAndroid)

    romario.darAula(aulaIntroKotlin)
    romario.fazerChamada(listaAlunos)

    jonathas.darAula(aulaIntroAndroid)
    jonathas.fazerChamada(listaAlunos)
}