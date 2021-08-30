package SaveTheRoupas

abstract class Peca(var marca: String, var modelo: String) {

    abstract var retirada: () -> Unit

}
