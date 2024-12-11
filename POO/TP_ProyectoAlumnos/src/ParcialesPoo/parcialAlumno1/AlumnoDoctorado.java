
package Parciales;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class AlumnoDoctorado extends Alumnos {
    
    private String tituloUni,uniOrigen;

    public AlumnoDoctorado(String tituloUni, String uniOrigen, int dni, String nombre, int cantMax) {
        super(dni, nombre, cantMax);
        this.setTituloUni(tituloUni);
        this.setUniOrigen(uniOrigen);
    }

    public String getTituloUni() {
        return tituloUni;
    }

    public void setTituloUni(String tituloUni) {
        this.tituloUni = tituloUni;
    }

    public String getUniOrigen() {
        return uniOrigen;
    }

    public void setUniOrigen(String uniOrigen) {
        this.uniOrigen = uniOrigen;
    }

    @Override
    public String toString() {
        return  super.toString() + "tituloUni:" + this.getTituloUni() + " uniOrigen:" + this.getUniOrigen();
    }

    
    
    
}
