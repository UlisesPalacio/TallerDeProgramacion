
package parcial9;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Funcion {

    private String titulo;
    private int fecha;
    private int hora;
    private int cantFila;
    private int  cantButaca;
    Butaca [][]sala;

    public Funcion(String titulo, int fecha, int hora, int fila, int butaca) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.cantFila = fila;
        this.cantButaca = butaca;
        this.sala = new Butaca[this.cantFila][this.cantButaca];
        for(int i=0;i<this.getCantFila();i++){
            for(int j=0;j<this.getCantButaca();j++){
                this.sala[i][j] = new Butaca();
            }
        }
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getCantFila() {
        return cantFila;
    }

    public void setCantFila(int cantFila) {
        this.cantFila = cantFila;
    }

    public int getCantButaca() {
        return cantButaca;
    }

    public void setCantButaca(int cantButaca) {
        this.cantButaca = cantButaca;
    }

    public Butaca[][] getSala() {
        return sala;
    }

    public void setSala(Butaca[][] sala) {
        this.sala = sala;
    }
    
     
     public double ocuparButaca(int B, int F){
         if(!this.sala[B-1][F-1].isOcupada()){
            this.sala[B-1][F-1].ocupar();
            return this.sala[B-1][F-1].getPrecio();
         }else{
            return -1.0;
         }
    }
     
     public void desocuparButaca(int B){
       for(int j=0;j<this.getCantButaca();j++){
          this.getSala()[B-1][j].desocupar();
       }
     }
     
     public String obtenerButacas(int F){
         String aux="";
        for(int i=0;i<this.getCantFila();i++){
           aux+=this.getSala()[i][F-1].toString() + "\n";
        }
        return aux;
     }
    
     public String concatenador(){
       String aux="";
       for(int i=0;i<this.getCantFila();i++){
            for(int j=0;j<this.getCantButaca();j++){
                aux+= this.sala[i][j].toString() + "\n";
            }
        }
       return aux;
     }

    @Override
    public String toString() {
        String aux = " Funcion " + " titulo " + this.getTitulo() + " fecha " + this.getFecha() + " hora" + this.getHora() + this.concatenador();
        return aux;
    }
     
     
     
    
    
}
