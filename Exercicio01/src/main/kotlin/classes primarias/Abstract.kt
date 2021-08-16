//package `classes primarias`

abstract class Funcionario(var funcional : String){
    abstract fun trabalho()
}

abstract class Funcionario2(var funcional : String ){
    abstract fun trabalho()

}

class FuncionarioDaTI(funcional: String):Funcionario(funcional){
    override fun trabalho() {
        println("Teste ")
            }
}
class Executivo(funcional : String): Funcionario(funcional){
    override fun trabalho() {
        println("teste")
    }
}
 fun main(){
 //   var funcionario {

   //  }
}