
package parcial6;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial6Eje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeneradorAleatorio.iniciar();
        
        Sistema sistem = new Sistema();
        String aux=GeneradorAleatorio.generarString(5);
        
        Paciente pacient = new Paciente(aux,GeneradorAleatorio.generarBoolean(),GeneradorAleatorio.generarDouble(10));
   System.out.println(pacient);
    
 Paciente pacient2 = new Paciente(GeneradorAleatorio.generarString(8),GeneradorAleatorio.generarBoolean(),GeneradorAleatorio.generarDouble(10));
    System.out.println(pacient2);



  sistem.agregarPaciente(0, 1, pacient);
  sistem.agregarPaciente(0, 2, pacient);
  sistem.agregarPaciente(1, 0, pacient2);
  sistem.agregarPaciente(1, 1, pacient2);

  sistem.liberarPaciente(aux);
  
  System.out.println("nombre " + pacient2.toString());
   System.out.println("existe algun paciente con ese nombre eso es: " + sistem.tieneTurno(1,aux));
 }

}
    


