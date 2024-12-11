/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ej03Matrices {

    public static void main(String[] args) {
	    //Paso 2. iniciar el generador aleatorio     
	 GeneradorAleatorio.iniciar();
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
        int [][] matriz = new int [5][5];
        int [] vector = new int[5];
        int i ;
        int suma = 0;
        //Paso 4. mostrar el contenido de la matriz en consola
        for(i=0;i<5;i++)
          for(int j=0;j<5;j++)
              matriz[i][j]= GeneradorAleatorio.generarInt(30);
          
        for(i=0;i<5;i++){
            System.out.println("-------");
          for(int j=0;j<5;j++)
              System.out.print( "(F"+i+" , C"+j+")" + matriz[i][j] + " | " );     
        }
        System.out.println("--------");

        //Paso 5. calcular e informar la suma de los elementos de la fila 1
          
        for(int j=0;j<5;j++){
            
           suma += matriz[1][j];
              
        }
        System.out.println("suma es " + suma);
       
        
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
        
        for( int j = 0;j<5;j++){
             int sumaI=0;
             for(i=0;i<5;i++){
                 sumaI += matriz[i][j];
             }
             vector[j] = sumaI;
        }
        for(int k=0;k<5;k++)
         System.out.println("vector" + vector[k]);
        
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        boolean encontrado=false;
        System.out.println("ingrese un valor");
        int valor = Lector.leerInt();
        
        for(i=0;i<5;i++){
         for(int j=0;j<5;j++)
            if(matriz[i][j]==valor){
                System.out.println("encontre el valor en la fila (" + i + " columna " + j + ")" );
                encontrado=true;
                break;
            }
         
         if(encontrado){
             break;
         }   
        }
        if(!encontrado)
            System.out.println("nos e encontró el elemento");
            
        

    }
}
