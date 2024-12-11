/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;


public class DemoFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cuad = new Cuadrado(10,"Rojo", "Negro");
        System.out.println("Color linea: " + cuad.getColorLinea()); 
        System.out.println("Area: " + cuad.calcularArea()); 
        System.out.println("Representacion del cuadrado: " + cuad.toString()); 
        System.out.println("nuevos colores de radio y linea");
        cuad.despintar("azul", "blanco");
        System.out.println("Nueva representacion del cuadrado"+ cuad.toString());
        
        System.out.println("------------------------");
        Triangulo tria = new Triangulo(2,2,2,"verde","blanco");
        
        System.out.println("Representacion del triangulo"+ tria.toString());
        tria.despintar("amarillo", "naranja");
        System.out.println("Nueva representacion del triangulo"+ tria.toString());
        
        System.out.println("------------------------");

        
        Circulo circ = new Circulo(10,"violeta","celeste");
        
        System.out.println("Representacion del Circulo" + circ.toString());
        circ.despintar("negro", "blanco");
        System.out.println("Nueva representacion del Circulo"+ circ.toString());
        
    }
    
    
    
}
