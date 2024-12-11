
package parcial9;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Butaca {
  
    private String descriptor;
    private double precio;
    private boolean ocupada;

    public Butaca() {
        this.descriptor = "";
        this.precio = 0.0;
        this.ocupada = false;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public double getPrecio() {
        return 800+100;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
    public void ocupar(){
        this.ocupada = true;
    }
    
    public void desocupar(){
        this.ocupada = false;
    }

    @Override
    public String toString() {
        return " Butaca " + " descriptor " + this.getDescriptor() + " precio " + this.getPrecio() + " ocupada " + this.isOcupada();
    }
    
    
    
    
}
