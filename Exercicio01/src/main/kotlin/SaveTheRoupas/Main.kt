package SaveTheRoupas

fun main() {
    //Criando as roupas
    var blusa = Roupa("Adidas", "abc")
    var calca = Roupa("Nike", "def")
    var casaco = Roupa("Tommy", "hij")

    //Criando listas de roupas
    var listaDePecas1 = mutableListOf<Peca>(blusa, calca, casaco)
    var listaDePecas2 = mutableListOf<Peca>(blusa, calca)
    var listaDePecas3 = mutableListOf<Peca>(calca, casaco)
    var listaDePecas4 = mutableListOf<Peca>(blusa, casaco)

    //Criando guardaVolumes1
    var guardaVolumes1 = GuardaVolumes()

    //Armazenando as roupas no guardaVolumes1 e recuperando o numero do armário
    guardaVolumes1.guardarPecas(listaDePecas1)
    guardaVolumes1.guardarPecas(listaDePecas2)
    guardaVolumes1.guardarPecas(listaDePecas3)
    guardaVolumes1.guardarPecas(listaDePecas4)
    println("")

    //Mostrando os itens no guardaVolumes1
    //guardaVolumes1.mostrarPecas()
    guardaVolumes1.mostraPecas(3)

    //guardaVolumes1.mostrarPecas()
    guardaVolumes1.devolverPecas(3)
    //guardaVolumes1.mostrarPecas()

}