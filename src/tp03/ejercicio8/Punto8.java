/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author germa
 */
public class Punto8 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        // Se crea un ArrayList de tipo Libro
        ArrayList<Libro> librosArray = new ArrayList<Libro>();
        // Se inicializa y crea la clase Libro
        Libro libro = new Libro();

        // Pedimos que el usuario ingrese cuantos libros desea ingresar
        System.out.println("Cuantos libros desea ingresar?");
        int limite = scanner.nextInt();
         
        // Utilizamos for para recorrer el ArrayList
        // Y que se vaya incrementando hasta que el usuario termine de ingresar los libros
        for(int i = 0; i < limite; i++){
            
            libro = new Libro();
            
            // Pedimos que el usuario ingrese por consola los datos del libro
            System.out.println("Ingrese el ISBN del libro: ");
            libro.setIsbn(scanner.nextInt());
            scanner.nextLine();//Limpiar buffer
            System.out.println("Ingrese el Titulo del libro: ");
            libro.setTitulo(scanner.nextLine());

            System.out.println("Ingrese el Autor del libro: ");
            libro.setAutor(scanner.nextLine());

            System.out.println("Ingrese el Precio del libro: ");
            libro.setPrecio(scanner.nextDouble());
            
            // Una vez que el usuario ingresa por consola los datos
            // Luego el libro ingresado se agrega al ArrayList
            librosArray.add(libro);
            
            // Con el metodo Iterator se recorre por completo el ArrayList
            // Y luego llamamos al metodo mostrarLibro que se encuentra en la clase Libro
            // Para muestre los datos de los libros
            System.out.println("---------------------------");
            Iterator<Libro> it = librosArray.iterator();        
            while (it.hasNext()){
                libro = it.next();
                libro.mostrarLibros();
            }
        }
    }
    
}
