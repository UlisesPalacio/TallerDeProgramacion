
package Parciales;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Materia {
    
    private String nombreMateria;
    private double nota;
    private int fecha;

    public Materia(String nombreMateria, double nota, int fecha) {
        this.setNombreMateria(nombreMateria);
        this.setNota(nota);
        this.setFecha(fecha);
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "nombre: "+ nombreMateria + ", nota: " + Math.round(nota) + "fecha: " + fecha + "/n";
    }
    
    
    
    
    
    
    

}
