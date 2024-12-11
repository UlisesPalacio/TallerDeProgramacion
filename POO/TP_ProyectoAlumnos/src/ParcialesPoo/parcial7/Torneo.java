
package parcial7;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Torneo {

    private String nombre;
    private int [] fecha;
    private int cantFecha;
    private Goleador [][]tabla;
    private int cantJugadores;

    public Torneo(String nombre, int cantF, int cantJ) {
        this.nombre = nombre;
        this.cantFecha = cantF;
        this.cantJugadores = cantJ;
        this.tabla = new Goleador[cantFecha][cantJugadores];
        this.fecha = new int [cantF];
        
        for(int i=0;i<this.getCantFecha();i++){
           for(int j=0;j<this.getCantJugadores();j++){
              this.tabla[i][j]= new Goleador("nada","ninguno",0);
           }
        }
        
        for(int i=0;i<this.getCantFecha();i++){
          fecha[i]=0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int [] getFecha() {
        return fecha;
    }

    public void setFecha(int [] fecha) {
        this.fecha = fecha;
    }

    public int getCantFecha() {
        return cantFecha;
    }

    public void setCantFecha(int cantFecha) {
        this.cantFecha = cantFecha;
    }

    public Goleador[][] getTabla() {
        return tabla;
    }

    public void setTabla(Goleador[][] tabla) {
        this.tabla = tabla;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }
    
    public void agregarGoleador(int fechaX,Goleador g){
       tabla[fechaX-1][this.getFecha()[fechaX-1]]=g;
       this.getFecha()[fechaX-1]++;
    }
    
    public Goleador menosGol(int fechaX){
       int min=999;
       Goleador golMin = new Goleador("nada","nada",0);
       for(int j=0;j<this.getFecha()[fechaX-1];j++){
          if(this.tabla[fechaX-1][j].getCantGoles() < min){
             min=this.tabla[fechaX-1][j].getCantGoles();
             golMin=this.tabla[fechaX-1][j];
          }
       }
       
      return golMin;
    }
    
    public int canGoleadores(){
      int cant=0;
      for(int i=0;i<this.getCantFecha();i++){
         cant+= this.getFecha()[i];
      }  
      return cant;
    }
    
    public String concatenador(){
      String aux="";
      for(int i=0;i<this.getCantFecha();i++){
         for(int j=0;j<this.getCantJugadores();j++){
            aux+= this.getTabla()[i][j].toString();
         }
         aux += " \n ";
      }
      return aux;
    }

    @Override
    public String toString() {
        return " Torneo 2024 " + this.getNombre() + this.concatenador();
    }
    
    
    
    
}
