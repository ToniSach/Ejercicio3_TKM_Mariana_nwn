package ejer2;

/**
 *
 * @author tonis
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana1 extends JFrame {
    public Ventana1(){
        proceso();
        
        Panel1 obj = new Panel1();
        this.add(obj);
        this.pack();
    }
    
    private void proceso(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio 2 :)");
        setMinimumSize(new Dimension(700, 400));
        setResizable(false);
        pack();
        
    }

}
