import Ingresso.IngressoPadrao
import Ingresso.IngressoVip
import java.awt.Graphics
import java.util.*


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

//************************************************************

//**********************************************************
fun main() {
    carregaVVip()
    carregaVNormal()
    IngressoAvenda()
    when 
}
// Cadastra preço do Ingresso Vip
fun carregaVVip(){
    val scanner = Scanner(System.`in`) //Variavel de Entrada de Tecla
    println()
    println(RED+   "-----------------------------------------------------------------")
    println(YELLOW+"-------------- CADASTRO DE PREÇO INGRESSO VIP -------------------")
    println(RED+   "-----------------------------------------------------------------")
    println()
    println(PURPLE+" DIGITE O VALOR DO INGRESSO VIP E PRESSIONE [ ENTER ]")
    println()
    print(" PREÇO DO INGRESSO VIP :"+GREEN+" R$ ")
    var retornoInicial = scanner.nextDouble() //Aguarda entrega tecla
    retornoInicial.also { PVip = it }
    println(RED+"            CONFIRMA VALOR "+WHITE+"[SIM = 1] [NAO = 2]")
    print("CONFIRMA : ")
    var retornoConfirma = scanner.nextInt() //Aguarda entrega tecla
    if (retornoConfirma==2){
        carregaVVip()
    }
    else
        println(WHITE+   "-------------- VALOR CADASTRADO COM SUCESSO ---------------------")

}
// Cadastra preço do Ingresso Normal
fun carregaVNormal(){
    val scanner = Scanner(System.`in`) //Variavel de Entrada de Tecla
    println()
    println()
    println(RED+   "-----------------------------------------------------------------")
    println(YELLOW+"------------ CADASTRO DE PREÇO INGRESSO NORMAL-------------------")
    println(RED+   "-----------------------------------------------------------------")
    println()
    println(PURPLE+" DIGITE O VALOR DO INGRESSO NORMAL E PRESSIONE [ ENTER ]")
    println()
    print("PREÇO INGRESSO NORMAL :"+GREEN+" R$ ")
    var retornoInicial1 = scanner.nextDouble() //Aguarda entrega tecla
    retornoInicial1.also { PNor = it }
    println(RED+"             CONFIRMA VALOR "+WHITE+"[SIN = 1] [NAO = 2]")
    print("CONFIRMA : ")
    var retornoConfirma = scanner.nextInt() //Aguarda entrega tecla
    if (retornoConfirma==2) {
        carregaVNormal()
    }
    else
        println(WHITE+   "-------------- VALOR CADASTRADO COM SUCESSO ---------------------")
}
   // Testa o tipo de Ingresso
fun IngressoAvenda() {

    val scanner = Scanner(System.`in`) //Variavel de Entrada de Tecla
    println(GREEN+ "-----------------------------------------------------------------")
    println(       "                       VENDA DE INGREDDO                         ")
    println(       "-----------------------------------------------------------------")
    println()
    println(YELLOW+"      ENTRE COM O TIPO DE INGRESSO E PRESSIONE - [ENTER]")
    println(PURPLE+"           INGRESSO"+WHITE+" [VIP = 1] - [NORMAL = 2]                 ")
    print(GREEN+"NUMERO : ")
    var retornoInicial = scanner.nextInt() //Aguarda entrega tecla

    if (retornoInicial == 1) {    //tecla = 1
        var ingressovip = IngressoVip(PVip) // carrega valor para class IngressoVip
        println()
        ingressovip.imprime() // Imprime valor de vip
        println()
        println(YELLOW+"-------------------- OBRIGADO PELA ESCOLHA ----------------------")
        Thread.sleep(2000)   //aguarda 2 segundos
        IngressoAvenda()   //retorna a fun IngressoAvenda

    }else{
        if (retornoInicial == 2) {  // tecla = 2
            var ingressopadrao = IngressoPadrao(PNor)
            println()
            ingressopadrao.imprime() //carrega valor para class IngressoPadrao
            println()
            println(YELLOW+"-------------------- OBRIGADO PELA ESCOLHA ----------------------")
            Thread.sleep(2000)
            IngressoAvenda()

        }else{
            if(retornoInicial == 2468){ // mudar valor de venda Ingresso
                carregaVVip()
                carregaVNormal()
                IngressoAvenda()
             }else{ //menssagem de erro se diferente de [ 1 ou 2 ]
                 if((retornoInicial ==0) || (retornoInicial >2)) //  tecla diferente de 1 e 2
                    println("Numero Incorreto")
                    println()
                    println(RED+"----------------------- TENTE NOVAMENTE -------------------------"+RESET)
                    println()
                    Thread.sleep(2000)
                    IngressoAvenda()
                 }
           }
        }
    }

