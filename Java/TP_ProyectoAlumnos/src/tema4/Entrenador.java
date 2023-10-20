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
public class Entrenador extends Empleado{
    
    private int cantCampeonatos;
    
    
    public Entrenador(int cantCampeonatos,String nom,double sueldoB,int anti){
        super(nom,sueldoB,anti);
        this.cantCampeonatos = cantCampeonatos;
    }
    
    public int getCantCampeonatos(){
        return cantCampeonatos;
    }
    
    public void setCantCampeonatos(int cantCampeonatos){
        this.cantCampeonatos = cantCampeonatos;
    }
    
     public double calcularEfectividad(){
        double promedio;
        return promedio = this.cantCampeonatos/ super.getAntiguedad();
    }
     
    public double calcularSueldoAcobrar(){
        double cobro;
        if(cantCampeonatos>=1 && cantCampeonatos<=4){
            return (cobro = 0.10 * super.getSueldoB() * super.getAntiguedad()) + super.getSueldoB() + 5000;
        }else if(cantCampeonatos>=5 && cantCampeonatos<=10){
            return cobro = 0.10 * super.getSueldoB() * super.getAntiguedad()+ super.getSueldoB() + 10000;
        }else if(this.cantCampeonatos>10){
            return cobro = 0.10 * this.getSueldoB() * super.getAntiguedad()+ super.getSueldoB() + 50000;
        }else{
            return cobro = 0.10 * super.getSueldoB() * super.getAntiguedad() + this.getSueldoB();
        }
       
    }
   public String toString(){
       return super.toString();
   }    
}
