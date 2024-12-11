
package parcial14;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Director extends Trabajador {

    
    private double viaticos;

    public Director(double viaticos, String nom, int dni, int anioIngreso, double sueldoBasico) {
        super(nom, dni, anioIngreso, sueldoBasico);
        this.viaticos = viaticos;
    }

    
    
    public double getViaticos() {
        return viaticos;
    }

    public void setViaticos(double viaticos) {
        this.viaticos = viaticos;
    }

    
    public double sueldoDirector(){
      double totalDir=0.0;
      totalDir=super.sueldoTrabajador() + this.getViaticos();
      return totalDir;
    }

    
    public String toStringDirector() {
        return " Director " + super.TrabajadorSt() + "sueldo a cobrar " + this.sueldoDirector() + " \n ";
    }
    
    
    
    
    
}
