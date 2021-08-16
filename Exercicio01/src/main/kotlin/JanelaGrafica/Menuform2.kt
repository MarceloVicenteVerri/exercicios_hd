package JanelaGrafica

import java.awt.event.ActionListener
import java.text.ParseException
import javax.swing.JButton
import javax.swing.JFormattedTextField
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.text.MaskFormatter


class TestandoJFormattedTextField : JFrame() {
    private fun testaJFormattedTextField() {
        val janela = contentPane
        layout = null

        var texto1 = JLabel("MARCELO VICENTE VERRI ", JLabel.CENTER)
            texto1.setSize(50, 900)
            texto1.setBounds(201,280,100,20)
            janela.add(texto1)

        //BUTTON
        var Botao1 = JButton("Inicia")
        Botao1.setBounds(50,280,100,20)
        Botao1.addActionListener(ActionListener { texto1.setText("Ok Button clicked.") })

        janela.add(Botao1)

        //Define os rótulos dos botões
        val labelCep = JLabel("CEP: ")
        val labelTel = JLabel("Telefone: ")
        val labelCpf = JLabel("CPF: ")
        val labelData = JLabel("Data: ")
        var labelNome = JLabel("Nome")
        labelCep.setBounds(50, 40, 100, 20)
        labelTel.setBounds(50, 80, 100, 20)
        labelCpf.setBounds(50, 120, 100, 20)
        labelData.setBounds(50, 160, 100, 20)
        labelNome.setBounds(50, 220, 100, 20)

        //Define as máscaras
        var mascaraCep: MaskFormatter? = null
        var mascaraTel: MaskFormatter? = null
        var mascaraCpf: MaskFormatter? = null
        var mascaraData: MaskFormatter? = null
        var mascaraNome: MaskFormatter? = null
        try {
            mascaraCep = MaskFormatter("#####-###")
            mascaraTel = MaskFormatter("(##)####-####")
            mascaraCpf = MaskFormatter("#########-##")
            mascaraData = MaskFormatter("##/##/####")
            mascaraNome = MaskFormatter("")
            mascaraCep.placeholderCharacter = '_'
            mascaraTel.placeholderCharacter = '_'
            mascaraCpf.placeholderCharacter = '_'
            mascaraData.placeholderCharacter = '_'
            mascaraNome.placeholderCharacter = '_'
        } catch (excp: ParseException) {
            System.err.println("Erro na formatação: " + excp.message)
            System.exit(-1)
        }

        //Seta as máscaras nos objetos JFormattedTextField
        val jFormattedTextCep = JFormattedTextField(mascaraCep)
        val jFormattedTextTel = JFormattedTextField(mascaraTel)
        val jFormattedTextCpf = JFormattedTextField(mascaraCpf)
        val jFormattedTextData = JFormattedTextField(mascaraData)
        val jFormattedTextNome = JFormattedTextField(mascaraNome)
        jFormattedTextCep.setBounds(150, 40, 100, 20)
        jFormattedTextTel.setBounds(150, 80, 100, 20)
        jFormattedTextCpf.setBounds(150, 120, 100, 20)
        jFormattedTextData.setBounds(150, 160, 100, 20)
        jFormattedTextNome.setBounds(150, 220, 100, 20)

        //Adiciona os rótulos e os campos de textos com máscaras na tela
        janela.add(labelCep)
        janela.add(labelTel)
        janela.add(labelCpf)
        janela.add(labelData)
        janela.add((labelNome))
        janela.add(jFormattedTextCep)
        janela.add(jFormattedTextTel)
        janela.add(jFormattedTextCpf)
        janela.add(jFormattedTextData)
        janela.add(jFormattedTextNome)
        setSize(400, 390)
        defaultCloseOperation = EXIT_ON_CLOSE
        isVisible = true
    }

    companion object {
        private const val serialVersionUID = 1L
        @JvmStatic
        fun main(args: Array<String>) {
            val field = TestandoJFormattedTextField()
            field.testaJFormattedTextField()
        }
    }
}