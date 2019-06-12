/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaaula9numero1;

/**
 *
 * @author A06163709
 */
public class ExcValidaNome {

    void validaNome(String nome) throws ExcecaoNome {
        if (!"7".equals(nome)) {
            throw new ExcecaoNome();
        }
    }

}

}
