/**
 * Referencias para estudos
 * https://medium.com/@joelamalio/kotlin-compara%C3%A7%C3%A3o-de-objetos-2b0db43092c9
 * https://agrawalsuneet.github.io/blogs/equality-in-kotlin/
 * https://kotlinlang.org/docs/equality.html#structural-equality
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html
 */
class Pessoa(val nome: String, var idade: Int) {

    /**
     * https://github.com/JetBrains/kotlin/blob/80cce1dc5280eb9135390270c8644a7b8d198071/kotlin-native/runtime/src/main/kotlin/kotlin/Any.kt#L29
     */
    override fun hashCode(): Int {
        return super.hashCode()
    }

    /**
     * Em Kotlin, existem dois tipos de igualdade:
    Igualdade estrutural ( == uma verificação para equals())
    Igualdade referencial ( === duas referências apontam para o mesmo objeto)
    https://kotlinlang.org/docs/equality.html
    https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html
     */
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    /**
     * return "$className@$hashCodeStr"
     *
     *https://github.com/JetBrains/kotlin/blob/80cce1dc5280eb9135390270c8644a7b8d198071/kotlin-native/runtime/src/main/kotlin/kotlin/Any.kt#L29
     */
    override fun toString(): String {
        return super.toString()
    }
}

/**
 * Data class sobrescreverá as funções toString e Equals
 * Ambas, utilizando o valor do construtor primario
 */
data class DataPessoa(val nome: String, var idade: Int)

fun main() {

    //- Por referência ===
    //- Por valor ==

    //Comparacao entre objetos

    val romario = Pessoa("romario", 26)
    val jonatas = romario

    println("São Romário e Jonatas, as mesmas pessoas?")
    if (romario === jonatas) {
        println("Sim, pois estão apontando para o mesmo local de memória")
    } else {
        println("Não, pois não estão apontando para o mesmo local da memória e o validador === verifica isso =D")
    }

    println("São Romário e Jonatas, as mesmas pessoas?")
    if (romario == jonatas) {
        println("Sim, pois estão apontando para o mesmo local de memória")
    } else {
        println(
            "Não, pois não estão apontando para o mesmo local da memória e o validador == sem ser sobrescrito" +
                    "verifica isso =D"
        )
    }


    val x = 10
    val y = 10
    println("O numero 10 da variavel X é igual ao numero 10 da variavel Y?")
    if (x === y) {
        println("Sim, pois estão apontando para o mesmo local de memória")
    } else {
        println("Não, pois não estão apontando para o mesmo local da memória e o validador === verifica isso =D")
    }


    val geovani1 = Pessoa("Geovani", 22)
    val geovani2 = Pessoa("Geovani", 22)

    println("São Geovani1 e Geovani2, as mesmas pessoas?")
    if (geovani1 == geovani2) {
        println("Sim, pois a validação do Equals está comparando atributos")
    } else {
        println(
            """
            Não, pois a validação do Equals não está comparando atributos
            O Compilador faz com que os objetos se tornem diferentes devido a posição da memória em que cada um está
            Para ter o resultado esperado, é necessário sobrescrever a função Equals ou usar uma Data Class
        """.trimIndent()
        )
    }

    println("Hash dos Geovanis: " + geovani1.hashCode() + " " + geovani2.hashCode())


    val flavio1 = DataPessoa("Flávio", 26)
    val flavio2 = DataPessoa("Flávio", 26)

    println("São Flavio1 e Flavio2, as mesmas pessoas?")
    if (flavio1 == flavio2) {
        println("Sim, pois a validação do Equals está comparando atributos")
    } else {
        println(
            """
            Não, pois a validação do Equals não está comparando atributos
            O Compilador faz com que os objetos se tornem diferentes devido a posição da memória em que cada um está
            Para ter o resultado esperado, é necessário sobrescrever a função Equals ou usar uma Data Class
        """.trimIndent()
        )
    }


    println("Hash dos Flavios: " + flavio1.hashCode() + " " + flavio2.hashCode())

}