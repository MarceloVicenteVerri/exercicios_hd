package CaixaMercado

class CarrinhoDeCompras() {
    val listaDeProdutos = ArrayList<Produto>()

    fun addProduto(produto: Produto){
        listaDeProdutos.add(produto)
    }

}