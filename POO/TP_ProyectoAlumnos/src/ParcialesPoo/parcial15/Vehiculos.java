
package parcial15;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Vehiculos {
    private int patente;
    private double cantHorasEstacionamiento;
    private String marca;
    private String modelo;

    public Vehiculos(int patente, double cantHorasEstacionamiento, String marca, String modelo) {
        this.patente = patente;
        this.cantHorasEstacionamiento = cantHorasEstacionamiento;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public double getCantHorasEstacionamiento() {
        return cantHorasEstacionamiento;
    }

    public void setCantHorasEstacionamiento(double cantHorasEstacionamiento) {
        this.cantHorasEstacionamiento = cantHorasEstacionamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return " Vehiculos " + " patente " + this.getPatente() + " cantHorasEstacionamiento " + this.getCantHorasEstacionamiento() + " marca " + this.getMarca() + " modelo " + this.getModelo() ;
    }
    
    

}
