package heranca
// heranca da pasta Animal
class Cachorro: Animal() {
    override fun correr():String{
        super .correr()
        return "correndo"
    }
}