
package Parciales;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial1Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materia mat;
        
        AlumnoDeGrado alu1 = new AlumnoDeGrado("informatic",221,"pedro",10);
        AlumnoDoctorado alu2 = new AlumnoDoctorado("ingenieria","unlp",331,"pablo",8);
        GeneradorAleatorio.iniciar();
        for(int i=0;i<alu1.getCantMax();i++){
          mat = new Materia(GeneradorAleatorio.generarString(7),GeneradorAleatorio.generarDouble(10),GeneradorAleatorio.generarInt(2000));
          if(i==4){
            mat.setNombreMateria("tesis");
          }
          alu1.agregarMateria(mat);
        }
        
        
        for(int i=0;i<alu2.getCantMax();i++){
          mat = new Materia(GeneradorAleatorio.generarString(7),GeneradorAleatorio.generarDouble(10),GeneradorAleatorio.generarInt(2000));
          alu1.agregarMateria(mat);
        }
        
        System.out.println(alu1.toString());
        System.out.println(alu2.toString());
    }

}
