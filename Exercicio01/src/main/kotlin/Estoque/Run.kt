package Estoque

import LojaVirtual.Item

fun main() {
    val red = "\u001b[31m"
    val yellow ="\u001b[33m"
    val reset = "\u001b[0m"

    var parafusos = Estoque("Parafusos", 200, 50)

    println()

    //parafusos.mandarQtdMinima(10)
    parafusos.mandarNome("Porca")
    parafusos.mostrar()
    parafusos.darBaixa(20)
    parafusos.repor(20)
    parafusos.precisaRepor()

    println(yellow+"-------------------------------------------------------------"+reset)

}