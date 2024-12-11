
package parcial4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial4eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Concurso conc = new Concurso(5);
        
        Participantes parti1 = new Participantes(1234,"Julio",64);
        Participantes parti2 = new Participantes(4321,"Silvia",50);

        
        Pareja par1 = new Pareja(parti1,parti2,"Tango");
        
        
        
        Participantes parti3 = new Participantes(5432,"aaa",25);
        Participantes parti4 = new Participantes(67854,"bbbb",33);
        
        Pareja par2 = new Pareja(parti3,parti4,"flamengo");
        
        conc.agregarPareja(par1);
        conc.agregarPareja(par2);
        
        System.out.println("los nombres de los participantes con mas diferencia de edad son "+ conc);
        
    }

}
