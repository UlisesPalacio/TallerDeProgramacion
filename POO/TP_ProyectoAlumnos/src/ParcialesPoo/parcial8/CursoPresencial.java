
package parcial8;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class CursoPresencial extends Curso {

    private int numeroAula;

    public CursoPresencial(int numeroAula, int anioCursada ,int maxAlu) {
        super(anioCursada,maxAlu);
        this.numeroAula = numeroAula;
    }

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    @Override
    public String toString() {
        return "CursoPresencial{" + "numeroAula=" + numeroAula + '}';
    }
    
    
     public boolean puedeRendir(Alumno a){
        return a.getAsistencias() >= 3; 
    }
}
