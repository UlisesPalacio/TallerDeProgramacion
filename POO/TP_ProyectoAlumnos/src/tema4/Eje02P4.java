
package tema4;
import PaqueteLectura.Lector;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Eje02P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantCamp,antiguedad,cantGoles,numPartidos;
        String nombre;
        double sueldo;
        
        
        
        System.out.println("ingrese la cantidad de campeonatos ganados");
        cantCamp = Lector.leerInt();
        System.out.println("ingrese el nombre del entrenador");
        nombre = Lector.leerString();
        System.out.println("ingrese el sueldo a cobrar");
        sueldo = Lector.leerDouble();
        System.out.println("ingrese la antiguedad");
        antiguedad = Lector.leerInt();
        
        Entrenadores entrenador = new Entrenadores(cantCamp,nombre,sueldo,antiguedad);
        
        System.out.println("Representacion del entrenador " + entrenador.toString());
        
        System.out.println("----------------------");
        
        System.out.println("ingrese la cantidad de goles anotados");
        cantGoles = Lector.leerInt();
        System.out.println("ingrese la cantidad de partidos jugados");
        numPartidos = Lector.leerInt();
        System.out.println("ingrese el nombre del jugador");
        nombre = Lector.leerString();
        System.out.println("ingrese el sueldo a cobrar");
        sueldo = Lector.leerDouble();
        System.out.println("ingrese la antiguedad");
        antiguedad = Lector.leerInt();
        
        Jugadores jugador = new Jugadores(nombre,sueldo,antiguedad,numPartidos,cantGoles);
        
        System.out.println("representacion del jugador " + jugador.toString());
        
        
        
        
        
        
    }

}
