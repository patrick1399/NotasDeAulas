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
public class Conta {

    double saldo;

    public void saca(double valor) {
        if (this.saldo < valor) {
            throw new IllegalArgumentException("Impossível sacar!");
        } else {
            this.saldo -= valor;
        }
    }

    public void deposito(double deposito) {
        this.saldo += deposito;
        JOptionPane.showMessageDialog(null, "Foi depositado");
    }

}
