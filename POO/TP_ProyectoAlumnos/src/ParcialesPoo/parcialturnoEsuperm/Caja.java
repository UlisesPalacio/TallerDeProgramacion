
package parcialturnoEsuperm;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Caja {

    private String nombreCajero;
    private Ticket []tickets;
    private int maxTicket;//dimf;
    private int cantTicket;//diml

    public Caja(String nombreCajero, int maxTicket) {
        this.nombreCajero = nombreCajero;
        this.maxTicket = maxTicket;
        this.cantTicket=0;
        this.tickets =  new Ticket[maxTicket];
        for(int i=0;i<this.getMaxTicket();i++){
           this.getTickets()[i] = null;
        }
    }
    
    public int cantMenorPago(){
        int max=0;
      for(int i=0;i<this.getCantTicket();i++){
        if(!this.getTickets()[i].getMedioPago().equals("pago crédito")){
           max+=1;
        }
      }
      return max;
    }
    
    public void agregarTicket(Ticket nueT){
       this.tickets[this.cantTicket++]=nueT;
    }
    

    public String getNombreCajero() {
        return nombreCajero;
    }

    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public int getMaxTicket() {
        return maxTicket;
    }

    public void setMaxTicket(int maxTicket) {
        this.maxTicket = maxTicket;
    }

    public int getCantTicket() {
        return cantTicket;
    }

    public void setCantTicket(int cantTicket) {
        this.cantTicket = cantTicket;
    }

    public String concatenadorTicket(){
      String aux="";
      int cantEmitidos=00;
      for(int i=0;i<this.getCantTicket();i++){
         aux+=this.getTickets()[i].toString() + cantEmitidos++;
      }
      return " Tickets emitidos " + cantEmitidos + aux;
    }
    
    
    @Override
    public String toString() {
        return  " nombreCajero " + this.getNombreCajero() +  this.concatenadorTicket() + "\n";
    }
    
    
    
    
}
