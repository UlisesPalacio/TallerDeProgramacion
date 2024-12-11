
package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class eje04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int [][] matrizOficina = new int[8][4];
            int numPiso,numOficina ;
            System.out.println("ingrese el numero de piso de 0 a 7");
            numPiso = Lector.leerInt();
            
            while(numPiso != 9 ){
                System.out.println("ingrese el numero de oficina 0 3");
                numOficina = Lector.leerInt();
                matrizOficina[numPiso][numOficina] += 1;  
                System.out.println("ingrese el numero de piso de 0 a 7");
                numPiso = Lector.leerInt();
            }
            
           
            for(int i=0;i<8;i++){
                System.out.println("--------");
                for(int j=0;j<4;j++)
                    System.out.print("(piso"+i+1+" , oficina"+j+1+")" + matrizOficina[i][j] + " | ");
            }
            System.out.println("suma de valores");
            
            int posPiso=0;
            
            //if(posPiso < 8){
                      //int cant=0;
                      //for(int j=0;j<5;j++){
                         // System.out.println("--------");
                          //cant = matrizOficina[posPiso][j];
                      //}
                      //System.out.println("la cantidad de clientes del piso" + posPiso + "es " + cant);
                      //posPiso +=1;

                  //}
            
    }

}
