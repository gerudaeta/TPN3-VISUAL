/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio2;

/**
 *
 * @author german
 */
public class Rectangulo {
    
    /*
        Metodo que muestra los datos que faltan, se pasan como parametro x1,y1
        base y altura con sus respectivos tipos de datos.
    */    
    public void datosFaltantes (double x1 , double y1 , double base , double altura){
        System.out.println("Las Coordenadas de los puntos del rectangulo son:");
        System.out.println("Punto 1 es x1 = "+x1 + ", y1 = "+y1);
        System.out.println("Punto 2 es x2 = "+(x1 + base) + ", y2 = "+y1);
        System.out.println("Punto 3 es x3 = "+x1 + ", y3 = "+(y1 + altura));
        System.out.println("Punto 4 es x4 = "+(x1 + base) + ", y4 = "+ (y1+altura));
    }
    
    // metodo superficie devuelve un valor de tipo double
    // sus parametros son la base y altura del rectangulo
    public double superficie (double base, double altura){
        return base * altura;   
    }
    
    // metodo perimetro devuelve un valor de tipo double
    // sus parametros son la base y altura del rectangulo con sus tipos de datos
    public double perimetro (double base , double altura){
        return 2 * (base + altura);
    }
}
