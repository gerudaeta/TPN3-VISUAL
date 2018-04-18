/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio10.test;

import java.util.Scanner;
import tp03.ejercicio10.modelo.CuotaPro;

/**
 *
 * @author Sofia Soto
 */
public class TestEjer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // especifica el nombre de entrada y el tipo de Scanner de una variable utilizada//
        
        System.out.println("Ingrese cantidad de cuotas"); //se muestra un mensaje diciendo que ingrese la cantidad de cuota//
        int num = scanner.nextInt(); //num de tipo entero sera igual a scanner.nextInt//
         CuotaPro [] cuotas = new CuotaPro [num]; 
        
        double preuni = 1000; //preuni de tipo double inicia 1000//
        double total=0; //total de tipo double comienza en cero//
        //se realiza un for en donde i de tipo int, luego i menos que la longitud de cuotas//
        for (int i=0;i < cuotas.length; i++){
            
            CuotaPro c1 = new CuotaPro("115", "cuentas de gas", preuni );
            cuotas [i] = c1; //se le asigna la posición a un objeto//
            preuni = preuni + (preuni*1.5/100); //se calcula el preuni//
            total = total + preuni; //total sera igual a total más preuni//
        }
        //se realiza un for para obtener la cuota//
        for (CuotaPro c:cuotas){
            c.obtenerCuota();
        }
        
        System.out.println("Total a pagar: " + total); //se mostrara el total a pagar//
    }
}
