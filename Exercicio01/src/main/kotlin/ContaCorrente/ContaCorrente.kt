package ContaCorrente

class ContaCorrente(chequeExpecial:Int) {
    var Conta = conta(10,"Marcelo")
    fun depositoCheque(cheque:cheque):Boolean{
          cheque.bancoEmissor="Itau"
          cheque.valor=100;
          cheque.data="12/08/2021"
      return true
      }
      fun sacarDinheiro(quantia : Int):Int{
          if (Conta.saldo >= quantia){
              Conta.saldo -=quantia
              return Conta.saldo
          }
          else{
              println("Saldo Insuficiente")
              return Conta.saldo
          }

      }


}