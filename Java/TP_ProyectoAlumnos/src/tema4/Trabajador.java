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
public class Trabajador extends Persona {
    private String servicio;
    
    public Trabajador(String nombre,int dni,int edad,String servicio){
        super(nombre,dni,edad);
        this.servicio = servicio;
    }
    
    public String getServicio(){
        return servicio;
    }
    
    public void setServicio(String servicio){
        this.servicio = servicio;
    }
    
    @Override
    public String toString(){
        return super.toString() + "ademas mi trabajo es " + this.getServicio();
    }
}
