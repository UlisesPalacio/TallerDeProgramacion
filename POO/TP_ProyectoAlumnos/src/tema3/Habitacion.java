
package tema3;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Habitacion {

    double costo;
    boolean ocupada;
    Cliente cli;
 
    public Habitacion() {
        GeneradorAleatorio.iniciar();
        this.costo = 2000 + GeneradorAleatorio.generarInt(6000+1);
        this.ocupada = false;
        this.cli = null;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Cliente getCliente() {
        return cli;
    }

    public void setCliente(Cliente cli) {
        this.cli = cli;
        this.ocupada=(cli!=null);
    }

     @Override
    public String toString() {
        if(isOcupada())
            return " OCUPADA por : " + this.cli + " costo "+ this.costo;
        else
            return " DESOCUPADA ";
    }
    
    
    
    
}
