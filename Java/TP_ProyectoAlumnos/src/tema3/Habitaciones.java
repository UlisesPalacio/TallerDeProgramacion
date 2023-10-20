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
public class Habitaciones {
    private double costo;
    private boolean ocupada;
    private Cliente cliente;
    
    public Habitaciones(double suCosto,Cliente unCliente){
      this.costo = suCosto;
      this.ocupada = false;
      this.cliente = unCliente;
    }
    
    public Habitaciones(){
        
    }
    
    public double getCosto(){
        return costo;
    }
    
    public void setCosto(double suCosto){
        this.costo = suCosto;
    }
    
    public boolean getOcupada(){
        return ocupada;
    }
    
    public void setOcupada(boolean ocupada){
        this.ocupada = ocupada;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente unCliente){
        this.cliente = unCliente;
        this.ocupada = true;
    }
    
    
   @Override
    public String toString() {
        if(getOcupada())
            return "OCUPADA por: "+ cliente;
        else
            return "DESOCUPADA";
    }    
  
    
    
}
