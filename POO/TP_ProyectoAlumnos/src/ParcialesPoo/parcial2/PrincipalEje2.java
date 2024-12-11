
package parcial2;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class PrincipalEje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Concurso conc= new Concurso(20);
        
        Alumnos alu1= new Alumnos("aaaaaa",10,"bateria");
        Alumnos alu2= new Alumnos("bbbbbb",11,"guitarra");
        Alumnos alu3= new Alumnos("cccccc",12,"bajo");
        Alumnos alu4= new Alumnos("dddddd",13,"violin");
        Alumnos alu5= new Alumnos("eeeeee",14,"piano");
                
        conc.agregarAlumno(alu1, 0);
        conc.agregarAlumno(alu2, 1);
        conc.agregarAlumno(alu3, 2);
        conc.agregarAlumno(alu5, 3);
        conc.agregarAlumno(alu5, 4);

        conc.agregarPuntaje(100, "a");
        conc.agregarPuntaje(90, "b");
        conc.agregarPuntaje(80, "c");
        conc.agregarPuntaje(70, "d");
        conc.agregarPuntaje(60, "e");
        System.out.println("Concurso:");
        System.out.println(conc.toString());
        
    }

}
