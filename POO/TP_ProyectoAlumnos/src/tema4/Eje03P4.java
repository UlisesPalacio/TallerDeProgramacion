
package tema4;

import PaqueteLectura.Lector;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Eje03P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre,rol;
        int dni,edad;
        
        
        System.out.println("ingrese el nombre de la persona");
        nombre = Lector.leerString();
        System.out.println("ingrese el dni de la persona");
        dni = Lector.leerInt();
        System.out.println("ingrese la edad");
        edad = Lector.leerInt();
        Persona pers = new Persona(nombre,dni,edad);
        System.out.println("Persona:" + pers.toString());
        
        System.out.println("------------");
        
        
        System.out.println("ingrese el rol del trabajador");
        rol = Lector.leerString();
        System.out.println("ingrese el nombre del trabajador");
        nombre = Lector.leerString();
        System.out.println("ingrese el dni del trabajador");
        dni = Lector.leerInt();
        System.out.println("ingrese la edad del trabajador");
        edad = Lector.leerInt();
        
        Trabajador trabaj = new Trabajador(rol,nombre,dni,edad);
        
        System.out.println("Trabajador: " + trabaj.toString());
        
        
        
    }

}
