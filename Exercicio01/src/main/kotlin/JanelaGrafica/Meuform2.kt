import java.awt.*
import javax.swing.*


class TestandoJTextField : JFrame() {
    private var txtExemplo: JTextField? = null
     fun testaJTextField( text:String) {
        title = text
        this.setSize(200, 180)

        //Definimos o tamanho padrão do JTextField
        txtExemplo = JTextField(10)

        //Passamos para o construtor o número máximo de caracteres aceitos
     //   txtExemplo!!.document = JTextField(5)
        this.contentPane.add(txtExemplo, "North")
        defaultCloseOperation = EXIT_ON_CLOSE
        isVisible = true
    }

    companion object {
        private const val serialVersionUID = 1L
    //    @JvmStatic
  /*      fun main(args: Array<String>) {
            val field = TestandoJTextField()
            field.testaJTextField()
        }  */
    }
}

fun main(args: Array<String>) {
    val myFrame = JFrame("TELA PRINCIPAL")
    myFrame.setSize(300, 200)
    myFrame.setVisible(true)


    val entradaText = TestandoJTextField()
        entradaText.testaJTextField("Marcelo Vicente")


}