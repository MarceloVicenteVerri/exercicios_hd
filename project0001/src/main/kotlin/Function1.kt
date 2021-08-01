import javax.swing.JFrame

fun main(args: Array<String>){
    val frame = Form1()
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

}
fun executarAcao(val1 : String, val2 : String ): Int{
    return val1.toInt() + val2.toInt()
}
