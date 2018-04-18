/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Punto2 {
    public static void main(String[] args) {
        
        // Creamos el metodo Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Declaramos e inicializamos la clase Rectangulo.
        Rectangulo rectangulo = new Rectangulo();

        
        // Pedimos que el usuario ingrese por consola los datos a solicitar
        System.out.println("Ingrese el punto x");
        // Se guarda el dato directamente en .nextDouble().
        double x = scanner.nextDouble();
        System.out.println("Ingrese el punto y");
        double y = scanner.nextDouble();
        System.out.println("Ingrese la base");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura");
        double altura  = scanner.nextDouble();
        
        
        // Llamamos al metodo datosFaltantes que se encuentra en la clase Rectangulo.
        rectangulo.datosFaltantes(x, y, base, altura);
        
        // Mostramos por consola la superficie y perimetro del rectangulo
        // Y llamamos al metodo superficie y perimetro de la clase Rectangulo con los respectivos parametros
        System.out.println("La superficie del rectangulo es: "+rectangulo.superficie(base, altura));
        System.out.println("El perimetro del rectangulo es: "+rectangulo.perimetro(base, altura));
    }
    
    
}
