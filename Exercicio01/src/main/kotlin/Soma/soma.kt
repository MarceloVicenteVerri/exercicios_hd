package Soma

class soma(val lista : IntArray) {

    fun somaValores (){
       var total : Int;
       total=1
       for (item in lista.indices){
            total= (total * lista[item]);
       }
        print(total)

      //  print(lista[0]*lista[1]*lista[2]);
    }
}