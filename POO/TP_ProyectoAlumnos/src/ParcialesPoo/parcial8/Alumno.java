
package parcial8;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Alumno {

    private int dni;
    private String nombre;
    private int asistencias;
    private int cantAprobadas;

    public Alumno(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.asistencias=0;
        this.cantAprobadas=0;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getCantAprobadas() {
        return cantAprobadas;
    }

    public void setCantAprobadas(int cantAprobadas) {
        this.cantAprobadas = cantAprobadas;
    }
 
    public void incAutoevaluaciones(){
       this.cantAprobadas++;
    }
    
    public void incAsistencias(){
      this.asistencias++;
    }
    
    @Override
    public String toString() {
        return " Alumno " + " dni " + dni + ", nombre=" + nombre + ", asistencias=" + asistencias + " cantAprobadas " + cantAprobadas;
    }
    
    
    
    
}
