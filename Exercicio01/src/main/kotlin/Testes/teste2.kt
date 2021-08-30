fun main() {

    val filmesQueOProfessorMaisGosta = mapOf<Int, String>(
        1 to "No country for old men",
        2 to "O grande Lebowski",
        3 to "Hereditário",
        4 to "Mãe!",
        5 to "Midsommar"
    )

    for((indice, filme) in filmesQueOProfessorMaisGosta){
        println("Indice = $indice  Valor = $filme")
    }
}