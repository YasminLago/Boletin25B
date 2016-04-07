package boletin25b;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ylagorebollar
 */
public class Aplicacion5 implements ActionListener{
    JFrame marco;
    JPanel panel1,panel2;
    JButton bDibuxa,bLimpa;
    JTextField tTexto;
    int numTexto;
    String num;
    
    public void ventana(){
        marco = new JFrame("Exercicio 25B");
            marco.setSize(500,500);
        panel1 = new JPanel();
            
        panel2 = new JPanel();
        bDibuxa = new JButton("Dibuxa");
        bLimpa = new JButton("Limpa");
        tTexto = new JTextField("0"); 
        
        bDibuxa.addActionListener(this);
        bLimpa.addActionListener(this);
        
        panel1.add(bDibuxa);
        panel1.add(bLimpa);
        panel1.add(tTexto);
        
        
        marco.add(panel1, BorderLayout.NORTH);
        marco.add(panel2, BorderLayout.CENTER);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obx = e.getSource();
        
        if(obx == bDibuxa){
            num=String.valueOf(numTexto);
            tTexto.setText(num);
            for(int i = 0;numTexto == i;i++){
            
            Graphics g = panel2.getGraphics();
            g.drawOval(10, 10, 10, 10);
            }
        }else
            panel2.repaint();
            
            
            
    }
    
}
