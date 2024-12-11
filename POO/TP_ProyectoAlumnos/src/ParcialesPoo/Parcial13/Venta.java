
package Parcial13;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Venta {
    private int dni;
    private double cantM3Cli;
    private double montoCli;
    private String medioPago;
    private int cantVentas=0;

    public Venta(int dni, double cantM3Cli, double montoCli, String medioPago) {
        this.dni = dni;
        this.cantM3Cli = cantM3Cli;
        this.montoCli = montoCli;
        this.medioPago = medioPago;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getCantM3Cli() {
        return cantM3Cli;
    }

    public void setCantM3Cli(double cantM3Cli) {
        this.cantM3Cli = cantM3Cli;
    }

    public double getMontoCli() {
        return montoCli;
    }

    public void setMontoCli(double montoCli) {
        this.montoCli = montoCli;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    @Override
    public String toString() {
        return "Venta{" + "dni=" + dni + ", cantM3Cli=" + cantM3Cli + ", montoCli=" + montoCli + ", medioPago=" + medioPago + ", cantVentas=" + cantVentas + '}';
    }
    
     

}
