
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Eje05p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        String colorRelleno,colorLinea;
        
        System.out.println("ingrese el radio del circulo");
        radio=Lector.leerDouble();
        System.out.println("color de relleno");
        colorRelleno = Lector.leerString();
        System.out.println("color line");
        colorLinea = Lector.leerString();
        
        Circulo circulo= new Circulo(radio,colorRelleno,colorLinea);
        
        System.out.println("el perimetro del circulo es " + circulo.calcularPerímetro());        
        System.out.println("el area del ciruclo es " + circulo.calcularArea());

        
    }

}
