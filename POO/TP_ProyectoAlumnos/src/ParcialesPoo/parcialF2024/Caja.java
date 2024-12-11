
package parcialF2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Caja {

    private boolean disponible;
    private Ticket [] tickets;
    private int maxTicket;
    private int cantTicket;

    public Caja(int maxTicket) {
        this.disponible=true;
        this.maxTicket = maxTicket;
        this.cantTicket=0;
        this.tickets= new Ticket[maxTicket];
        
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
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

   public void agregarTicket(Ticket t, int n) {
    if (cantTicket < maxTicket) {  // Verificamos que no hayamos alcanzado el máximo
        this.tickets[cantTicket++] = t;  // Almacenamos el ticket y aumentamos el contador
    } else {
        System.out.println("No se pueden agregar más tickets, la caja está llena.");
    }
}

    
    public void setCantTicket(int cantTicket) {
        this.cantTicket = cantTicket;
    }
    
    public int totalPorCaja() {
    int total = 0;
    for (int j = 0; j < this.cantTicket; j++) {  // Cambiar maxTicket a cantTicket
        if (this.tickets[j] != null) {  // Verificamos que el ticket no sea null
            total += this.tickets[j].getCantLibros();
        }
    }
    return total;
}
    
    public boolean noDisponible(int X){
      boolean aux=false;  
      if(this.totalPorCaja()< X){
        aux= this.disponible=false;
      }
      return aux;
    }
    
    public Ticket maxTicketporCaja() {
    Ticket t = null;
    double max = -1;  // Valor inicial que representa el monto más bajo

    for (int j = 0; j < this.cantTicket; j++) {  // Cambia maxTicket a cantTicket
        if (this.tickets[j] != null && this.tickets[j].getMonto() > max) {
            max = this.tickets[j].getMonto();
            t = this.tickets[j];
        }
    }
    return t;  // Retorna `null` si no hay tickets
}

    
    public String disponible(){
      if(this.isDisponible()){
          return "SI";
      }else{
        return "no";
      }
    }

   
    public String concate(){
       String aux="";
      for(int i=0;i<this.getMaxTicket();i++){
           if (this.tickets[i] != null) {
             aux+=this.tickets[i].toString() + "\n";
           }
      }
      
      return aux;
    }

    @Override
    public String toString() {
        return "Tickets emitidos " + " esta disponible " +" ( "+ this.disponible()+ " ) " + this.concate();
    }
  
    
    
}
