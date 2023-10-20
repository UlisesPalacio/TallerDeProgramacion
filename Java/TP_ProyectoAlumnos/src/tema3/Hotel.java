/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Usuario
 */
public class Hotel {
    private int dimf;
    private Habitaciones[] habitaciones;
    
    public Hotel(int dimf){
        this.dimf = dimf;
        this.habitaciones = new Habitaciones[dimf];
        for(int i=0;i<dimf;i++){
           this.habitaciones[i] = new Habitaciones();
        }
        
    }
    
    public Hotel(){
        
    } 
    
    public void setValores(){
        for(int i = 0;i<dimf;i++){
            this.habitaciones[i].setCosto(2000+GeneradorAleatorio.generarInt(6000));
        }
    }
    
    public boolean verificarHabitacion(int num){
        return this.habitaciones[num].getOcupada();
    }
    
    public void cargarCliente(Cliente cliente,int num){
        this.habitaciones[num].setCliente(cliente);
    }
    
    
    public void setAumento(double valor){
        for(int i=0;i<dimf;i++){
            this.habitaciones[i].setCosto(this.habitaciones[i].getCosto() + valor);
        }
    }
    
    @Override
    public String toString(){
        String aux = "";
        for(int i = 0;i<dimf;i++){
            aux +="habitacion " + (i+1) + ": " + habitaciones[i].getCosto() + " esta " + habitaciones[i];
        }
        return aux;
    }
    
    
        
}
    
    
    

