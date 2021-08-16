package Ingresso

class IngressoVip(IngressoPreco: Double):ingresso(IngressoPreco) {
    override fun imprime() {
        println("Valor Ingresso VIP: R$ ${IngressoPreco}")
            }

}