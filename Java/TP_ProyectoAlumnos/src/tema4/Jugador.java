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
public class Jugador extends Empleado{
    
    private int numeroPartidos;
    private int numGoles;
    
    public Jugador(int numeroPartidos,int numGoles,String nom,double sueldoB,int anti){
        super(nom,sueldoB,anti);
        this.numeroPartidos = numeroPartidos;
        this.numGoles = numGoles;
    }
    
    public int getNumeroPartidos(){
        return numeroPartidos;
    }
    
    public void setNumeroPartidos(int numeroPartidos){
        this.numeroPartidos = numeroPartidos;
    }
    
    public int getNumGoles(){
        return numGoles;
    }
    
    public void setNumGoles(int numGoles){
        this.numGoles = numGoles;
    }
    
    public double calcularEfectividad(){
        double jPromedio;
        return jPromedio = this.numGoles /this.numeroPartidos;
    }
    
    public double calcularSueldoAcobrar(){
        double cobro;
        if(calcularEfectividad() > 0.5){
           return  cobro = (0.10 * this.getSueldoB() * this.getAntiguedad()) + this.getSueldoB() + this.getSueldoB();
        }else{
            return cobro = (0.10 * this.getSueldoB() * this.getAntiguedad());
        }
    }    
   
    public String toString(){
        return  super.toString();
    }
    
    
   
    
    
    
    
    
}
