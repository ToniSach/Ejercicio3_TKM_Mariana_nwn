package ejer2;

/**
 *
 * @author tonis
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;

public class Panel1 extends JPanel{
    
    JButton codificar, limpiar;
    JLabel titulo, texto, combinacionteclas;
    JTextField textoE;
    JTextArea textoS;
    
    public Panel1(){
        componentes();
        this.setBackground(Color.decode("#CDCDCD"));
        setLayout(null);
    }
    
    public void componentes(){
        codificar = new JButton("Codificar");
        codificar.setBackground(Color.decode("#161569"));
        codificar.setBounds(390, 330, 120, 25);
        codificar.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        codificar.setForeground(Color.decode("#D3E7F3"));
        codificar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Proceso u = new Proceso();
                textoS.setText(u.Proceso(textoE.getText()));
            }
        });
        add(codificar);
        
        limpiar = new JButton("Limpiar");
        limpiar.setBackground(Color.decode("#161569"));
        limpiar.setBounds(550, 330, 120, 25);
        limpiar.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        limpiar.setForeground(Color.decode("#D3E7F3"));
        limpiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textoS.setText("");
                textoE.setText("");
            }
        });
        add(limpiar);
        
        titulo = new JLabel("EJERCICIO 2");
        titulo.setBounds(245, 10, 430, 30);
        titulo.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        titulo.setForeground(Color.decode("#2D3A54"));
        add(titulo);
        
        texto = new JLabel("TEXTO:");
        texto.setBounds(30, 55, 190, 100);
        texto.setFont(new Font("Arial", Font.ITALIC, 15));
        texto.setForeground(Color.decode("#2D3A54"));
        add(texto);
        
        combinacionteclas = new JLabel("COMBINACIÓN TECLAS:");
        combinacionteclas.setBounds(30, 150, 300, 30);
        combinacionteclas.setFont(new Font("Arial", Font.ITALIC, 15));
        combinacionteclas.setForeground(Color.decode("#2D3A54"));
        add(combinacionteclas); 
                
        textoE = new JTextField("");
        textoE.setBounds(240, 75, 400, 30);
        textoE.setFont(new Font("Arial", Font.ITALIC, 15));
        textoE.setForeground(Color.decode("#2D3A54"));
        add(textoE); 
        
        textoS = new JTextArea(400, 150);
        textoS.setBounds(240, 150, 400, 150);
        textoS.setFont(new Font("Arial", Font.ITALIC, 15));
        textoS.setForeground(Color.decode("#2D3A54"));
        textoS.setLineWrap(true);
        textoS.setWrapStyleWord(true);
        textoS.enable(false);
        add(textoS); 
    }
}
