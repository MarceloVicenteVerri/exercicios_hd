package SaveTheRoupa2

import java.util.*
import kotlin.collections.ArrayList

val RESET = "\u001b[0m" // Text
val BLACK = "\u001b[0;30m" // BLACK
val RED = "\u001b[0;31m" // RED
val GREEN = "\u001b[0;32m" // GREEN
val YELLOW = "\u001b[0;33m" // YELLOW
val BLUE = "\u001b[0;34m" // BLUE
val PURPLE = "\u001b[0;35m" // PURPLE
val CYAN = "\u001b[0;36m" // CYAN
val WHITE = "\u001b[0;37m" // WHITE
var PVip : Double =0.0
var PNor : Double =0.0

fun tela1(){
    val scanner = Scanner(System.`in`) //Variavel de Entrada de Tecla
    println()
    println()
    println(RED+   "-----------------------------------------------------------------")
    println(YELLOW+"---------------------  SAVETHEROUPA  ----------------------------")
    println(RED+   "-----------------------------------------------------------------")
    println()
    println(PURPLE+"            DIGITE O VALOR  E PRESSIONE [ ENTER ]")
    println()
    println(RED+"         CADASTRO [ 1 ]  ESTOQUE [ 2 ]   RETIRADA [ 3 ]"+WHITE)
    println()
    println()
    println(RED+   "-----------------------------------------------------------------")
    print(YELLOW+"CONFIRMA : ")
    var retornoConfirma = scanner.nextInt() //Aguarda entrega tecla
    if (retornoConfirma==2) {
        tela2()
    }
    else
        if (retornoConfirma==1) {
            tela3()
        }
        else
            if (retornoConfirma==3) {
                tela4()
            }
            else {
                println(WHITE+   "-------------- VALOR CADASTRADO COM SUCESSO ---------------------")
            }
}
fun tela2(){
    val scanner = Scanner(System.`in`) //Variavel de Entrada de Tecla
    println()
    println()
    println(RED+   "-----------------------------------------------------------------")
    println(YELLOW+"---------------------  SAVETHEROUPA  ----------------------------")
    println(RED+   "-----------------  PRODUTOS EM ESTOQUE  -------------------------")
    println()
    println()
    println(RED+   "-----------------------------------------------------------------"+WHITE)
//************************************************************************************
    GuardaVolumes().IniciaValores()
    GuardaVolumes().MostraPecas()
//************************************************************************************
    print(YELLOW+"CONFIRMA : "+ WHITE)
    var retornoConfirma = scanner.nextInt() //Aguarda entrega tecla
   // if (retornoConfirma==2) {
        tela1()
   // }
   // else
   //    println(WHITE+   "-------------- VALOR CADASTRADO COM SUCESSO ---------------------")
}
fun tela3(){
    var modelo : String=""
    var tipo_ : String=""
    var Listamodelo = ArrayList<String>()
    var ListaTamanho= ArrayList<String>()

    val scanner = Scanner(System.`in`) //Variavel de Entrada de Tecla
    println()
    println()
    println(RED+   "-----------------------------------------------------------------")
    println(YELLOW+"---------------------  SAVETHEROUPA  ----------------------------")
    println(RED+   "------------------  CADASTRO PRODUTOS  --------------------------")
    println()
    println(PURPLE+"           DIGITE O MODELO E PRESSIONE [ ENTER ]")
    println()
    print(YELLOW+"CONFIRMA : "+ WHITE)
    var retornoInicial = scanner.nextLine() //Aguarda entrega tecla
    retornoInicial.also { modelo= it }
    Listamodelo.add(modelo)
    println()
    println()
    println(PURPLE+" DIGITE O TAMANHO E PRESSIONE [ ENTER ]")
    println()
    print(YELLOW+"CONFIRMA : "+ WHITE)
    var retornoInicial3 = scanner.nextLine() //Aguarda entrega tecla
    retornoInicial3.also { tipo_ = it }  //  print("MODELO :"+GREEN)
    ListaTamanho.add(tipo_)
    println(RED+"             CONFIRMA VALOR "+WHITE+"[SIM = 1] [NAO = 2]")
    println()
    println(RED+   "*****************************************************************")
    println()
    println(YELLOW+"Modelo : "+ GREEN+modelo+ YELLOW+"   Tamanho : "+ GREEN+tipo_)
    println()
    println(RED+   "*****************************************************************")
    println()
    print(YELLOW+"CONFIRMA : "+ WHITE)
    var retornoConfirma1 = scanner.nextInt() //Aguarda entrega tecla
    if (retornoConfirma1==1) {
//************************************************************************************
        var LISTA = roupas(modelo, tipo_)

        val novaLista = mutableListOf<Peças>(LISTA)
        var teste = GuardaVolumes()
        teste.GuardaPecas(novaLista)
        teste.MostraPecas()
//************************************************************************************

        tela1()
    }
}
fun tela4(){
    val scanner = Scanner(System.`in`) //Variavel de Entrada de Tecla
    println()
    println()
    println(RED+   "-----------------------------------------------------------------")
    println(YELLOW+"---------------------  SAVETHEROUPA  ----------------------------")
    println(RED+   "--------------  SAIDA DE PRODUTOS EM ESTOQUE  -------------------")
    println()
    println()
    println(RED+   "-----------------------------------------------------------------"+WHITE)
//************************************************************************************

    //GardaVolumes.devolverPecas()

//************************************************************************************
    print(YELLOW+"CONFIRMA : "+ WHITE)
    var retornoConfirma = scanner.nextInt() //Aguarda entrega tecla
    // if (retornoConfirma==2) {
    tela1()
    // }
    // else
    //    println(WHITE+   "-------------- VALOR CADASTRADO COM SUCESSO ---------------------")

}

fun main() {
  //  GuardaVolumes().IniciaValores()
    tela1()
//  carregaVNormal()
//  IngressoAvenda()
}

