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
public class Cliente {
    private String nombre;
    private int dni;
    private int edad;
    
    public Cliente(String unNombre,int unDni,int unaEdad){
        this.nombre = unNombre;
        this.dni = unDni;
        this.edad = unaEdad;
    }

    public Cliente() {
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public int getDni(){
        return dni;
    }
    
    public void setDni(int unDni){
        this.dni = unDni;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int unaEdad){
        this.edad = unaEdad;
    }
    
    @Override
    public String toString(){
      return "Nombre : " + nombre + ",Dni " + dni + ",edad " + edad;
    }
    
}
