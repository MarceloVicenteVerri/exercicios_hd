package Interfaces_Abs

interface Imprimível {
    var nome: String
    var tipodedocumento:String
    fun Imprimir()
}
abstract class foto : Imprimível{
    override fun Imprimir() {
        println("Eu sou ${tipodedocumento}, ${nome}")

        TODO("Not yet implemented")
    }
abstract class documento : Imprimível{
    override fun Imprimir() {

        TODO("Not yet implemented")
    }
}
abstract class contrato : Imprimível{
    override fun Imprimir() {
        TODO("Not yet implemented")
    }
}
//override var nome: String, override var tipodedocumento: String) : Imprimível(""){

}


