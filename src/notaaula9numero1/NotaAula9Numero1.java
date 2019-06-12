/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaaula9numero1;

import javax.swing.JOptionPane;

/**
 *
 * @author A06163709
 */
public class NotaAula9Numero1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ExcValidaNome exc = new ExcValidaNome();

        try {
            exc.validaNome(JOptionPane.showInputDialog(null, "Informe um número"));
        } catch (ExcecaoNome e) {
            JOptionPane.showMessageDialog(null, e.nomeDigitado());
        }

    }

}
