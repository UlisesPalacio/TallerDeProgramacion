
package parcialturnok2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ProgramadorLider extends Programador {

    private int antiguedad;
    private int cantProyectos;

    public ProgramadorLider(int antiguedad, int cantProyectos, String nom, int dni, double sueldo, int cantLineas, String lenguaje) {
        super(nom, dni, sueldo, cantLineas, lenguaje);
        this.antiguedad = antiguedad;
        this.cantProyectos = cantProyectos;
    }

    public double sueldoLider(){
      double aux= this.getSueldo() + this.getAntiguedad()*10000 + this.getCantProyectos()*20000;
      return aux;
    }
    
    public void aumetarLider(double M){
      this.setSueldo(this.getSueldo() + M);
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getCantProyectos() {
        return cantProyectos;
    }

    public void setCantProyectos(int cantProyectos) {
        this.cantProyectos = cantProyectos;
    }

    @Override
    public String toString() {
        return "ProgramadorLider: " + "antiguedad " + antiguedad + ", cantProyectos=" + cantProyectos;
    }
    
    
    
    
    
}
