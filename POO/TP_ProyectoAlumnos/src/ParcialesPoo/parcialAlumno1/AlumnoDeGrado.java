
package Parciales;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class AlumnoDeGrado extends Alumnos{
    
    private String carrera;

    public AlumnoDeGrado(String carrera, int dni, String nombre, int cantMax) {
        super(dni, nombre, cantMax);
        this.setCarrera(carrera);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        String aux;
        aux = super.toString() +"carrera:" + this.getCarrera();
        return aux;
    }
    
    

}
