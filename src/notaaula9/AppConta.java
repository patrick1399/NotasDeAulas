/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaaula9;

import javax.swing.JOptionPane;

/**
 *
 * @author A06163709
 */
public class AppConta {

    public static void main(String[] args) {

        Conta c = new Conta();

        try {
            c.deposito(2000);
            c.saca(30);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

}
