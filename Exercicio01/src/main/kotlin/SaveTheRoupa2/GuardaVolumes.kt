package SaveTheRoupa2
//import AulaExercicios.mopOf
import org.jetbrains.annotations.NotNull
import javax.swing.ListModel

//class GuardaVolumes(Diciobario:  mopOf<Int, List<Peças>>) {
class GuardaVolumes() {
    var Diciobario = mutableMapOf<Int, List<Peças>>()
    var contador : Int = 0

    fun GuardaPecas( Lista : MutableList<Peças>) {
        contador = 0
        for (Index in 0..Diciobario.size)
            if(Diciobario.values.hashCode() > 0)
                contador++
        Diciobario[contador] = Lista;
        println(contador)

        Lista.onEach {
            println("MODELO : ${it.marca}    TAMANHO:  ${it.modelo}--------")
        }
    }
    fun MostraPecas ( Lista : Int) {
        val temp = Diciobario[Lista]
        println()
        println("====================={ Guarda Volume=[${Lista}] }===================")

        if (temp != null) {
            temp.onEach {
                println("MODELO : ${it.marca}    TAMANHO:  ${it.modelo}--------")
            }
        }
        println("=============================================================")

    }

    fun MostraPecas():Unit {
            Diciobario.keys.onEach{
            var temp = Diciobario[it]
            var texto =  Diciobario.keys.toString()
            println()
            println("============={ Total em Guarda Volume= [ $it ]  }==============")
            if (temp != null) {
                temp.onEach {
                    println("MODELO : ${it.marca}    TAMANHO:  ${it.modelo}--------")
                }
            }
            println("=============================================================")
        }
    }
    fun devolverPecas(numero: Int=0):Unit {
        if (numero > 0 && !Diciobario.isEmpty()) {
            println("""
                     ============================================================---------------------------------------
                       Retirado itens do armário número: $numero
                     =============================================================
                      ---------------------------------------
                      """.trimIndent()
                )
                Diciobario.remove(numero)
            } else {
                println("Valor inválido!")
            }
    }

    fun IniciaValores(){
        var blusa = roupas("Adidas", "M")
        var camisa = roupas("Nike", "G")
        var saia = roupas("Generica", "M")
        var bermuda = roupas("Adidas", "G")

        val lista1 = mutableListOf<Peças>(blusa, camisa)
        val lista2 = mutableListOf<Peças>(camisa, saia, bermuda)
        val lista3 = mutableListOf<Peças>(saia, blusa, camisa, bermuda)
        val lista4 = mutableListOf<Peças>(bermuda)

        var GardaVolume = GuardaVolumes()

        GardaVolume.GuardaPecas(lista1)
        GardaVolume.GuardaPecas(lista2)
        GardaVolume.GuardaPecas(lista3)

        GardaVolume.MostraPecas()
        GardaVolume.MostraPecas()
        GardaVolume.devolverPecas()
    }
}


fun main():Unit {
    var blusa = roupas("Adidas", "M")
    var camisa = roupas("Nike", "G")
    var saia = roupas("Generica", "M")
    var bermuda = roupas("Adidas", "G")

    val lista1 = mutableListOf<Peças>(blusa, camisa)
    val lista2 = mutableListOf<Peças>(camisa, saia, bermuda)
    val lista3 = mutableListOf<Peças>(saia, blusa, camisa, bermuda)
    val lista4 = mutableListOf<Peças>(bermuda)

    var GardaVolume = GuardaVolumes()

    GardaVolume.GuardaPecas(lista1)
    GardaVolume.GuardaPecas(lista2)
    GardaVolume.GuardaPecas(lista3)

    GardaVolume.MostraPecas(1)
    GardaVolume.MostraPecas()
    GardaVolume.devolverPecas()

}

