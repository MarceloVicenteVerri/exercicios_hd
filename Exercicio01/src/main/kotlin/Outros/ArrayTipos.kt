import java.util.concurrent.ConcurrentSkipListSet

fun pulaLinha(Texto: String = "") {
    println()
    println("------------------${Texto}-------------------")
    println()
}

fun Loteria() {
    val loteria = mapOf(
        0 to "Ovos",
        1 to "Àgua",
        2 to "Cavalo",
        3 to "Dentista",
        4 to "Fogo"
    )

    for (loteria in loteria) {
        println(loteria)
    }

}

fun Dicionario() {
    val dicionario = mapOf(
        "João" to listOf("Juan, El Divo, Maromba, Zé Bonitinho"),
        "Miguel" to listOf("Dark Knight, Bruce Wayne, Batfleck, Gengiva"),
        "Maria" to listOf("Ju, Mary, Marilene, Ventania"),
        "Lucas" to listOf("Lukinha, Jorge, George, Kevin Flyn")

    )
    for (dicionario in dicionario) {
        print(dicionario.key + " -- ")
        for (dicionario in dicionario.value)
            print(dicionario)

        println()
    }
}

fun Novalista() {
    var novalista1 = mutableListOf<Int>()
    novalista1.add(1)
    novalista1.add(5)
    novalista1.add(5)
    novalista1.add(6)
    novalista1.add(7)
    novalista1.add(8)
    novalista1.add(8)
    novalista1.add(8)
    println(novalista1)
//-----------------------------------------------------------------
    var novalista = mutableSetOf<Int>()
    novalista.add(1)
    novalista.add(5)
    novalista.add(5)
    novalista.add(6)
    novalista.add(7)
    novalista.add(8)
    novalista.add(8)
    novalista.add(8)
    println(novalista)
}

fun somaTotal() {

    val numeros = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var soma: Int = 0;
    var x: Int = numeros.size - 1

    for (index in 0..numeros.size - 1) {
        print("${numeros[index]}")
        if (index <= x - 1)
            print(" X ")
        else
            print(" = ")
    }
    for (numeros in numeros)
        soma += numeros

    println("${soma}")

}


fun main() {
    pulaLinha("Loteria")
    Loteria()

    pulaLinha("Dicionario")
    Dicionario()

    pulaLinha("mutableListOf e mutableSetOf Diferenças")
    Novalista()

    pulaLinha("Somar Numeros da Tabela")
    somaTotal()
}