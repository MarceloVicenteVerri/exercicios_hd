package CaixaMercado

import java.util.*
import java.util.Calendar.*

/**
 * docs de apoio:
 * https://kotlinlang.org/docs/inline-functions.html
 * As funções de ordem superior são muito úteis e podem realmente melhorar o funcionamento reusabilitydo código.
 * No entanto, uma das maiores preocupações em usá-los é a eficiência. As expressões lambda são compiladas em
 * classes (geralmente classes anônimas) e a criação de objetos em Java é uma operação pesada.
 * Ainda podemos usar funções de ordem superior de maneira eficaz, mantendo todos os benefícios,
 * tornando as funções embutidas.
 */

/**
 * Função comum, não inline.
 * Recebendo uma função como parametro: processoDeAbertura: () -> Unit
 */
fun openDB(processoDeAbertura: () -> Unit){
    println("Iniciando abertura")
    processoDeAbertura.invoke()

}

/**
 *  Inline -> em vez dos objetos de função serem chamados,
 *  eles são substituídos pelo código do corpo da função em tempo de compilação ...
 */
inline fun openDBComInline(processoDeAbertura: () -> Unit, dataFormatada: () -> String){
    println("Iniciando abertura na data de: ${dataFormatada.invoke()}")
    processoDeAbertura()
}
/*  Exemplo Lambida
val dataFormatada: () -> String = {
    val data = Calendar.getInstance()
    "${data.get(DATE)}/${data.get(MONTH)}/${data.get(YEAR)}"
}
*/
inline fun dataFormatada() : String {
    val data = Calendar.getInstance()
    var valor =  "${data.get(DATE)}/${data.get(MONTH)}/${data.get(YEAR)}"
    return valor
}
fun processoDeAbertura(){
    println("Iniciando execução")
    println("Abertura concluída")
}

fun main() {
    // openDBComInline({ processoDeAbertura() }, dataFormatada()) Lambida
    openDBComInline({ processoDeAbertura() }, {dataFormatada()})
}

