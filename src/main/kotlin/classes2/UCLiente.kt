package classes2

class UCLiente(var nome :String, sobreNome :String ) {
}
class conta(var numeroConta :Int, var saldo: Int, titular : UCLiente ){
    fun depositoDinheiro(valor:Int){
        println("Valor de Deposito = "+valor)
        saldo =saldo  +valor;
        println("Saldo com Deposito = "+saldo)
    }
    fun saqueDinheiro(valor: Int){
        println("Valor de Saque"+valor);
        saldo=saldo-valor;
        println("Saldo com Saque = " +saldo);
    }
}