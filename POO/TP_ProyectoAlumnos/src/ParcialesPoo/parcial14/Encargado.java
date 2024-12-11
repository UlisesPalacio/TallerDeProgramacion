
package parcial14;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Encargado extends Trabajador {

    private int cantEmpleadosAcargo;

    public Encargado(int cantEmpleadosAcargo, String nom, int dni, int anioIngreso, double sueldoBasico) {
        super(nom, dni, anioIngreso, sueldoBasico);
        this.cantEmpleadosAcargo = cantEmpleadosAcargo;
    }

    public int getCantEmpleadosAcargo() {
        return cantEmpleadosAcargo;
    }

    public void setCantEmpleadosAcargo(int cantEmpleadosAcargo) {
        this.cantEmpleadosAcargo = cantEmpleadosAcargo;
    }
    
    public double sueldoEncargado(){
      double totalEn=0.0;
      totalEn=super.sueldoTrabajador() + this.getSueldoBasico()*10.0;
      return totalEn;
    }

    
    public String toStringEngargado() {
        return " Encargado " + super.TrabajadorSt()  + " Sueldo a cobrar " + this.sueldoEncargado() + " \n " ; 
    }
    
    
    
    
}
