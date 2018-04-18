/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio05;

import java.util.ArrayList;

/**
 *
 * @author german
 */
public class GestorCirculo {
    
    private ArrayList<Circulo> circulos = new ArrayList();

    public ArrayList<Circulo> getCirculos() {
        return circulos;
    }

    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }
     /**
      @return Agrega un objeto circulo a la lista de cirulos 
      */   
    public void AgregarCirculos(Circulo a){
            this.circulos.add(a);  
    } 
    
}
