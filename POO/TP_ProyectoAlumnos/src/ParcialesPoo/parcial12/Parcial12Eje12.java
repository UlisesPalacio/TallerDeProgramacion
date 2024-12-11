
package parcial12;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial12Eje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Concurso c = new Concurso(3,5);
        
        Canciones canc1 = new Canciones("a","aaaaa",1);
        Canciones canc2 = new Canciones("b","bbbbb",2);
        Canciones canc3 = new Canciones("c","cccccc",3);
        Canciones canc4 = new Canciones("d","dddddd",4);
        Canciones canc5 = new Canciones("e","eeeeee",5);

        c.agregarCancion(canc1, 0);
        c.agregarCancion(canc1, 1);
        c.agregarCancion(canc1, 2);
        c.agregarCancion(canc1, 3);
        c.agregarCancion(canc1, 4);

         int puntaje;
        int id = GeneradorAleatorio.generarInt(6)+1;
        int cant = 0;
        while(id != 0 && cant != 20){
            //System.out.println("Ingrese Nombre, Apellido y DNI respectivamente:");
            Estudiante estudiante = new Estudiante(
                GeneradorAleatorio.generarString(7),//Lector.leerString(),
                GeneradorAleatorio.generarString(7),//Lector.leerString(),
                GeneradorAleatorio.generarInt(8)//Lector.leerInt()
            );
            puntaje = GeneradorAleatorio.generarInt(10);
            c.interpretarCancion(id, estudiante, puntaje);
            id = GeneradorAleatorio.generarInt(6)+1;
            cant++;
        }
        
        System.out.println(c.toString());
        
        System.out.println("Ingrese id de canciones agregadas: 1, 2, 3, 4 o 5");
        id = Lector.leerInt();
        Estudiante ganador = c.estudianteGanador(id);
        if(ganador != null)
            System.out.println(ganador.toString());
        else
            System.out.println("Nadie");
        
        System.out.println("---------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println(c.cancionMax(i));
        }
        
        
    }

}
