
package Parciales.parcialempresa2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Programadores {
    
    private String nombre;
    private String dni;
    private double sueldoBasico;
    private int cantLineasCodigo;
    private String lenguaje;

    public Programadores(String nombre, String dni, double sueldoBasico, int cantLineasCodigo, String lenguaje) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.cantLineasCodigo = cantLineasCodigo;
        this.lenguaje = lenguaje;
    }

    
    public double sueldoFinal(){
        double sueldoFinal=this.getSueldoBasico();
        if(this.cantLineasCodigo > 200){
            sueldoFinal +=50000;// Si programa más de 200 líneas por hora, suma $50,000 al sueldo
        }
        return sueldoFinal;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getCantLineasCodigo() {
        return cantLineasCodigo;
    }

    public void setCantLineasCodigo(int cantLineasCodigo) {
        this.cantLineasCodigo = cantLineasCodigo;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return " nombre " + nombre + " dni " + this.getDni() + " sueldoFinal " + this.sueldoFinal()  + " lenguaje de preferencia " + this.getLenguaje();
    }
    
    
    
    
    
    
}
