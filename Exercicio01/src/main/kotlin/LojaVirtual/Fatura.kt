package LojaVirtual

class Fatura {
    class Fatura(var listaItens: ArrayList<Item>) {

        fun totalDaFatura(): Double {
            var soma = 0.0
            listaItens.forEach { item ->
                soma += item.precoUnitario * item.quantidade
            }
            return soma
        }
    }
}