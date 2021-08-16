package `classes primarias`
// Dicas classe pai e classe filhos classes simples
//classe primaria e classe secundaria

// abstract para não usar função de uma classe e a função não tem corpo ...para usar tem que
// criar um corpo para função usando     override <> "Tradução sobre escrever"

class FuncionarioDaTI(funcional: String, var notebook: String)

open class Funcionario2( var funcional: String = ""){

    var nome: String = ""

    open fun trabalhar(valor: String){
        println("o funcionario trabalha")
    }
}

class FuncionarioDaTI2: Funcionario2 {

    var notebook: String = ""

    constructor(funcional: String, nome: String): super(funcional){
        this.notebook = notebook
    }
// override chamar função dentro da clase
    override fun trabalhar(valor: String){
        println("alguma coisa")
    }

    fun trabalhar(valor: Int){
        println("alguma coisa")
    }

}

fun main() {
    /*    val funcionario = FuncionarioDaTI2()
    funcionario.funcional = "HP"
    funcionario.trabalhar("")

     */
}