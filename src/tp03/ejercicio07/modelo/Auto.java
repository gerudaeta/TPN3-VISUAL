/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio07.modelo;

import java.util.Scanner;

/**
 *
 * @author Sofia Soto
 */
public class Auto {
     private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipoCombustible;
    //se declara de tipo String la pantente, marca,modelo, color, tipoCombustible//
    public Auto(String patente, String marca, String modelo, String color, String tipoCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
    }
    //al realizar un constructor se obtiene los get y set //
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    //se muestra auto y se utliza los get que es para obtener la información//
    public void mostrarAuto(){
        System.out.println("============ Informacion del auto ================");
        System.out.println("Patente: " + getPatente());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
        System.out.println("Tipo de Combustible: "+ getTipoCombustible());
    }
    //modifica la informacion del auto//
    public void modificarAuto(){
        System.out.println("============ Modificacion de la informacion del auto ================"); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================================================================");
        System.out.println("Anterior Patente: " + getPatente());
        System.out.print("Nueva Patente: ");
        this.patente = scanner.next();
        System.out.println("===========================================================================");
        System.out.println("Anterior Marca: " + getMarca());
        System.out.print("Nueva Marca: ");
        this.marca = scanner.next();
        System.out.println("===========================================================================");
        System.out.println("Anterior Modelo: " + getModelo());
        System.out.print("Nuevo Modelo: ");
        this.modelo = scanner.next();
        System.out.println("===========================================================================");
        System.out.println("Anterior Color: " + getColor());
        System.out.print("Nuevo Color: ");
        this.color = scanner.next();
        System.out.println("===========================================================================");
        System.out.println("Anterior Tipo de Combustible: " + getTipoCombustible());
        System.out.print("Nuevo Tipo de Combustible ");
        this.color = scanner.next();
    }
}
