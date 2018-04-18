/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Sofia Soto
 */
public class ejer01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // especifica el nombre de entrada y el tipo de Scanner de una variable utilizada en el este programa//
        Punto punto = new Punto();
        
        System.out.println("Ingrese el primer numero"); //se muestra un mensaje diciendo que ingrese el primer numero//
        double num1 = scanner.nextDouble(); // ingresa el  primer número se lo declara de tipo double //
        System.out.println("Ingrese el segundo numero"); // se muestra un segundo mensaje que ingrese el segundo numero//
        double num2 = scanner.nextDouble(); // ingresa el número que también va a ser de tipo double//
        
        System.out.println("La distancia entre los dos numeros es: "+punto.distancia(num1, num2)); // se mmuestra un mensaje que //
    }
}
