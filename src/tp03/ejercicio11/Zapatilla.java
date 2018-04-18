/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio11;

/**
 *
 * @author german
 */
public class Zapatilla {
    
    /*
        Atributos de la clase Zapatilla
    */
    private String marca;
    private String calidad;
    private int talle;
    private double precio;

    public Zapatilla() {
    }

    public Zapatilla(String marca, String calidad, int talle, double precio) {
        this.marca = marca;
        this.calidad = calidad;
        this.talle = talle;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
    * el metodo mostrarLibros, muestra los datos del libro que se ingreso por consola.
    * utilizamos el metodo de acceso get para acceder a los atributos de la clase Libro
    */    
    public void mostrarDatos (){
        System.out.println("============ Informacion del Libro =============");
        System.out.println("Marca: " + getMarca());
        System.out.println("Calidad: " + getCalidad());
        System.out.println("Talle: " + getTalle());
        System.out.println("Precio: " + getPrecio());
        System.out.println("---------------------------------");
    }
   
    
}
