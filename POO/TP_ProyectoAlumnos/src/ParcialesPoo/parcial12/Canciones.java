
package parcial12;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Canciones {

    private String nombre;
    private String compositor;
    private int identificador;
    private Estudiante ganador;
    private int puntaje;

    public Canciones(String nombre, String compositor, int identificador) {
        this.nombre = nombre;
        this.compositor = compositor;
        this.identificador = identificador;
        this.puntaje=0;
        this.ganador = new Estudiante("nada","nada",0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Estudiante getGanador() {
        return ganador;
    }

    public void setGanador(Estudiante ganador) {
        this.ganador = ganador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Canciones{" + "nombre=" + nombre + ", compositor=" + compositor + ", identificador=" + identificador + ", ganador=" + ganador + ", puntaje=" + puntaje + '}';
    }
    
    
    
}
