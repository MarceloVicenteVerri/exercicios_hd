import kotlin.Function;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form1 {
    private JTextField CampoA = new JTextField("",10);
    private JTextField CampoB = new JTextField("",10);
    private JButton Botao = new JButton("Somar");

    public Function(){
       super( "Mina Janela" );
       this.setSize(300,150);
       JPanel pn1 =new JPanel();
       pn1.add(new JLabel("Valor 1: "))
       pn1.add(CampoA);
       JPanel pn2= new JPanel();
       pn2.add(new JLabel("Valor 1: "))
       pn2.add(CampoB);
       JPanel pn3 = new JPanel();
       pn3.add(Botao);
       Botao.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           executarAcao();
           }
       });
       this.setLayout(new GridLayout(3,1));
       this.add(pn1);
       this.add(pn2);
       this.add(pn3);
       this.setVisible(true);
    }
    private void executarAcao(){
        JOptionPane.showMessageDialog(
                this,
                "somados o resultado"+
                Function1Kt.executarAcao(
                        campoA.getText(),
                        campoB.getText()
                ),"Resultado da Soma",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

}
