/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eec.test;

import org.eec.animales.*;
/**
 *
 * @author erick
 */
public class CaballoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Test de las clases concretas CaballoDomesticado y CaballoSalvaje y ejemplo de Polimorfismo.");
        // Declaracion de variable de referencia de tipo Caballo (superclase de las clases CaballoDomesticado y CaballoSalvaje)
        Caballo caballo1, caballo2;
        caballo1 = new CaballoSalvaje();
        caballo2 = new CaballoDomesticado();
        System.out.println("Reacción del caballo1 [SALVAJE]: ");
        acariciarCaballo(caballo1);
        System.out.println("Reacción del caballo2 [Domesticado]: ");
        acariciarCaballo(caballo2);
    }
    
    private static void acariciarCaballo(Caballo caballo){
        if(caballo == null){
            System.out.println("La referecia pasada al método acariciarCaballo es NULA. Imposible ejemplificar el Polimorfismo.");
        }else{
            caballo.acariciar();
        }
    }
    
} // fin de clase de Test: CaballoTest
