/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio07.test;

import tp03.ejercicio07.modelo.Auto;

/**
 *
 * @author Sofia Soto
 */
public class Punto7 {
    public static void main(String[] args) {
        
        Auto [] autos = new Auto[2]; 
        
        Auto a1 = new Auto("SC 101", "Toyota", "4x4", "Blanco", "Gasoil");
        Auto a2 = new Auto("SC 222", "ferrari", "4x4", "rojo", "Gasoil");
        Auto a3 = new Auto("SC 333", "Chevrolet Camaro", "auto", "rojo", "Gasoil");
        Auto a4 = new Auto("SC 444", "Chevrolet S10", "4x4", "rojo", "Gasoil");
        Auto a5 = new Auto("SC 555", "Fiat", "auto", "rojo", "Nafta");
        
        //se les asignará las posiciones a los arreglos//
        autos[0] = a1;
        autos[1] = a2;
        autos[2] = a3;
        autos[3] = a4;
        autos[4] = a5;
        //el for para que muestre listado de autos//
        for (Auto a: autos){            
            a.mostrarAuto();
        }
        
        autos[0].modificarAuto(); ////
        
        for (Auto a: autos){            
            a.mostrarAuto();
        }
    }
}
