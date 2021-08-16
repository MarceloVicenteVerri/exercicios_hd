package Ingresso

class IngressoPadrao(IngressoPreco: Double):ingresso(IngressoPreco) {
    override fun imprime() {
        println("Valor Ingresso NORMAL: R$ ${IngressoPreco}")
    }

}