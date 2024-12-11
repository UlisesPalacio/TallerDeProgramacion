
package parcial11;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class PCompu {

    private boolean encendido;
    private double consumo;

    public PCompu(double consumo) {
        this.consumo = consumo;
        this.encendido=false;
    }

    public boolean isEncendido() {
        return encendido;
    }
    

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public boolean encender(){
      return this.encendido=true;
    }
    
    @Override
    public String toString() {
        return " PCompu " + " encendido " + this.isEncendido() + " consumo " + this.getConsumo() ;
    }
    
    
    
    
}
