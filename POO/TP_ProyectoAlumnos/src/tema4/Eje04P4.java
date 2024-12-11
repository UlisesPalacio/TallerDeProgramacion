
package tema4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Eje04P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estacion estacion1 = new Estacion("La Plata",-34.921,-57.955);
        Estacion estacion2 = new Estacion("Mar del Plata",-38.002,57.556);
        
        RepAnual reporteAnual = new RepAnual(estacion1,2021,3);
        RepMensual reporteMensual = new RepMensual(estacion2,2020,4);
        
        
        
        System.out.println(reporteAnual);
        System.out.println(reporteAnual.mayorTemp());

        
        System.out.println(reporteMensual);
        System.out.println(reporteMensual.mayorTemp());
        
        
        
    }

}
