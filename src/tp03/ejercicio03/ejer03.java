/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio03;

import java.util.Scanner;

/**
 *
 * @author gabriel-not
 */
public class ejer03 {
    public static void main(String[] args) {
        //Creacion y definicion de la clase triangulo
        Triangulo triangulo = new Triangulo();
        Scanner scanner = new Scanner(System.in);
         
        //Ingreso de los 3 lados de un triangulo mediante uso de scanner
        System.out.println("Ingrese el lado1 del triangulo");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingrese el lado2 del triangulo");
        double lado2 = scanner.nextDouble();
        System.out.println("Ingrese el lado3 del triangulo");
        double lado3 = scanner.nextDouble();
        
        //triangulo.perimetro recibe los tres lados de un triangulo 
        //para verificar si se puede formar el triangulo y de esa manera obtener el perimetro
        System.out.println("El perimetro del triangulo es: " + triangulo.perimetro(lado1, lado2, lado3));
    }
}
