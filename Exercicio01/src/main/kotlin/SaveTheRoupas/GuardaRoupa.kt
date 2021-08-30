package SaveTheRoupas

class Roupa(marca:String, modelo:String):Peca(marca, modelo) {
    override var retirada:()->Unit={}
}
