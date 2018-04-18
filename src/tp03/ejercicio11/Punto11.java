/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author german
 */
public class Punto11 {
    
    public static void main(String[] args) {
        
        // Creamos el metodo Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Se crea un ArrayList de tipo Zapatilla
        ArrayList<Zapatilla> zapatillasArray = new ArrayList<Zapatilla>();
        // Se inicializa y crea la clase Zapatilla
        Zapatilla zapatilla = new Zapatilla();
        
        // creamos una variable de tipo entero que inicia en 0;               
        int limite = 0;
        
        do {
            zapatilla = new Zapatilla();
            
            // Pedimos que el usuario ingrese por consola los datos del libro
            System.out.println("Ingrese la marca: ");
            zapatilla.setMarca(scanner.nextLine());

            System.out.println("Ingrese la calidad de la zapatilla: ");
            System.out.println("Original / Copia");
            zapatilla.setCalidad(scanner.nextLine());          

            System.out.println("Ingrese el talle: ");
            zapatilla.setTalle(scanner.nextInt());
            scanner.nextLine();//Limpiar buffer
            System.out.println("Ingrese el Precio: ");
            zapatilla.setPrecio(scanner.nextDouble());
            
            
            // Una vez que el usuario ingresa por consola los datos
            // Luego la zapatilla ingresada se agrega al ArrayList
            zapatillasArray.add(zapatilla);
            
            System.out.println("Desea seguir ingresando datos?");
            System.out.println("Si desea ingresar mas datos ingrese 1, de lo contrario 0");
            limite = scanner.nextInt();
            scanner.nextLine();//Limpiar buffer            
            
        } while(limite != 0);
        
        // Con el metodo Iterator se recorre por completo el ArrayList
            // Y luego llamamos al metodo mostrarLibro que se encuentra en la clase Libro
            // Para muestre los datos de los libros
            
        System.out.println("---------------------------");
        Iterator<Zapatilla> it = zapatillasArray.iterator();        
        while (it.hasNext()){
            zapatilla = it.next();
            zapatilla.mostrarDatos();
        }
    }
    
}
