//----------------------------------------------------
// Função Testa o numero maior entre 3 Variaveis

fun main(args: Array<String>): Unit {
var nuemroA =10;
var nuemroB =50;
var nuemroC =20;
    println("-----------------------------------------------------------");
    println("1 -  Escrever o código que deve analisar três números inteiros e retornar o maiordeles");
    println("Valor A =;"+nuemroA.toString () + nuemroB.toString () +nuemroC.toString());
    println(soma(nuemroA ,nuemroB,nuemroC));
    println();
    println("-----------------------------------------------------------");

    println("2 -  Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false");
    var nome2 ="Ricardo";
    var nome1 ="Ricardo";
    println("NomeA ="+nome1.toString ());
    println("NomeA ="+nome2.toString ());
    println("Os Nomes são = "+testan_nome(nome1,nome2));
    println();
    println("-----------------------------------------------------------");

    println("3 - Escrever o código que deve analisar um número inteiro e, caso ele seja par,retornar true, caso contrário, retorna false");
    var numero=200;
    println("Numero ="+numero.toString ());
    println("Numero e Par = "+valor(numero));
    println();
    println("-----------------------------------------------------------");

    println("4 - Escrever um programa que imprima na tela os primeiros 100 númerosinteiros positivos ímpares");
    var numeroA=-20;
    var numeroB=100;
    println("NumeroA ="+numeroA.toString ());
    println("NumeroB ="+numeroB.toString ());
    println("----------------Numeros Impares-------------------");
    numero_entrada(numeroA,numeroB);
    println();
    println("-----------------------------------------------------------");
    println("Escrever um código que deve analisar quatro números inteiros e, caso numA seja maior que numC e numD ou caso numB seja maior que numC e numD,retornar true, caso contrário, retornar false");

    var NumA=12;
    var NumB=11;
    var NumC=2;
    var NumD=10;
    println("NumeroA ou NumeroB são maiores = "+testa_numeros(NumA,NumB,NumC,NumD));
    println();
    println("-----------------------------------------------------------");
    println(" Escrever um programa que exiba os primeiros 100 números positivos")
    println();
    NumA=-200;
    println("Numero de Inicio = "+NumA.toString ());
    println();
    println("----------------Primeiro 100 numeros  Positivos-------------------");
    numerosPositivos(NumA);
    println();
    println("-----------------------------------------------------------");
}
// 1
fun soma( a:Int ,b:Int,c:Int):String{
var x =0;
var y ="";
    if(( a > b) and (a > c))
       y= "Variavel A = "+a.toString ();
    else
    if(( b > a) and (b > c))
        y= "Variavel B = "+b.toString ();

    else
    if(( c > a) and (c > b))
        y= "Variavel C = "+c.toString ();

    return y;
}
//2
fun testan_nome( a:String,b:String):Boolean{
var retorno = Boolean;

    if (a == b)
        return  true
    else
        return false

}
//3
fun valor( i : Int) : Boolean{
    if ((i%2)==0)
        return  true
    else
        return false
}

//4
fun numero_entrada(a : Int, n : Int ){
 var numero =a;
  while(numero < n){
      if ( numero > 0 ) {
          if ((numero % 2) == 1) {
              if(numero <= 9)
                  print("  0"+ numero)
              else
                  print("  " + numero)
          }
          if ((numero % 50) == 0) {
              println("")
          }
      }
      numero++;
  }
}

//----------------------------------------------------
// Função Testa o numero maior entre 4 Variaveis
/*
fun main(args: Array<String>): Unit {
    println(soma(12,11,2, 10));
}
*/
//5
fun testa_numeros( numA:Int ,numB:Int,numC:Int,numD:Int):Boolean {
var x: Boolean;

    if((( numA > numC) and (numA > numD)) || (( numB > numA) and (numB > numC) )) {
        println();
        if(( numA > numC) and (numA > numD))
            println("NumeroA é Maior que NumeroC e NumeroD");
        if(( numB > numC) and (numB > numD))
            println("NumeroB é Maior que NumeroC e NumeroD")
        x = true;
    }else
        x=false;

    return x;
}

//----------------------------------------------------
// Compara Se Valor e Positivo e mostra os 100 primeiro
/*
fun main(args: Array<String>): Unit {
numero(500);
}
*/
fun numerosPositivos(a : Int ){
 var numero =a;
 var numero2=0;

    if (numero < 0)
    numero=1;

    while(numero2 < 100){
      if ( numero > 0 ) {
         if ( numero <= 9)
             print("  0" + numero)
          else
          print("  " + numero)
       }
       if ((numero % 25) == 0) {
           println("")
       }
       numero++;
       numero2++;
  }
}
