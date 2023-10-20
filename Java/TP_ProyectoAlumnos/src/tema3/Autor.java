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
public class Autor {
    private String nombre;
    private String biografia;
    private String origen;
    
    public Autor(String unNombre,String suBiografia,String suOrigen){
        this.nombre = unNombre;
        this.biografia = suBiografia;
        this.origen = suOrigen;
    }
    
    public Autor(){
        
    }
    
    public String getNombre(){
        return nombre;
        
    }
    
    public void setNombre(String unNombre){
        this.nombre = unNombre;
    }
    
    public String getBiografia(){
        return biografia;
    }
    
    public void setBiografia(String suBiografia){
        this.biografia = suBiografia;
    }
    
    public String getOrigen(){
        return origen;
    }
    
    public void setOrigen(String suOrigen){
        this.origen = suOrigen;
    }
    
    public String toStrings(){
      String aux;
      aux = "el nombre del autor es " + this.nombre + "su biografia es " + this.biografia + "su origen es" + this.origen;
      
      return aux;
      
    }
      
    
}
