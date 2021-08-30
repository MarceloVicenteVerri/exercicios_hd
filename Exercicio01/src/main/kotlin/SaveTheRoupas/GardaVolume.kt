package SaveTheRoupas

class GuardaVolumes() {
    var dicionario = mutableMapOf<Int, List<Peca>>()
    var contador = 0

    var guardarPecas: (MutableList<Peca>) -> Unit = { lista ->
        do {
            contador++
        } while (dicionario.containsKey(contador))
        dicionario[contador] = lista
        println("Armazenado no armário número: $contador")
    }

    fun mostrarPecas() {
        dicionario.keys.forEach() {
            var temp = dicionario[it]
            println("Armário $it --------------------------")
            if (temp != null) {
                temp.forEach() { println("Marca:${it.marca} -> Modelo: ${it.modelo}") }
            }
            println("")
        }
    }

    fun mostraPecas(numero: Int) {
        var temp = dicionario[numero]
        if (temp != null) {
            println("Armário $numero --------------------------")
            temp.forEach() { println("Marca:${it.marca} -> Modelo: ${it.modelo}") }
        }
    }

    var devolverPecas: (Int) -> Unit = { numero ->
        if (numero > 0 && !dicionario.isEmpty()) {
            println(
                """
                
                ---------------------------------------
                Retirado itens do armário número: $numero
                ---------------------------------------
                
            """.trimIndent()
            )

            dicionario.remove(numero)
        } else {
            println("Valor inválido!")
        }
    }
}