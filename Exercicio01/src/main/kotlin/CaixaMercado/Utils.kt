package CaixaMercado

import java.util.*
import kotlin.collections.ArrayList

//cabecalho
//val imprimeCabecalhoNotaFiscal: () -> String = { "##########DH SuperMarket##########" } lambda
fun imprimeCabecalhoNotaFiscal() : String  {
  //   println("##########DH SuperMarket##########")
     var mensagem ="##########DH SuperMarket##########";
     return mensagem
}
//data da compra
//val retornaDataAtualDaCompra: () -> String = { lambida
fun retornaDataAtualDaCompra():String  {
     val data = Calendar.getInstance()
     return "${data.get(Calendar.DATE)}/${data.get(Calendar.MONTH)}/${data.get(Calendar.YEAR)}"
}

//Lista de produtos
//val imprimeListaDeProdutos: (lista: ArrayList<Produto>) -> Unit = { lambda
//      for (produto in it) { it = quando tiver apenas uma var pa fun
fun imprimeListaDeProdutos(lista: ArrayList<Produto>) : Unit  {
     for (produto in lista) {
          println("${produto.nome} R$${produto.preco}")
     }
}

//Rodapé
fun calculaTotalDeProdutos(lista: ArrayList<Produto>): Double {
     var total = 0.0
     for (produto in lista) {
          total += produto.preco
     }
    return total

}
