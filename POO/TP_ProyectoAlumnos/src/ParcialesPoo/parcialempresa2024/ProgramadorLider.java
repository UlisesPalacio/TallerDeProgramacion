
package Parciales.parcialempresa2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ProgramadorLider extends Programadores {

    private int antiguedadAnios,cantProyectos;

    public ProgramadorLider(int antiguedadAnios, int cantProyectos, String nombre, String dni, double sueldoBasico, int cantLineasCodigo, String lenguaje) {
        super(nombre, dni, sueldoBasico, cantLineasCodigo, lenguaje);
        this.antiguedadAnios = antiguedadAnios;
        this.cantProyectos = cantProyectos;
    }

    
    public double sueldoFinal(){
        double sueldoFinal= super.sueldoFinal();
        double valorAnio=10000 * this.getAntiguedadAnios();
        double valorProyecto= 20000 * this.getCantProyectos();
        return sueldoFinal+=valorAnio + valorProyecto;
        
    }
    
    
    public int getAntiguedadAnios() {
        return antiguedadAnios;
    }

    public void setAntiguedadAnios(int antiguedadAnios) {
        this.antiguedadAnios = antiguedadAnios;
    }

    public int getCantProyectos() {
        return cantProyectos;
    }

    public void setCantProyectos(int cantProyectos) {
        this.cantProyectos = cantProyectos;
    }

    
    
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
}
