/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.SwingUtilities;
import proyecto.login.Login;

/**
 *
 * @author Emanuel P
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable runApplication = new Runnable() {
            @Override
            public void run() {
            Login principal = new Login();
            }
        };
       
        
     SwingUtilities.invokeLater(runApplication);
    }
    
}
