
package tema4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Jugadores extends Empleado {

     private int numPartidosJugados,numeroGolesAnotados;

    public Jugadores(String nombre,double sueldoBasico ,int antiguedad  ,int numPartidosJugados, int numeroGolesAnotados) {
        super(nombre,sueldoBasico,antiguedad);
        setNumPartidosJugados(numPartidosJugados);
        setNumeroGolesAnotados(numeroGolesAnotados);
    }
    

    public int getNumPartidosJugados() {
        return numPartidosJugados;
    }

    public void setNumPartidosJugados(int numPartidosJugados) {
        this.numPartidosJugados = numPartidosJugados;
    }

    public int getNumeroGolesAnotados() {
        return numeroGolesAnotados;
    }

    public void setNumeroGolesAnotados(int numeroGolesAnotados) {
        this.numeroGolesAnotados = numeroGolesAnotados;
    }
     
    public double calcularEfectividad(){
      
        return this.getNumPartidosJugados() / this.getNumeroGolesAnotados();
    }
    
    public double sueldoAcobrar(){
         double aux;
         if(this.calcularEfectividad() > 0.5){
            aux= (this.getSueldoBasico() + (this.getAntiguedad()* 1.10)) + this.getSueldoBasico();
         }else{
             aux= this.getSueldoBasico() + (this.getAntiguedad()* 1.10);
         }
         return aux;
    }

    @Override
    public String toString() {
        return "Jugadores: " + super.toString();
    }
    
    
     
}
