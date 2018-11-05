/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alerta;

import javafx.scene.control.TextField;

/**
 *
 * @author Faruque Braimo
 */
public class Validacoes  extends TextField{
    
   
    
    public void soLetras( int i, int a, String string) {
        if( string.matches("[0-9]") || string.isEmpty()) {
            super.replaceText(a, a, string);
        }
        
    }

    @Override
    public void replaceSelection(String string) {
        super.replaceSelection(string); //To change body of generated methods, choose Tools | Templates.
    }

  
}
