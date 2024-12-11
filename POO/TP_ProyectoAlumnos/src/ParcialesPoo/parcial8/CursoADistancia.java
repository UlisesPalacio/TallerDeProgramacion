
package parcial8;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class CursoADistancia extends Curso {

    private String linkSala;

    public CursoADistancia(String linkSala, int anioCursada, int maxAlu) {
        super(anioCursada,maxAlu);
        this.linkSala = linkSala;
    }

    public String getLinkSala() {
        return linkSala;
    }

    public void setLinkSala(String linkSala) {
        this.linkSala = linkSala;
    }

    @Override
    public String toString() {
        return "CursoADistancia{" + "linkSala=" + linkSala + '}';
    }
    
    public boolean puedeRendir(Alumno a){
        return a.getCantAprobadas() >=3 && a.getAsistencias()>=1;
    }
    
}
