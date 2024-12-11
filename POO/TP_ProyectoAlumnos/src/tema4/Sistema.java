
package tema4;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public abstract class Sistema {

    private Estacion estacion;
    private int anioInicial;// anio A
    private int cantAnios;//N anios consecutivos
    private double [][] temp;

    public Sistema(Estacion estacion, int anioInicial, int cantAnios) {
        this.estacion = estacion;
        this.anioInicial = anioInicial;
        this.cantAnios = cantAnios;
        this.temp = new double[cantAnios][12];
        for(int i=0;i<cantAnios;i++){
          for(int j=0;j<12;j++){
            temp[i][j]= 25 + GeneradorAleatorio.generarDouble(50);
          }
        
        }
    }

    public Estacion getEstacion() {
        return estacion;
    }

    public void setEstacion(Estacion estacion) {
        this.estacion = estacion;
    }

    public int getAnioInicial() {
        return anioInicial;
    }

    public void setAnioInicial(int anioInicial) {
        this.anioInicial = anioInicial;
    }

    public int getCantAnios() {
        return cantAnios;
    }

    public void setCantAnios(int cantAnios) {
        this.cantAnios = cantAnios;
    }
    
    public void cargarTemperatura(int mes,int anio,double unaTemp){
      temp[anio][mes-1]=unaTemp;
      System.out.println("temperatura cargada");
    }
    
    public double obtenerTemperatura(int anio, int mes){
        return this.temp[anio][mes];
    }
    
    public String mayorTemp(){
    double max=0;
    int anioMax=-1;
    int mesMax=-1;
    for(int i=0;i<cantAnios;i++){
       for(int j=0;j<12;j++){
         if(temp[i][j]>max){
             max = temp[i][j];
             anioMax=i;
             mesMax=j;
         }
       }
    
    }
    return "la temperatura maxima fue en el anio " + anioMax + "en el mes " + mesMax;
    }
    
    
    public abstract String retornarMedia();

    @Override
    public String toString() {
        return estacion + "\n" + retornarMedia();
    }
    
    
    
    
    
    
    
    
    
}
