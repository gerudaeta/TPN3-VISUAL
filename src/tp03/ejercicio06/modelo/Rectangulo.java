/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio06.modelo;

/**
 *
 * @author gabriel-not
 */
public class Rectangulo {
    private double px ,py , base, altura;

    public Rectangulo(double px, double py, double base, double altura) {
        this.px = px;
        this.py = py;
        this.base = base;
        this.altura = altura;
    }

    
    public double calcularSuperficie (){
     return this.getBase()*this.getAltura();   
    }
    
    public double calcularPerimetro (){
        return (2*this.getBase())+(2*this.getAltura());
    }
    
    //muestra de la informacion del rectangulo
    public void mostrarRectangulo (){
        System.out.println("("+getPx()+","+getPy()+")\t"+ getBase()+"\t\t"+getAltura()+"\t\t"+calcularSuperficie()+"\t\t\t"+calcularPerimetro());
    }

    // get y set
    /**
     * @return the px
     */
    public double getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(double px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public double getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(double py) {
        this.py = py;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
