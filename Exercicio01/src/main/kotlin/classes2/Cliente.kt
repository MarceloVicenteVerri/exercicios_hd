package classes2

fun main(){
    var cliente1 = UCLiente(nome = "Rogerio", sobreNome = "Sailva");
    var conta1 = conta(numeroConta = 1, saldo = 500, titular = cliente1);

    var cliente2 = UCLiente(nome = "Marcos", sobreNome = "Andrade");
    var conta2 = conta(numeroConta = 2, saldo = 800, titular = cliente1);

    conta1.depositoDinheiro(100);
    conta1.saqueDinheiro(20);
    conta2.depositoDinheiro(300);
    conta2.saqueDinheiro(50);
}