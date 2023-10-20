/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author Usuario
 */
public class eje05 {

    /**
     * @param args the command line arguments
     */
    /**
     * 5- A- Definir una clase para representar círculos. Los círculos se
     * caracterizan por su radio (double), el color de relleno (String) y el
     * color de línea (String). Provea un constructor que reciba todos los datos
     * necesarios para iniciar el objeto. Provea métodos para: -
     * Devolver/modificar el valor de cada uno de sus atributos (métodos get y
     * set) - Calcular el perímetro y devolverlo (método calcularPerimetro) -
     * Calcular el área y devolverla (método calcularArea)
     *
     * B- Realizar un programa que instancie un círculo, le cargue información
     * leída de teclado e informe en consola el perímetro y el área.
     *
     * NOTA: la constante PI es Math.PI
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo= new Circulo();
        double radio;
        String colorRelleno,colorLinea;
        
        System.out.println("ingrese el radio del circulo");
        radio = Lector.leerDouble();
        circulo.setRadio(radio);
        System.out.println("ingrese el color de relleno");
        colorRelleno = Lector.leerString();
        circulo.setColorRelleno(colorRelleno);
        System.out.println("ingrese el color de lenea");
        colorLinea = Lector.leerString();
        circulo.setColorLinea(colorLinea);
        
        //System.out.println(circulo.calcularPerimetro(radio));
        
        //System.out.println(circulo.calcularArea(radio));
        System.out.println(circulo);
          
    }
    
}
