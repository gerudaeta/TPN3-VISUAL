/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Sofia Soto
 */
public class ejer4 {
     public static void main(String[] args) {
        double num [] = new double[3]; //num va a ser de tipo double //
        Scanner scanner = new Scanner(System.in); // especifica el nombre de entrada y el tipo de Scanner de una variable utilizada en el este programa//
        Arreglo arreglo = new Arreglo(); //se utiliza arreglo//
        
        System.out.println("Ingrese 10 numeros"); //se muestra un mesaje diciendo que ingrese 10 numeros//
        //un ves que se pide que se ingrese los números se realiza un for//
        for (int i = 0; i < num.length; i++){
            //muestra un mensaje diciendo que Num más i más 1  //
            System.out.print("Num"+i+1+": ");
            //al arreglo num[i] se le asigna el scanner.nextDouble//
            num[i] = scanner.nextDouble();
        }
        
        arreglo.muestraMayoryMenor(num); //se pide que de arreglo se obtenga el num//
        System.out.println("el promedio es: " + arreglo.promedio(num) ); //se muestra el promedio//
        arreglo.muestra(num); //se utiliza el arreglo.muestra con la variable num//
        
        
        
    }
}
