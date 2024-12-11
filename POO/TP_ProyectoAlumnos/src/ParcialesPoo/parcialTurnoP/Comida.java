
package parcialTurnoP;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public abstract class Comida {
   private String nomComida;
   private double costo;

    public Comida(String nomComida, double costo) {
        this.nomComida = nomComida;
        this.costo = costo;
    }

    public String getNomComida() {
        return nomComida;
    }

    public void setNomComida(String nomComida) {
        this.nomComida = nomComida;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public double costoComida(String tipoComida){
        double valor=0.0;
        if(tipoComida=="Premium"){
            return valor = this.costo * 20.0;
        }
        if(tipoComida=="B"){
           return valor=this.costo *10.0;
        }
        return valor;
    }
   
    public String toStringComida(){
      String aux;
      aux= "nombre " + this.getNomComida() + " costo " + this.getCosto();
      return aux;
    }
   
}
