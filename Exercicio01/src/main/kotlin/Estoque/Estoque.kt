package Estoque

class Estoque(var nome: String = "", var qtdAtual: Int = 0, var qtdMinima: Int = 0) {
    val red = "\u001b[31m"
    val yellow ="\u001b[33m"
    val reset = "\u001b[0m"

    fun mandarNome(nome: String): Unit {
        println()
        this.nome=nome
        println(yellow+"--------------------- Produto: " + nome+"----------------------"+reset)
    }

    fun mandarQtdMinima(qtdMinima1: Int): Unit {
        qtdMinima = qtdMinima1
        println("Quantidade Minima: " + qtdMinima)
    }

    fun repor(qnt: Int): Unit {
        qtdAtual += qnt
        println("Repor estoque: " + qnt)
        mostrar()
    }

    fun darBaixa(qtd: Int): Unit {

        if (qtdAtual - qtd >= qtdMinima) {
            qtdAtual -= qtd
            println("Vendido Qtd:" + qtd + " Estoque:" + qtdAtual)
        } else
            println("Quantidade maior que Estoque")

    }

    fun mostrar(): Unit {
        mandarNome(nome)
        println("Produto: " + nome + " Estoque Minima: " + qtdMinima + " Estoque : " + qtdAtual)
    }

    fun precisaRepor(): Boolean {
         if(qtdAtual <= qtdMinima)
            println(red+"true")
         else
            println(yellow+"false")
        return qtdAtual <= qtdMinima
    }

}