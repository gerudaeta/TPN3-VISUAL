/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio09.test;

import tp03.ejercicio09.modelo.Libros;
import tp03.ejercicio09.util.GestorLibros;

/**
 *
 * @author gabriel-not
 */
public class TestEjer9 {
    public static void main(String[] args) {
        //Creacion y declaracion de un objeto mediante la clase Libros
        //primer parametro recibe el ISBN
        //Segundo parametro recibe el nombre del libro
        //Tercer parametro recibe el autor
        //Cuarto parametro recibe el precio del libro
        Libros l1 = new Libros("115", "Programacion en c++", "Joyanes Aguilar", 240);
        Libros l2 = new Libros("116", "Seguridad en Aplicaciones Web JAVA", "Ortega Candel, Jose Manuel", 300);
        
        //Creacion y declaracion de un objeto mediante la clase GestorLibros
        GestorLibros gl = new GestorLibros();
        
        //agregarLibros agrega el objeto libro al arraylist
        gl.agregarLibros(l1);
        gl.agregarLibros(l2);
        
        //busca en el arraylist mediante su titulo
        gl.buscarLibros("Programacion en c++");
        gl.buscarLibros("Assasin Creed");
        
    }
}
