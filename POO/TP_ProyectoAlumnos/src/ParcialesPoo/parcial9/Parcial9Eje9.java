
package parcial9;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial9Eje9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcion f;
        
        f = new Funcion("romeo",2024,9,5,5);
        
        Butaca b = new  Butaca();
        
        f.ocuparButaca(1, 1);
        f.ocuparButaca(2, 1);
        f.ocuparButaca(2, 2);
        f.ocuparButaca(3, 3);
        
        f.desocuparButaca(1);
        
        System.out.println("butacasaaaaaa de fila b "+f.obtenerButacas(1));
        
        System.out.println(" " + f.toString());

        
    }

}
