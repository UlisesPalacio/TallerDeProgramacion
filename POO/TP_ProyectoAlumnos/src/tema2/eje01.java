
package tema2;

import PaqueteLectura.Lector;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class eje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom;
        int dni,edad;
        
        System.out.println("ingrese el nombre");
        nom = Lector.leerString();
        System.out.println("ingrese el dni");
        dni = Lector.leerInt();
        System.out.println("ingrese el edad");
        edad = Lector.leerInt();
        Persona per= new Persona(nom,dni,edad);
        System.out.println(per.toString());
        
        
    }

}
