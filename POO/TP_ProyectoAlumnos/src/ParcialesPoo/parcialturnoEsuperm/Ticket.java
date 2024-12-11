
package parcialturnoEsuperm;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Ticket {

    private int numTicket;
    private int cuitTicket;
    private int cantProduc;
    private double montoAbonado;
    private String medioPago;

    public Ticket(int numTicket, int cuitTicket, int cantProduc, double montoAbonado, String medioPago) {
        this.numTicket = numTicket;
        this.cuitTicket = cuitTicket;
        this.cantProduc = cantProduc;
        this.montoAbonado = montoAbonado;
        this.medioPago = medioPago;
    }

    @Override
    public String toString() {
        return " Ticket " + " numTicket " + this.getNumTicket() + " cuitTicket " + this.getCuitTicket() + " cantProduc " + this.getCantProduc() + " montoAbonado " + this.getMontoAbonado() + " medioPago " + this.getMedioPago() + "\n";
    }
    
    
    

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public int getCuitTicket() {
        return cuitTicket;
    }

    public void setCuitTicket(int cuitTicket) {
        this.cuitTicket = cuitTicket;
    }

    public int getCantProduc() {
        return cantProduc;
    }

    public void setCantProduc(int cantProduc) {
        this.cantProduc = cantProduc;
    }

    public double getMontoAbonado() {
        return montoAbonado;
    }

    public void setMontoAbonado(double montoAbonado) {
        this.montoAbonado = montoAbonado;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    
    
    
    
}
