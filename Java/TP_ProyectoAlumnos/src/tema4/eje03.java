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
public class eje03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("ulises ",41195558,25);
        Trabajador trabajador = new Trabajador("ulises",41195558,25,"Desarrollador");
        
        System.out.println(persona.toString());
        System.out.println(trabajador.toString());
        trabajador.setServicio("Programador");
        System.out.println(trabajador.toString());
        
    }
    
}
