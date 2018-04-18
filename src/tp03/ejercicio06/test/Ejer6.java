/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio06.test;

import tp03.ejercicio06.modelo.Rectangulo;
import tp03.ejercicio06.util.GestorRectangulo;
/**
 *
 * @author gabriel-not
 */
public class Ejer6 {
    public static void main(String[] args) {
        //creacion y definicion de tres clases rectangulo 
        //el primer y segundo parametro corresponde al eje x y eje y
        //el tercer parametro corresponde a la base
        //el cuarto parametro corresponde a la altura
        Rectangulo r1 = new Rectangulo(2, 2, 5, 3); 
        Rectangulo r2 = new Rectangulo(4, 3,10, 6);
        Rectangulo r3 = new Rectangulo(6, 4,10, 2);
        
        //creacion y definicion del objetos GestorRectangulo 
        GestorRectangulo gr = new GestorRectangulo();
        
        //se agrega los valores del rectangulo al arraylist mediante el metodo agregarRectangulo
        gr.agregarRectangulo(r1);
        gr.agregarRectangulo(r2);
        gr.agregarRectangulo(r3);
        
        //muestra toda la informacion del rectangulo 
        System.out.println("=================================== Rectangulo ====================================");
        System.out.println("Punto "+"\t\tBase "+"\t\tAltura "+"\t\tSuperficie "+"\t\tPerimetro ");
        for (Rectangulo rectangulo: gr.getRectangulo()){
            rectangulo.mostrarRectangulo();
        }
        System.out.println("===================================================================================");
        
        //muestra el tamañao del arraylist mediante el metodo tamañoarraylist
        System.out.println("Tamaño del ArrayList (contando desde el 0): "+gr.tamañoArraylist());
        
        //eliminar un elemento del arraylist de la posicion 1
        gr.eliminarElementoArraylist(1);
        
        //muestra toda la informacion del rectangulo 
        System.out.println("=================================== Rectangulo ====================================");
        System.out.println("Punto "+"\t\tBase "+"\t\tAltura "+"\t\tSuperficie "+"\t\tPerimetro ");
        for (Rectangulo rectangulo: gr.getRectangulo()){
            rectangulo.mostrarRectangulo();
        }
        System.out.println("===================================================================================");
    }
    
}
