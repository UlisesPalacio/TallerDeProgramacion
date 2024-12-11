
package tema3;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Eje01p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo tria = new Triangulo(10,10,10,"azul","blanco");
        
        System.out.println("el perimetro del triangulo es " + tria.calcularPerimetro());
        System.out.println("el area del triangulo es " + tria.calcularArea());
        
    }

}
