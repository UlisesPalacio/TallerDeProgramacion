
package tema4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class RepMensual extends Sistema {

     private String[] meses = new String[]{"Enero", "Febrero", "Marzo",
        "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
        "Octubre", "Noviembre", "Diciembre"};

    public RepMensual(Estacion estacion, int anioInicial, int cantAnios) {
        super(estacion, anioInicial, cantAnios);
    }
     
     
    public String retornarMedia(){
      String aux="";
      double total;
      for(int j=0;j<12;j++){
       total=0;
       for(int i=0;i<this.getCantAnios();i++){
         total+=this.obtenerTemperatura(i,j);
       }
       aux+= meses[j] + ": " + Math.round((total/this.getCantAnios())*100)/100.0 + "°C \\n"; 
      }
      return aux;
    } 

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
