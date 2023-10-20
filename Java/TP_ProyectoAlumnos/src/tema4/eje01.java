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
public class eje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangulo triangulo = new Triangulo(5,3,4,"rojo","verde");
        Circulo circulo = new Circulo(10,"naranja","gris");
        
        System.out.println(triangulo.toString());
        
        System.out.println(circulo.toString());
        
       
        triangulo.despintar();
        
        circulo.despintar();
        
        System.out.println(triangulo.toString());
        
        System.out.println(circulo.toString());
        
        
       
    }
    
}
