
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double
        int DF = 15;
        //Paso 3: Crear el vector para 15 double 
        double [] tablaAlt = new double[DF];

        //Paso 4: Declarar indice y variables auxiliares a usar
         double altProm ;
         double cantJugadores=0;
         int cantMax = 0 ;
         int i;
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (i=0;i<DF;i++){
            System.out.println("ingrese una altura");
            tablaAlt[i] = Lector.leerDouble();
            cantJugadores += tablaAlt[i];
        }   
        System.out.println("cantidad de alturas de todos los jugadores " + cantJugadores);
        //Paso 7: Calcular el promedio de alturas, informarlo
        altProm = cantJugadores/DF; 
        System.out.println("altura promedio de los jugadores " + altProm);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        for(i=0;i<DF;i++){
         if(tablaAlt[i] < altProm)
             cantMax++;
        }
             
     
        //Paso 9: Informar la cantidad.
        System.out.println("la cantidad de jugadores que superan la altura promedio es " + cantMax);
    }
    
}
