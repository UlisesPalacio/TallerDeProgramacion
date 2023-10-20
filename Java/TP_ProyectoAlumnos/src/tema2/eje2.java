/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author Usuario
 */
public class eje2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**
         2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
         15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta 
         obtener edad 0. Luego de almacenar la información:
         - Informe la cantidad de personas mayores de 65 años.
         - Muestre la representación de la persona con menor DNI.
        */
         int dimf =15;
         int diml =0;
         int i;
         
         Persona[] personas = new Persona[dimf]; //se crea un arreglo de objetos de la clase Persona
         String nombre;   //la dimf es de 15 osea puede contener hasta 15 objetos de la clase Persona
         int dni;
         int edad = -1;
         
         GeneradorAleatorio.iniciar();
         while((diml<dimf)&&(edad!= 0)){// En un bucle while, se generan datos aleatorios para nombre, dni y edad.
            nombre = GeneradorAleatorio.generarString(8);
            dni = GeneradorAleatorio.generarInt(100);
            edad = GeneradorAleatorio.generarInt(80);
            if(edad!= 0 ){//Si la edad es diferente de 0,
             personas[diml]= new Persona(nombre,edad,dni);//  se crea un objeto Persona con los datos generados
                                                          //  y se agrega al arreglo "personas".
             diml++;// Luego, se incrementa el contador "diml".
            }
            
            // En un bucle while, se generan datos aleatorios para nombre, dni y edad.
         }
         
          for(i=0;i<diml;i++){
            System.out.println("Persona numero: "+(i+1));
            System.out.println(personas[i].toString());
        }
         
         int mayores = 0;
         
         for(i=0;i<diml;i++){
           if(personas[i].getEdad() > 65 ){
              mayores++;
           }
            
         }
         
         System.out.println("la cantidad de personas mayores a 65 es " + mayores);
         
         int min =9999;
         
         int pos=0;
         
         for(i=0;i<diml;i++){
           if(personas[i].getDNI()<min){
             min = personas[i].getDNI();
             pos =i;
           } 
         
         }
        System.out.println("La persona con menor DNI es: ------ ");
        System.out.println(personas[pos].toString());
         
         
        
        
    }
    
}
