
package parcialturnoEsuperm;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Supermercado {
    private int direccion;
    private int numVenta;
    private Caja []cajas;
    private int cantCajas=5;
    private int cantTicket;

    public Supermercado(int direccion ) {
        this.direccion = direccion;
        this.cantTicket = 0;
        this.cajas = new Caja[cantCajas];
        for(int i=0;i<this.getCantCajas();i++){
           this.getCajas()[i]=null;
        }
    }
    
    public void agregarCaja(Caja c){
       this.getCajas()[this.cantTicket++]=c;
    }

    public void GenerarTicket(int N,int cuit,int cantp,double montoAb,String formPago){
       Ticket nueT = new Ticket(this.cantTicket,cuit,cantp,montoAb,formPago);
       if(this.getCajas()[N]!=null){
          this.getCajas()[N].agregarTicket(nueT);
       }
    }
    
    public int CajaMenor(){
      int min=999;
      int pos=0;
      for(int i=0;i<this.getCantCajas();i++){
         if(this.getCajas()[i]!=null){
           if(this.getCajas()[i].cantMenorPago()>min){
               min=this.getCajas()[i].cantMenorPago();
               pos=i;
           }
         }
      }
      return pos;
    }
    
    public String concatenador(){
      String aux="";
      for(int i=0;i<this.getCantCajas();i++){
          if(this.getCajas()[i]!=null){
             aux+=this.getCajas()[i].toString() + " \n ";
          }
      }
      return aux;
    }

    @Override
    public String toString() {
        return " Supermercado: " + "direccion " + this.getDireccion() + this.concatenador() + " \n ";
    }
    
    
    
    
    
    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public Caja[] getCajas() {
        return cajas;
    }

    public void setCajas(Caja[] cajas) {
        this.cajas = cajas;
    }

    public int getCantCajas() {
        return cantCajas;
    }

    public void setCantCajas(int cantCajas) {
        this.cantCajas = cantCajas;
    }

    public int getCantTicket() {
        return cantTicket;
    }

    public void setCantTicket(int cantTicket) {
        this.cantTicket = cantTicket;
    }
    
    
}
