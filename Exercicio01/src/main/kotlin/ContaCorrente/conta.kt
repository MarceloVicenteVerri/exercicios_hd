package ContaCorrente

class conta(var saldo:Int=0,var nome:String) {
      fun depositoValor(quantia:Int):Unit{
          saldo +=quantia
      }
      fun sacarDinheiro(quantia: Int):Int{
          if (saldo >= quantia) {
              saldo -= quantia
              return saldo
          }
          else {
              println("Saldo Insuficiente")
              return saldo
          }
      }
      fun consultaSaldo():Int{
          return saldo;
      }

}
