
package parcialTurnoP;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Pan extends Comida{

    private String calidad;

    public Pan(String calidad, String nomComida, double costo) {
        super(nomComida, costo);
        this.calidad = calidad;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidadm(String calidad) {
        this.calidad = calidad;
    }

   
    
    public double costoPan(){
      return super.costoComida(calidad);
    }
    
    @Override
    public String toString() {
        return   " Un Pan " + super.toStringComida() + " calidad " + this.getCalidad() + "\n";
    }
    
}
