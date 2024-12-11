
package Parcial13;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial13Eje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Estacion est = new Estacion("La Plata", 500.0, 5);
        est.agregarVenta(1, 1, 2, "Credito");
        est.agregarVenta(1, 2, 4, "Debito");
        est.agregarVenta(2, 3, 6, "Credito");
        est.agregarVenta(3, 4, 8, "Credito");
        est.agregarVenta(3, 5, 10, "Efectivo");
        est.agregarVenta(4, 6, 12, "Debito");
        est.agregarVenta(4, 7, 14, "Credito");
        est.agregarVenta(4, 8, 16, "Efectivo");
        
        System.out.println(est.toString());
        
        System.out.println("-----------");
        System.out.println(est.ventaMax().toString());
        System.out.println("-----------");
        
        est.sinServicio(7);
        System.out.println(est.toString());
    }

}
