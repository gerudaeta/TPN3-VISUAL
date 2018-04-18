/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio09.util;

import java.util.ArrayList;
import tp03.ejercicio09.modelo.Libros;

/**
 *
 * @author gabriel-not
 */
public class GestorLibros {
    //creacion de un arraylist de objeto
    private ArrayList <Libros> libros = new ArrayList ();

    //get y set
    /**
     * @return the libros
     */
    public ArrayList <Libros> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(ArrayList <Libros> libros) {
        this.libros = libros;
    }
    
    //constructor
    public void agregarLibros (Libros libro){
        this.libros.add(libro);
        System.out.println("Libro cargado con exito");
        
        
    }     

    //busca en el arraylist el titulo del libro
    public void buscarLibros (String titulo){
        int cont=0;
        for (Libros libros:  getLibros()){
            if (titulo.equals(libros.getTitulo())){
                System.out.println("El Libro "+titulo +" encontrado con exito"); 
                libros.mostrarLibros(); 
                cont ++;
            }   
        }
        if (cont ==0){
            System.out.println("El Libro "+titulo+" no fue encontrado");
        }
    }
}
