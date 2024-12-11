
package parcial7;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ParcialEje7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Torneo tor1;
        Goleador g1;
        GeneradorAleatorio.iniciar();
        tor1 = new Torneo("Torneo",10,11);
        
        int aux=0;
        while(aux !=5){
          aux= GeneradorAleatorio.generarInt(10);
          g1 = new Goleador(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarString(7),GeneradorAleatorio.generarInt(8));
          tor1.agregarGoleador(aux, g1);
        }
        System.out.println("el goleador que hizo menos goles es " + tor1.menosGol(aux) );
        System.out.println("la cantidadd de goleadores es " + tor1.canGoleadores() );
        System.out.println(tor1.toString());
        
        
    }

}
