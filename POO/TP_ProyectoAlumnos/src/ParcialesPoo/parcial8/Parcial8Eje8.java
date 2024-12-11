
package parcial8;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial8Eje8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CursoPresencial cp;
        CursoADistancia cd;
        
        cp = new CursoPresencial(4,2,8);
        
        cd = new CursoADistancia("fafafasqgfs",1,10);
        
        
        Alumno alu1 = new Alumno(354445,"ulises");
        Alumno alu2 = new Alumno(1213,"aaa");
        Alumno alu3 = new Alumno(154763,"bbb");
        Alumno alu4 = new Alumno(765443,"ccc");
        Alumno alu5 = new Alumno(756645433,"dddd");
        
        
        System.out.println(alu1.toString());
        System.out.println(alu2.toString());
        System.out.println(alu3.toString());
        System.out.println(alu4.toString());
        System.out.println(alu5.toString());
        
        cp.agregarAlumno(alu1);
        cp.agregarAlumno(alu2);
        cp.agregarAlumno(alu3);
        
        cd.agregarAlumno(alu4);
        cd.agregarAlumno(alu5);
                                                                           
        cd.aumentarAutoevaluaciones(765443);

        cp.aumentarAutoevaluaciones(1213);
        cp.aumentarAsistencia(1213);
        cp.aumentarAsistencia(1213);
        cp.aumentarAsistencia(1213);
        cp.aumentarAsistencia(1213);


        System.out.println("-----------------------");
        System.out.println(alu1.toString());
        System.out.println(alu2.toString());
        System.out.println(alu3.toString());
        System.out.println(alu4.toString());
        System.out.println(alu5.toString());
        
   
   System.out.println("La cantidad de alumnos que pueden rendir a distancia es de: " + cd.cantQuePuedenRendir() + " alumnos");
         
   System.out.println("La cantidad de alumnos que pueden rendir presencial es de: " + cp.cantQuePuedenRendir() + " alumnos");}
    
        
   
}


