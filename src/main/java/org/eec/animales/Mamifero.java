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
public abstract class Mamifero extends Animal{
    
    protected boolean isLactating;
    
    protected Mamifero(){
        super();
        this.isLactating = false;
    }
    
    public abstract boolean isLactating();
} // fin clase abstracta Mamifero
