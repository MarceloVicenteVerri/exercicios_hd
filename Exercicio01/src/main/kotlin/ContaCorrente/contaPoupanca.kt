package ContaCorrente

class contaPoupanca(var taxaJuros:Int,var saldo:Int ) {

    fun sacarDinheiro(quantia : Int):Int{
        saldo -=quantia
        return saldo
   }
    fun recolheJuros():Int{
        return saldo*taxaJuros-100
    }

}