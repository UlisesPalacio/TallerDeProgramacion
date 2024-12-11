
package tema1;
import PaqueteLectura.Lector;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class eje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz= new int[5][4];
        
        int valor;
        for(int i=0;i<5;i++){
           for(int j=0;j<4;j++){
               System.out.println("ingrese un valor entero");
               valor = Lector.leerInt();
               matriz[i][j] = valor;
           }
        }
        
        for(int i=0;i<5;i++){
          System.out.println("-------");
          for(int j=0;j<4;j++){
             System.out.print("(C"+(i+1)+" , As"+(j+1)+")" + matriz[i][j] + " | ");
          }
          
         System.out.println("--------"); 
         
          
        }
        
         
         for(int i=0;i<5;i++){
           double promAspecto=0;
           for(int j=0;j<4;j++)
              promAspecto +=matriz[i][j]; 
           System.out.println("el promedio del aspecto del cliente " +  (i+1) + " es " +  promAspecto/4 );
         
         } 
        
    }

}
