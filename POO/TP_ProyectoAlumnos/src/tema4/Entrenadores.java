
package tema4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Entrenadores extends Empleado{
    
    private int cantCampeonatosGanados;

    public Entrenadores(int cantCampeonatosGanados, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        setCantCampeonatosGanados(cantCampeonatosGanados);
    }

    

    public int getCantCampeonatosGanados() {
        return cantCampeonatosGanados;
    }

    public void setCantCampeonatosGanados(int cantCampeonatosGanados) {
        this.cantCampeonatosGanados = cantCampeonatosGanados;
    }
    
    public double calcularEfectividad(){
     
        return this.getCantCampeonatosGanados()/ this.getAntiguedad();
    }
    
   public double sueldoAcobrar(){
     
       double aux;
       
       if(this.cantCampeonatosGanados>=1 && this.cantCampeonatosGanados<=4){
         aux = (this.getSueldoBasico()  * this.getAntiguedad()) + 5000;
         
       }else if(this.cantCampeonatosGanados>=5 && this.cantCampeonatosGanados<=10){
         aux = (this.getSueldoBasico()  * this.getAntiguedad()) + 30000;    
         
       }else if(this.cantCampeonatosGanados>10){
         aux = (this.getSueldoBasico()  * this.getAntiguedad()) + 50000;  
         
       }else{
         aux = this.getSueldoBasico()  * this.getAntiguedad();     
         
       }
       return aux;
   }

    @Override
    public String toString() {
        return "Entrenadores: " + super.toString();
    }
    
   
   
    
}
