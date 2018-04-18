/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio12.modelo;

/**
 *
 * @author gabriel
 */
public class Autor {
    private String Nombre;

    //constructor
    public Autor(String Nombre) {
        this.Nombre = Nombre;
    }

    // get y set
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
