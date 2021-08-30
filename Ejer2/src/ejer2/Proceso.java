/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejer2;

/**
 *
 * @author tonis
 */

import java.util.regex.*;
import javax.swing.JOptionPane;

public class Proceso {
    private String texto;
    private String cod="";
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    private String abc = "abcdefghijklnmopqrstuvwxyz";
    private String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String num = "0123456789";
    String arreglo[] = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","8","88","888","9","99","999","9999"};
    
    public String Proceso(String texto){
        
        String patron="[^a-z^A-Z\\s]";
        Pattern p1 = Pattern.compile(patron);
        Matcher m = p1.matcher(texto);
        boolean coinc = m.find();
        
        if (coinc==true) {

            Panel1 pan = new Panel1();
            pan.textoE.setText("");
            pan.textoS.setText("");
            JOptionPane.showMessageDialog(null, "Error, introduce catacteres validos");

        }
        
        for (int i = 0; i < texto.length(); i++) {
            
            if (texto.charAt(i)==' ') {
                    cod=cod+"---";
                }
            
            for (int j = 0; j < abc.length(); j++) {
                
                char c = abc.charAt(j);
                
                if (c==texto.charAt(i)) {
                    
                    cod=cod+" "+arreglo[j];
                    
                } 
                
                /*
                 
                */
            }
            /**/
            for (int k = 0; k < ABC.length(); k++) {
             
                char c = ABC.charAt(k);
                
                if (c==texto.charAt(i)) {
                    
                    cod=cod+" "+arreglo[k];
                    
                }
                
            }
            /*
            for (int l = 0; l < num.length(); l++) {
             
                char c = num.charAt(l);
                
                if (c==texto.charAt(i)) {
                    
                    cod=cod+" "+arrenum[l];
                    
                }
                
            }*/
        }

        return cod;
    }
}
