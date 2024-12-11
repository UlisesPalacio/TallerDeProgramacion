
package parcialF2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Ticket {
    private int num;
    private int dniCli;
    private int cantLibros;
    private double monto;
    private String medioPago;

    public Ticket(int num, int dniCli, int cantLibros, double monto, String medioPago) {
        this.num = num;
        this.dniCli = dniCli;
        this.cantLibros = cantLibros;
        this.monto = monto;
        this.medioPago = medioPago;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDniCli() {
        return dniCli;
    }

    public void setDniCli(int dniCli) {
        this.dniCli = dniCli;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public void setCantLibros(int cantLibros) {
        this.cantLibros = cantLibros;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    @Override
    public String toString() {
        return "num " + this.getNum() + ", dniCli=" + this.getDniCli() + " cantLibros " + this.getCantLibros() + " monto " + this.getMonto() + " medioPago " + this.getMedioPago();
    }
    
    

}
