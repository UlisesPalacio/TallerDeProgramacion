
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;


public class Ej02Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        int DF=5;
        Double [] vector = new Double[DF];
        //Paso 3: Crear el vector para 15 double 
        
        //Paso 4: Declarar indice y variables auxiliares a usar
         int i;
         Double altura;
        
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for(i=0;i<DF;i++){
            
           System.out.println("ingrese la altura");
           altura = Lector.leerDouble();
            vector[i]=altura;
        }
        //Paso 7: Calcular el promedio de alturas, informarlo
        Double total = 0.0;
        for(i=0;i<DF;i++)
           total = total + vector[i];
        double prom = (total/DF);
        System.out.println(" el promedio de altura es " + prom);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        int cant = 0;
        for(i=0;i<DF;i++)
            if(vector[i]>prom)
                cant=cant + 1;
        //Paso 9: Informar la cantidad.
        System.out.println("la cantidad de alturas por encima del promedio es "+ cant);
    }
    
}
