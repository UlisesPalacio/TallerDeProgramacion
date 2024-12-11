
package tema3;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Autor {

    private String nombre;
    private String biografía;
    private String origen;

    public Autor(String nombre, String biografía, String origen) {
        this.nombre = nombre;
        this.biografía = biografía;
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBiografía() {
        return biografía;
    }

    public void setBiografía(String biografía) {
        this.biografía = biografía;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        
     String aux="Autor: " + "nombre: " + nombre + ", biografia:" + biografía + ", origen : " + origen;
     return aux;
    }
    
    
}
