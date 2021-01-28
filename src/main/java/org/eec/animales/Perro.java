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
public class Perro extends Mamifero{
    
    public Perro(){
        super();
    }
    
    /*
    The provided implementation for isAlive() and isLactating() methods
    are simple implementations for demonstration purposes only, since the
    main goal of this exercise focuses on abstract clases, inheritance and 
    Polimorfysm. 
    */
    
    @Override
    public boolean isAlive(){
        return true;
    }
    
    @Override
    public boolean isLactating(){
        return false;
    }
    
    public void bark(){
        System.out.println("Gau, gau!");
    }
} //-- fin de clase concreta Perro
