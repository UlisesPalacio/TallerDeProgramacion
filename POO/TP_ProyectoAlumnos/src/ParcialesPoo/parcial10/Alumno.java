
package parcial10;
import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Alumno {
    private String nombre;
    private int dni;
    private int numeroTema;

    public Alumno(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.numeroTema=-1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumeroTema() {
        return numeroTema;
    }

    public void setNumeroTema(int numeroTema) {
        this.numeroTema = numeroTema;
    }
    
    public void asignarTema(int M){
      this.numeroTema = GeneradorAleatorio.generarInt(M) + 1;
    }

    @Override
    public String toString() {
        String aux = " Alumno " + "nombre=" + this.getNombre() + ", dni " + this.getDni() + "/n";
        return aux;
    }
    
    
    

}
