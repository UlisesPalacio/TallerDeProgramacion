
package parcialturnok2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ParcialF2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProgramadorLider pl = new ProgramadorLider(2,3,"a",123,20.0,223,"python");
        
        Empresa e = new Empresa("charly car",pl,6);
        
        
        Programador p1 = new Programador("bb",14543,11.0,222,"java");
        Programador p2 = new Programador("cc",1443,12.0,194,"java");
        Programador p3 = new Programador("dd",1544,14.0,204,"java");
        Programador p4 = new Programador("ee",443,16.0,201,"java");

        e.agregarProgramador(p1);
        e.agregarProgramador(p2);
        e.agregarProgramador(p3);
        e.agregarProgramador(p4);
        
        System.out.println(e.toString());

        System.out.println("el monto total antes del aumento es " + e.montoTotal());
         
        e.aumentarSueldos(10);
        
        System.out.println(e.toString());
        
        System.out.println("el monto total despues del aumento es " + e.montoTotal());
    }

}
