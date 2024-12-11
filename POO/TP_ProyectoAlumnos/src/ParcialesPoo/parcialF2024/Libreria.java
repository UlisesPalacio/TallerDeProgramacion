
package parcialF2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Libreria {

    private String nombre;
    private int numVenta;
    private Caja [] cajas;
    private int cantCajas=4;
    private int maxTicket;
    private int cantActual;

    public Libreria(String nombre, int maxTicket) {
        this.nombre = nombre;
        this.maxTicket = maxTicket;
        this.cantActual=0;
        this.cajas = new Caja[cantCajas];
        for(int i=0;i<this.cantCajas;i++){
           this.cajas[i] = new Caja(maxTicket);
        }
    }
    
    public void generarTicket(int N, int dni, int cantLib, double monto, String formaPago) {
    if (N >= 1 && N <= this.cantCajas) {  // Verificamos que N esté en el rango válido
        Ticket t = new Ticket(N, dni, cantLib, monto, formaPago);
        this.cajas[N - 1].agregarTicket(t, N);  // Usamos N - 1 para acceder al índice correcto
    } else {
        System.out.println("Número de caja inválido.");
    }
}
    
    public void menosVenta(int X){
      for(int i=0;i<this.cantCajas;i++){
          this.cajas[i].noDisponible(X);
      }
    }
    
    public Ticket MaxTicketTotal() {
    double max = 0.0;
    Ticket t = null;  
    for (int i = 0; i < this.cantCajas; i++) {
        Ticket tMax = this.cajas[i].maxTicketporCaja(); 
        if (tMax != null && tMax.getMonto() > max) {
            max = tMax.getMonto();
            t = tMax;
        }
    }
    return t;  // Retorna `null` si no se encuentra ningún ticket
}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getMaxTicket() {
        return maxTicket;
    }

    public void setMaxTicket(int maxTicket) {
        this.maxTicket = maxTicket;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
    
    public String concatenador(){
        String aux="";
      for(int i=0;i<this.cantCajas;i++){
         aux+= "caja :"+ i+ this.cajas[i].toString();
      }
      return aux;
    }

    @Override
    public String toString() {
        return   this.concatenador();
    }
    
    
    
            
}
