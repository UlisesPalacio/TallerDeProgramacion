/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Usuario
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio,String colorRe,String colorLi){
        super(colorRe,colorLi);
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    
    public double calcularArea(){
        return Math.round((2*Math.PI*Math.pow(radio,2))*100.0)/100.0;
    }
    
    public double calcularPerimetro(){
        return Math.round((2*Math.PI*radio)*100.0)/100.0;
    }
    
    public String toString(){
        return "Circulo " + super.toString() + "radio " + radio;
    }
    
    
}
