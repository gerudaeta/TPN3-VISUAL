/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio12.test;


import java.util.Random;
import tp03.ejercicio12.util.Lista;

/**
 *
 * @author gabriel
 */
public class TestEjer12 {
    public static void main(String[] args) {
        //Creacion de un objeto de la clase Random
        Random rnd = new Random();
        //Creacion de un objeto de la clase Lista
        Lista lista1 = new Lista ();
        
        //manda y agrega el nombre de la categoria a la lista categoria
        lista1.agregarCategoria("Informatica");
        lista1.agregarCategoria("Computacion");
        
        //manda y agrega el nombre del autor a la lista autor
        lista1.agregarAutor("Joyanes Aguilar");
        lista1.agregarAutor("Vazques Cuesta");
        lista1.agregarAutor("Borja");
       
        //crea dos variables enteras
        int r1,r2;
        
        for (int i=0; i<=5;i++){
            //la variable r1 se le asigna valores aleatorios entre 0 y 1
            r1 = (int)(rnd.nextDouble() * 2.0);
            //la variable r2 se le asigna valores aleatorios entre 0 y 2
            r2 = (int)(rnd.nextDouble() * 3.0);
            
            //el primer parametro es el nombre del titulo
            //el segundo y tercer parametro son las posiciones de la lista categoria y titulo
            //que se le asiganara a la lista libro
            lista1.agregarLibro("Libro "+(i+1),r1,r2);
        }
        
        //muestra en forma de tabla la informacion de los libros ingresados
        lista1.mostrarLibro();
        
        //busca y muestra los libros segun el autor mandado
        lista1.buscarporAutor("Joyanes Aguilar");
        
        //busca y muestra los libros segun la categoria mandada
        lista1.buscarporCategoria("Computacion");
        
    }
}
