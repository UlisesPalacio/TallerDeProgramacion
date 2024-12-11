
package tema2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class eje02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona [] vector = new Persona [15];
        GeneradorAleatorio.iniciar();
         String nom;
         int dni,edad;
         int diml=0;
          edad = GeneradorAleatorio.generarInt(100);
          while(edad != 0 && diml<15){
            nom = GeneradorAleatorio.generarString(6);
            System.out.println("nombre: " + nom);
            dni = GeneradorAleatorio.generarInt(8);
            System.out.println("dni: " + dni);
            vector[diml] = new Persona(nom,dni,edad);              
            diml +=1;
            edad = GeneradorAleatorio.generarInt(100);
            System.out.println("edad : " + edad);

          }
         int cant= 0;
        int dniMin=999;
        Persona dimlMin= null;
        for(int i=0;i<diml;i++){
          if(vector[i].getEdad()>65){
            cant +=1;
          }
          if(vector[i].getDNI()<dniMin){
           dniMin = vector[i].getDNI();
           dimlMin=vector[i];
          }
          
        }
        
        
        System.out.println("la cantidad de personas mayores a 65 años es " + cant);
        System.out.println(dimlMin.toString());
    }

}
