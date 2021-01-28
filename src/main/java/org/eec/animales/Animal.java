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
public abstract class Animal {
    
    protected boolean isAlive;
    protected Animal(){
        super();
        this.isAlive = true;
    }
    
    public abstract boolean isAlive();
} // fin: clase abstracta Animal
