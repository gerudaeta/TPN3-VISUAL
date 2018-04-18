/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio5;

/**
 *
 * @author german
 */
public class Circulo {
    // Atributo de la clase Circulo
    private double radio;
    private String color;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    
    
    
    public Circulo(double radio){
        this.radio = radio;
    }

    // Metodos de acceso getter & setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    // Metodo para calcular la superficie del circulo
    // devuelve un valor double
    public double CalcularSup(double r){    
        return Math.PI*Math.pow(r, 2);
    }
    
    public double CalcularPer(double r){    
        return 2*Math.PI*r;
    }
    
    
}
