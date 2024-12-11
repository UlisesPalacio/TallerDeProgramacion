
package Parcial13;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Estacion {
    private String direccion;
    private double precioM3;
    Surtidor [] surtidores;
    private int cantSurtidores=6;
    private int maxVentas;

    public Estacion(String direccion, double precioM3,int maxVentas) {
        this.direccion = direccion;
        this.precioM3 = precioM3;
        this.surtidores = new Surtidor[this.cantSurtidores];
        for(int i=0;i<this.getCantSurtidores();i++){
            this.surtidores[i]= new Surtidor(maxVentas);
        }
    }
    
    public void agregarVenta(int numSurti,int dni,double cantiM3,String medioPago){
       Venta v = new Venta(dni,cantiM3,cantiM3*this.getPrecioM3(),medioPago);
       this.getSurtidores()[numSurti-1].agregarVenta(v);
    }

    public void sinServicio(int X){
        for(int i=0;i<this.getCantSurtidores();i++){
           this.getSurtidores()[i].actualizarServicio(X);
        }
    }
    
     public Venta ventaMax() {
        Venta venMax = null;
        Venta aux = null;
        double max = -1;
        for(int k = 0; k < cantSurtidores; k++) {
            aux = this.surtidores[k].calcularMax();
            if(aux != null && aux.getMontoCli()> max) {
                max = aux.getMontoCli();
                venMax = aux;
            }
        }
        return venMax;
    }
     
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecioM3() {
        return precioM3;
    }

    public void setPrecioM3(double precioM3) {
        this.precioM3 = precioM3;
    }

    public Surtidor[] getSurtidores() {
        return surtidores;
    }

    public void setSurtidores(Surtidor[] surtidores) {
        this.surtidores = surtidores;
    }

    public int getCantSurtidores() {
        return cantSurtidores;
    }

    public void setCantSurtidores(int cantSurtidores) {
        this.cantSurtidores = cantSurtidores;
    }

    public int getMaxVentas() {
        return maxVentas;
    }

    public void setMaxVentas(int maxVentas) {
        this.maxVentas = maxVentas;
    }
    
   
      private String concatenador() {
        String aux = "";
        for(int l=0; l < cantSurtidores; l++) {
            aux+= "Surtidor " + (l+1) + this.surtidores[l].toString() + "\n";
        }
        return aux;
    }
    
    public String toString() {
        return "Estacion de Servicio: "+ this.direccion+ "; Precio M3: "+ this.getPrecioM3() + "\n" + this.concatenador();
    }
    
    
}
