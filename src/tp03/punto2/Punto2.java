/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.punto2;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Punto2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Ingrese el punto x");
        double x = scanner.nextDouble();
        System.out.println("Ingrese el punto y");
        double y = scanner.nextDouble();
        System.out.println("Ingrese la base");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura");
        double altura  = scanner.nextDouble();
    }
    
    
}
