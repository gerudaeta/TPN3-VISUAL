/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio8;

/**
 *
 * @author germa
 */
public class Libro {
    
    /**
    * Atributos de la clase Libro con sus respectivos tipo de datos
    */
    private int isbn;
    private String titulo;
    private String autor;
    private double precio;

    /**
    * Se crea el metodo constructor de la clase
    */
    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    /**
    * Metodos Getter & Setter, son metodos de acceso, siempre son publicos.
    * Getter: nos sirve para obtener (recuperar o acceder) 
    * el valor ya asignado a un atributo y utilizarlo para cierto método.
    * 
    * Setter: sirve para asignar un valor inicial a un atributo,
    * pero de forma explícita, además el Setter nunca retorna nada
    * (Siempre es void), y solo nos permite dar acceso público a ciertos
    * atributos que deseemos el usuario pueda modificar.
    */
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
    public void mostrarLibros (){
        System.out.println("============ Informacion del Libro =============");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Precio: " + getPrecio());
        System.out.println("---------------------------------");
    }
    
}
