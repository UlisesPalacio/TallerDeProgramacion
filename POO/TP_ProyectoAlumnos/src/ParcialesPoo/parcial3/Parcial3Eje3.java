
package parcial3;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial3Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CompraMayorista comMa = new CompraMayorista(123,10,4);
        CompraMinorista comMI = new CompraMinorista(true,10,3);
        
        GeneradorAleatorio.iniciar();
        Producto prod = new Producto(1,GeneradorAleatorio.generarDouble(100),GeneradorAleatorio.generarString(8));
        Producto prod2 = new Producto(2,GeneradorAleatorio.generarDouble(100),GeneradorAleatorio.generarString(8));
         
        Producto prod3 = new Producto(3,GeneradorAleatorio.generarDouble(100),GeneradorAleatorio.generarString(8));
        
         
 
        
        comMa.agregarProducto(prod);
        comMa.agregarProducto(prod2);
        comMa.agregarProducto(prod3);
 
        
        
        System.out.println(comMa.toString());
        
        Producto prod4 = new Producto(4,GeneradorAleatorio.generarDouble(100),GeneradorAleatorio.generarString(8));
        Producto prod5 = new Producto(5,GeneradorAleatorio.generarDouble(100),GeneradorAleatorio.generarString(8));
        Producto prod6 = new Producto(6,GeneradorAleatorio.generarDouble(100),GeneradorAleatorio.generarString(8));
        
        comMI.agregarProducto(prod4);
        comMI.agregarProducto(prod5);
        comMI.agregarProducto(prod6);
        
        System.out.println(comMI.toString());

        
     }

}
