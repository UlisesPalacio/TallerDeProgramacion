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
public abstract class  Empleado {
    private String nombre;
    private double sueldoB;
    private int antiguedad;
    
    public Empleado(String nombre,double sueldoB,int antiguedad){
        this.nombre = nombre;
        this.sueldoB = sueldoB;
        this.antiguedad = antiguedad;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldoB(){
        return sueldoB;
    }
    
    public void setSueldoB(double sueldoB){
        this.sueldoB = sueldoB;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    
    public void setAntiguedad(int antiguedad){
       this.antiguedad = antiguedad;
    }
    
    public abstract double calcularEfectividad();
    public abstract double calcularSueldoAcobrar();
    
    public String toString(){
        String aux;
        return aux =" nombre  " + this.nombre + " sueldoB: " + this.calcularSueldoAcobrar() + " efectividad  " + this.calcularEfectividad();
    }

        
    
    

}
