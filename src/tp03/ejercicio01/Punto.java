/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio01;

/**
 *
 * @author Sofia Soto
 */
public class Punto {
    
    public double distancia (double num1,double num2){
        double resta = 0; // se inicializa resta en cero que será de tipo double//
        //ahora se ha´ra un comparación entre los dos números ingresados si son iguales o no//
        if (num1 == num2 ){
            //al ser iguales se mostrará un mensaje diciendo que son iguales //
            System.out.println("los dos parametros ingresados son iguales");
        }else{
            //en caso contrario se hara otra comparación si el primer número es mayor o no//
            if (num1 > num2){
                //si el primer número es mayor, se restará el primer número menos el segundo número//
                resta = num1 - num2;
            }else{
                //en caso contrario se restará el segundo número menos el primer número//
                resta = num2 - num1;
            }
        }
        return resta; //se retorna a resta//
    }
}


