
package parcial10;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial10Eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fecha f = new Fecha(2,4);
        GeneradorAleatorio.iniciar();
        
Alumno alu = new Alumno(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(8000));
Alumno alu2 = new Alumno(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(8000));      Alumno alu3 = new Alumno(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(8000));
Alumno alu4 = new Alumno(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(8000));      

f.agregarAlumno(alu, 1);
f.agregarAlumno(alu, 1);

f.agregarAlumno(alu, 1);
f.agregarAlumno(alu, 1);

f.argregarTemas(10);

System.out.println("informacion de los alumnos " + f.toString(1));

 
 
 
    }

}
