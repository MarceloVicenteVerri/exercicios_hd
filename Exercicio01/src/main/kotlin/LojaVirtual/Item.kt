package LojaVirtual

class Item(
    var numero: Int,
    var descricao: String,
    var quantidade: Int = 0,
    var precoUnitario: Double = 0.0
) {

    init {
        if (quantidade < 0) quantidade = 0
        if (precoUnitario < 0.0) precoUnitario = 0.0
    }
}
