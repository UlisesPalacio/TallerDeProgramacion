
package parcial5;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial5Eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeneradorAleatorio.iniciar();
        Sistema sistema = new Sistema();
        
        Paciente pacien= new Paciente(GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarBoolean(),GeneradorAleatorio.generarDouble(20));
        System.out.println("paciente 1 "+pacien);
        
        Paciente pacien2= new Paciente(GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarBoolean(),GeneradorAleatorio.generarDouble(20));
                System.out.println("paciente 2 "+pacien2);

        Paciente pacien3= new Paciente(GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarBoolean(),GeneradorAleatorio.generarDouble(20));
                System.out.println("paciente 3 "+pacien3);

        Paciente pacien4= new Paciente(GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarBoolean(),GeneradorAleatorio.generarDouble(20));
                System.out.println("paciente 4 "+pacien4);

        Paciente pacien5= new Paciente(GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarBoolean(),GeneradorAleatorio.generarDouble(20));
        
        System.out.println("paciente 5 "+ pacien5);

        
        sistema.agendarPaciente(1, 1, pacien);
        sistema.agendarPaciente(2, 2, pacien2);
        sistema.agendarPaciente(3, 3, pacien3);
        sistema.agendarPaciente(4, 4, pacien4);
        sistema.agendarPaciente(5, 5, pacien5);
                System.out.println("el costo total antes de liberar espacio " + sistema.costoTotal());

        sistema.liberarTurnos(2);
        
        System.out.println("el costo total es " +sistema.costoTotal());
    }

}
