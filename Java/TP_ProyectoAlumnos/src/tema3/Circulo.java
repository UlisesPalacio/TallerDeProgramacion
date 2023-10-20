/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Usuario
 */
public class Circulo {
    private double radio;
    private String colorRelleno;
    private String colorLinea;
    
    public Circulo(double radio,String colorRelleno,String colorLinea){
        this.radio = radio;
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
    }
    
    public Circulo(){
        
    }
    
    public Double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
     public String getcolorRelleno(){
        return colorRelleno;
    }
    
    public void setColorRelleno(String colorRelleno){
        this.colorRelleno = colorRelleno;
    }
    
     public String getColorLinea(){
        return colorLinea;
    }
    
    public void setColorLinea(String colorLinea){
        this.colorLinea = colorLinea;
    }
    
    public double calcularPerimetro(){
        Double aux= ((2*Math.PI*radio)*100.0)/100.0;
        return aux;
    }
    
    public double calcularArea(){
        double aux = ((Math.PI *radio*radio)*100.0)/100.0;
        return aux;
    }
    
    @Override
    public String toString(){
        return "el radio del circulo es : " + this.getRadio() + "tiene un perimetro de " + this.calcularPerimetro() +"y si area es " + this.calcularArea();
    }
    
    
    
    
    
}
