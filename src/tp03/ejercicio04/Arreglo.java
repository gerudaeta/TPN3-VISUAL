/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio04;

/**
 *
 * @author Sofia Soto
 */
public class Arreglo {
    //se calcula el mayor y menor //
    public void muestraMayoryMenor (double [] num){
        // se inicializa mayo, menor y suma que van a ser de tipo double//
        double mayor = 0 ,menor = 0, suma = 0;
        //se utiliza un for que i va a ser entero igual a cero, menor que la longitud de num//
        for (int i = 0; i < num.length; i++){
            //se utiliza un condición si i es igual a cero//
            if (i == 0){
                //a mayor y menor se le asigna el arreglo num[i]//
                mayor = num[i];
                menor = num[i];
            }else{
                //en caso contrario se compara si el arreglo num[i] es mayor o igual a mayor//
                if ( num[i] >= mayor){
                    //si lo es, a mayor se le asigna el arreglo num[i]//
                    mayor = num[i];
                } 
                //se compara el arreglo num[i] es menor o igual a menor//
                if ( num[i] <= menor){
                    //si lo es, a menor se le asigna el arreglo num[i]//
                    menor = num[i];
                }  
            }
            //a sume se le asigna suma más el arreglo num [i]//
            suma = suma + num[i];
        }
        System.out.println("el mayor numero del arreglo es "+ mayor); //se muestra el número mayor del arreglo//
        System.out.println("el menor numero del arreglo es "+ menor); //se muestra el número menor del arreglo//
    } 
    //se calcula el promedio//
    public double promedio ( double [] num){
        double suma = 0; //se inicializa la variable suma en cero//
        //se utiliza un for que i va a ser entero igual a cero, menor que la longitud de num//
        for (int i = 0; i < num.length; i++){
            //a sume se le asigna suma más el arreglo num [i]//
            suma = suma + num[i];
        } 
        //se retorna a suma / num.length//
    return (suma / num.length);
    }
    //se muestra el arreglo//
    public void muestra ( double [] num){
        System.out.println("Muestra del arreglo"); //muestra un mensaje diciendo Muestra del arreglo//
        //se utiliza un for que i va a ser entero igual a cero, menor que la longitud de num//
        for (int i = 0; i < num.length; i++){
            
            System.out.println("Indice "+i+" valor: "+ num[i]); //se muestra el indicie y el valor//
        }
    }
}
