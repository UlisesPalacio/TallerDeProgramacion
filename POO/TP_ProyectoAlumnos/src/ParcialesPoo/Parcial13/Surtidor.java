
package Parcial13;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Surtidor {
   private boolean servicio;
   private Venta [] vector;
   private int cantVenta;
   private int cantMax;

    public Surtidor(int cantidad) {
        this.servicio = true;
        this.cantVenta=0;
        this.cantMax=cantidad;
        this.vector = new Venta[cantMax];
        for(int i=0;i<cantidad;i++){
          this.vector = null;
        }
    }

    public void agregarVenta(Venta v){
      if(cantVenta<cantMax){
         this.vector[cantVenta++]=v;
      }
    }
    
    private double calcularCantidad(){
        double cant=0;
      for(int j=0;j<this.getCantVenta();j++){
        cant+=this.vector[j].getCantM3Cli();
      }
      return cant;
    }
    
    
    
    
    public void actualizarServicio(int X){
     if(this.calcularCantidad()<X){
         this.servicio=false;
     }
        
    }
    
    
    
    public Venta calcularMax() {
        double max = -1;
        Venta venMax = null;
        for(int k=0; k < getCantVenta(); k++) {
            if(this.vector[k].getMontoCli() > max) {
                max = this.vector[k].getMontoCli();
                venMax = this.vector[k];
            }
        }
        return venMax;
    }
    
    
    public boolean isServicio() {
        return servicio;
    }

    public void setServicio(boolean servicio) {
        this.servicio = servicio;
    }

    public Venta[] getVector() {
        return vector;
    }

    public void setVector(Venta[] vector) {
        this.vector = vector;
    }

    public int getCantVenta() {
        return cantVenta;
    }

    public void setCantVenta(int cantVenta) {
        this.cantVenta = cantVenta;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }
   
    private String verificarServicio() {
        if(this.isServicio()) {
            return " Esta en servicio ";
        }
        else
            return " Esta fuera de servicio ";
    }
    
    private String concatenador() {
        String aux = "";
        for(int m=0; m < cantVenta; m++) {
            aux= aux+ " | " + this.vector[m].toString() + " | ";
        }
        return aux;
    }
    
    @Override
    public String toString() {
        String aux = this.verificarServicio() + " Ventas: "+ this.concatenador();
        return aux;
    }
   

}
