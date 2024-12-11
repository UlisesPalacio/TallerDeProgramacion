
package tema4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class RepAnual extends Sistema {

    public RepAnual(Estacion estacion, int anioInicial, int cantAnios) {
        super(estacion, anioInicial, cantAnios);
    }

    
    public String retornarMedia(){
        String aux="";
        double total;
        for(int i=0;i<this.getCantAnios();i++){
         total=0;
         for(int j=0;j<12;j++){
           total += this.obtenerTemperatura(i,j);
         }
         aux="anio " + ( this.getAnioInicial()+i) + ":" + Math.round((total/12)*100)/100.0+"°C \n";
        }
        return aux;
        
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    

}
