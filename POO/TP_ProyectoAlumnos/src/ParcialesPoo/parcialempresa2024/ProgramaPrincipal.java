
package Parciales.parcialempresa2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProgramadorLider plider= new ProgramadorLider(3,2,"ulises","1234",100.0,231,"java");
        
        Empresa empre= new Empresa("Globant",plider,5);
        
        Programadores pro1 = new Programadores("a","12334",50.0,195,"python");
        
        Programadores pro2 = new Programadores("b","334",240.0,395,"javascript");

        empre.agregarProgramador(pro1);
        empre.agregarProgramador(pro2);

        empre.aumentarSueldo(100);
        
        System.out.println(empre);
        
    }

}
