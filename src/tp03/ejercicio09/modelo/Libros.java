/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio09.modelo;



/**
 *
 * @author gabriel-not
 */
public class Libros {
    private String ISBN, Titulo, Autor;
    private double precio;

    //constructor
    public Libros(String ISBN, String Titulo, String Autor, double precio) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.precio = precio;
    }
            
    // get y set
    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    // muestra de la informacion de los libros
    public void mostrarLibros (){
        System.out.println("=============== Informacion del Libro ===============");
        System.out.println("ISBN:" + this.ISBN);
        System.out.println("Titulo: "+this.Titulo);
        System.out.println("Autos: "+this.Autor);
        System.out.println("Precio: "+this.precio);
        System.out.println("=====================================================");
    }
}
