/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eec.animales;

/**
 *
 * @author erick
 */
public class CaballoDomesticado extends Caballo {

    
    
    @Override
    public void acariciar() {
        System.out.println("El caballo cariñosamente acepta la caricia.");
    }

    @Override
    public boolean isLactating() {
        return false;
    }

    @Override
    public boolean isAlive() {
        return true;
    }
    
} //-- fin de clase concreta CaballoDomesticado
