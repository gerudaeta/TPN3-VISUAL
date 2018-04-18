/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio03;

/**
 *
 * @author gabriel-not
 */
public class Triangulo {
    public Double perimetro (double lado1 , double lado2 , double lado3){
        double perimetro = 0;
        //Verificacion al crear un triangulo segun los datos ingresados
        if ( lado1 <= 0 || lado2 <= 0 || lado3 <= 0){
            System.out.println("No se pudo calcular el perimetro debido que no se pudo formar el triangulo");
            System.out.println("Motivo: uno de los lados es 0 o es un numero negativo");
        }else{
            // Creacion del tipo de triangulo segun los datos ingresados
            if ( (lado1 == lado2) && (lado1 == lado3)){
                System.out.println("Se formo un triangulo equilatero con exito");
                perimetro = 3* lado1;
            }              
            if ( (lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)){
                System.out.println("Se formo un triangulo escaleno con exito");
                perimetro = lado1 + lado2 + lado3;
            } 
            if ( (lado1 == lado2) && (lado1 != lado3)){
                System.out.println("Se formo un triangulo isosceles con exito");
                perimetro = (2 * lado1)+lado3;
            }
            if ( (lado1 == lado3) && (lado1 != lado2)){
                System.out.println("Se formo un triangulo isosceles con exito");
                perimetro = (2 * lado1)+lado2;
            }
            if ( (lado2 == lado3) && (lado2 != lado1)){
                System.out.println("Se formo un triangulo isosceles con exito");
                perimetro = (2 * lado2)+lado1;
            }
            
        }
            
        return perimetro;
    }
            
}
