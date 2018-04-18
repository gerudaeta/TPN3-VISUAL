/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio12.util;

import java.util.ArrayList;
import java.util.List;
import tp03.ejercicio12.modelo.Autor;
import tp03.ejercicio12.modelo.Categoria;
import tp03.ejercicio12.modelo.Libro;

/**
 *
 * @author gabriel
 */
public class Lista {
    
    //Creacion de objetos de la clase Arraylist
    java.util.List <Categoria> categoria = new ArrayList<Categoria>();
    java.util.List <Autor> autor = new ArrayList<Autor>();
    List <Libro> libro = new ArrayList<Libro>();
    
    //agrega la categoria a la lista categoria
    public void agregarCategoria (String NomCategoria){
        categoria.add(new Categoria(NomCategoria));
    } 
    
    //agrega el nombre de autor a la lista autor
    public void agregarAutor (String NomAutor){
        autor.add(new Autor(NomAutor));
    }
    
    //agrega nombre, categoria y autor a la lista libro
    public void agregarLibro (String Nombre,int r1,int r2){
        libro.add(new Libro(Nombre,categoria.get(r1).getCategoria(),autor.get(r2).getNombre()));
    }
    
    //muestra el listado de categorias
    public void mostrarListadeCategoria(){
        System.out.println("-----------Lista de Categorias--------------");
        for (int i=0; i<=categoria.size()-1;i++){
            System.out.println("Categoria: "+categoria.get(i).getCategoria());
        }
        System.out.println("-------------------------");
    }
    
    //muestra el listado de autores
    public void mostrarListadeAutores(){
        System.out.println("-----------Lista de Autores--------------");
        for (int i=0; i<=autor.size()-1;i++){
            System.out.println("Autores: "+autor.get(i).getNombre());
        }
        System.out.println("-------------------------");
    }
    
    //muestra la tabla de libros
    public void mostrarLibro (){
        System.out.println("------------- Lista de Libros -------------------------");
        for (int i=0; i<=libro.size()-1;i++){
            System.out.println("Nombre: "+libro.get(i).getNombre()+" Categoria: "+libro.get(i).getCategoria()+"      Autor:"+libro.get(i).getAutor());
        }
        System.out.println("------------------------------------------------------");
    }
    
    //busca y muestra en la lista libros el nombre del autor recibido
    public void buscarporAutor (String Autor){
        System.out.println("-------Libros buscados por el Autor: "+Autor+"----------");
        for (int i=0; i<=libro.size()-1;i++){
            if (libro.get(i).getAutor().equals(Autor)){
                System.out.println("Nombre: "+libro.get(i).getNombre()+" Categoria: "+libro.get(i).getCategoria()+"      Autor:"+libro.get(i).getAutor());
            }            
        }
        System.out.println("-------------------------");
    }
    
    //busca y muestra en la lista libros segun la categoria recibida 
    public void buscarporCategoria (String Categoria){
        System.out.println("-------Libros buscados por Categoria: "+Categoria+"----------");
        for (int i=0; i<=libro.size()-1;i++){
            if (libro.get(i).getCategoria().equals(Categoria)){
                System.out.println("Nombre: "+libro.get(i).getNombre()+" Categoria: "+libro.get(i).getCategoria()+"      Autor:"+libro.get(i).getAutor());
            }            
        }
        System.out.println("-------------------------");
    }
}
