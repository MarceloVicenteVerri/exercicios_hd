package Interfaces_Abs

interface Saudavel {
    fun animalSaudavel(): Boolean

    fun tomarMedicamento() {
        if (!animalSaudavel()) {
            println("1111")

        } else {
            println("2222")
        }
    }
}

interface prof {
    fun progra(): String

    fun fazer() {
        println("22331")
    }
}

class programador : prof,Saudavel {
    override fun progra(): String {
        return ",.m.m,,"

    }

    override fun fazer() {
        super.fazer()
    }

    override fun animalSaudavel(): Boolean {
        TODO("Not yet implemented")
    }
}

fun main() {
    val programador = programador()
    programador.fazer()
}