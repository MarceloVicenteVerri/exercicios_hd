package Ingresso

import java.awt.event.ActionListener
import java.awt.event.ItemEvent
import java.text.ParseException
import javax.swing.*
import javax.swing.text.MaskFormatter


class TestandoJFormattedTextField : JFrame() {
    public fun testaJFormattedTextField(valorVip : String="0", valorNormal : String="0") {
        val janela = contentPane
        layout = null

        setTitle("Vende de Ingresso") //titulo formulario

        var texto2 = JLabel("Valor a Pagar R$: ")
        texto2.setBounds(45, 150, 150, 20)
        janela.add(texto2)
        //BUTTON
        var Botao1 = JButton("Confirmar")
        Botao1.setBounds(50,280,100,20)
        janela.add(Botao1)

        //Define os rótulos dos Textos dos campos
        var labelVip = JLabel("Preço Vip: ")
        var labelNormal = JLabel("Preço Normal: ")
            labelVip.setBounds(50, 50, 100, 20)
            labelNormal.setBounds(250, 50, 100, 20)


        //Define as máscaras
        var mascaraVip: MaskFormatter? = null
        var mascaraNormal: MaskFormatter? = null
        var mascaraTotal: MaskFormatter? = null

        try {
            mascaraVip = MaskFormatter("###")
            mascaraNormal = MaskFormatter("###")
            mascaraTotal = MaskFormatter("###")

        } catch (excp: ParseException) {
            System.err.println("Erro na formatação: " + excp.message)
            System.exit(-1)
        }

        //Seta as máscaras nos objetos JFormattedTextField
        var TextVip = JFormattedTextField(mascaraVip)
        var TextNormal = JFormattedTextField(mascaraNormal)
        var TextTotal = JFormattedTextField(mascaraNormal)
        TextVip.setBounds(50, 70, 100, 20)
        TextNormal.setBounds(250, 70, 100, 20)
        TextTotal.setBounds(150, 150, 100, 20)

        //carrega para na tela
        TextVip.text=valorVip
        TextNormal.text=valorNormal
        TextTotal.text="0"



      //Carrega Valores Variavel fun
        janela.add(TextVip)
        janela.add(TextNormal)
        janela.add(TextTotal)
        setSize(400, 390)
        defaultCloseOperation = EXIT_ON_CLOSE
        isVisible = true
      //  Botao1.addActionListener(ActionListener { TextTotal.setText(TextVip.getText())})

        //Criar CheckBox
        val checkBox1 = JCheckBox("Ingresso Vip",false)
        val checkBox2= JCheckBox("Ingresso Normal",false)
        var teste1 : Int =0
        checkBox1.addItemListener { e ->
            val sel: Int = e.stateChange
            if (sel == ItemEvent.SELECTED) {
                checkBox2.setSelected(false);
                teste1=1

            } else {
                teste1=2
                checkBox2.setSelected(true);
            }
        }
        checkBox2.addItemListener { e ->
            val sel: Int = e.stateChange
            if (sel == ItemEvent.SELECTED) {
                teste1=2
                checkBox1.setSelected(false)

            } else {
                teste1=2
                checkBox1.setSelected(true)
            }
        }
        checkBox1.setBounds(50, 200, 100, 20)
        checkBox2.setBounds(150, 200, 200, 20)

        janela.add(checkBox1)
        janela.add(checkBox2)
       // var total1 : String ="0"
        TextTotal.text="0"
        Botao1.addActionListener(ActionListener { if(teste1 == 1)
                                                    TextTotal.setText(TextVip.getText())
                                                 else
                                                   TextTotal.setText(TextNormal.getText())

        })
}

    companion object {
        private const val serialVersionUID = 1L
        @JvmStatic
        fun main(args: Array<String>) {

            val field = TestandoJFormattedTextField()
            field.testaJFormattedTextField("200","100")
      //      field.testaJFormattedTextField()

        }
    }
}