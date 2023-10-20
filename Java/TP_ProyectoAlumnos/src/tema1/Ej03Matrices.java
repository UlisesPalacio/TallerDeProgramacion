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
        int [][] tabla = new int[5][5];
        int i,j;
        for (i=0;i<3;i++)
           for(j=0;j<4;j++)
              tabla[i][j] = GeneradorAleatorio.generarInt(30);
            
        //Paso 4. mostrar el contenido de la matriz en consola
         for (i = 0; i < 5; i++) {
             for (j = 0; j < 5; j++) {
                System.out.print(tabla[i][j] + " ");
         }
          System.out.println();
    }
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        int cant=0;
        for (i = 0; i < 1; i++)
            for (j = 0; j < 5; j++)
                cant=cant + tabla[i][j];
        System.out.println(cant + " es la cantidad de la fila sumada");
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
           int [] vector=new int[5];
           int k;
           int total;
          //quiere que en cada posicion del vector este la suma de los valores de cada columna
        for(j=0;j<5;j++){
            total = 0;
            for(i=0;i<5;i++){
                total = total + tabla[i][j];
            }
            vector[j]= total;
        }
        System.out.println("------------------------------------");
        System.out.println("Suma de los elementos de las columnas:");
        for(k=0;k<5;k++)
           System.out.println(k + " : " + vector[k]);

        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        int num=0;
        System.out.println("ingrese un numero");
        num = Lector.leerInt();
        for(i=0;i<5;i++){
            for(j=0;j<5;j++)
               if(num==tabla[i][j])
                   System.out.println("se encontro el numero " + tabla[i][j]);
        };    
        System.out.println("no se encontro el numero ingresado");
                   
    }
}
