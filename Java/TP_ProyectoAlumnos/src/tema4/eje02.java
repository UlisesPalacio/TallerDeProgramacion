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
public class eje02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador jugador = new Jugador(3,5,"ulises",100,5);
        Entrenador entrenador = new Entrenador(10,"pep",200,5);
        
        System.out.println(jugador.toString());
        System.out.println(entrenador.toString());
    }
    
}
