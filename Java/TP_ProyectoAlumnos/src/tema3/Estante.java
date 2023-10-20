/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * /@author Usuario
 */
public class Estante {
    private int diml = 0;
    private final Libro[] vector = new Libro[20];
    
    public Estante(){
        
    }
    
    public int cantidadLibros(){
        return diml;
    }
    
    public void agregarLibro(Libro libro){
        if(diml > 19){
            vector[diml]=libro;
            this.diml++;
        }
    }
    
    public boolean estaLleno(){
        return (diml ==19);
    }
    
    public Libro getLibro(String titulo){
        int aux = 0;
        
         boolean esta = false;
        while ((esta == false)&&(aux < diml)){
            if (this.vector[aux].getTitulo().equals(titulo)){
                esta = true;
            }
            else{
                aux++;
            }
        }
        if (!esta){
            return null;
        }
        else{
            return this.vector[aux];
            
        }
    }
        
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
