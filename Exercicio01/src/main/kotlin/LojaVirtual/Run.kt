package LojaVirtual

fun main() {
    var hd = Item(123, "HD", 3, 1200.0)
    var mouse = Item(456, "mouse", 2, 15.0)
    var memoria = Item(789, "ram 16gb", 5, 800.0)
    var listaItens1: ArrayList<Item> = arrayListOf(hd, mouse, memoria)

    var fatura1 = Fatura(listaItens1)
    println("O total da fatura é: R$ ${fatura1.totalDaFatura()}")

    var teclado = Item(123, "teclado", -3, 1200.0)
    var monitor = Item(456, "monitor", 2, 15.0)
    var impressora = Item(789, "impressora", 5, -800.0)
    var listaItens2: ArrayList<Item> = arrayListOf(teclado, monitor, impressora)

    var fatura2 = Fatura(listaItens2)
    println("O total da fatura é: R$ ${fatura2.totalDaFatura()}")

}


