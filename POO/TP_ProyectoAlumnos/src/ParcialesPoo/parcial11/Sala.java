
package parcial11;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Sala {
    
   private PCompu [] vector;
   private int cantMax;

    public Sala(int cant) {
        this.cantMax = cant;
        this.vector = new PCompu[this.cantMax];
        for(int i=0;i<this.getCantMax();i++){
            this.getVector()[i]= new PCompu(0);
        }
        
    }

   
    
     public boolean hayEspacio(int n){
        return this.vector[n] == null;
    }
    
    public void agregarPC(PCompu pc, int num) {
    if (num >= 1 && num <= this.getCantMax() && this.hayEspacio(num - 1)) {
        this.getVector()[num - 1] = pc;  // Restar 1 para convertir de 1-index a 0-index
    }
}
    
     public void pcApagada() {
        int i;
        int minPC = 0;
        double min = 999.9;
        for(i=0;i<this.getCantMax();i++){
            if((!this.vector[i].isEncendido()) && (this.vector[i].getConsumo() < min)){
                    minPC = i;
                    min = this.vector[i].getConsumo();
                }
        }
        this.vector[minPC].encender();
    }
     
    public String concatenador() {
        int i,j;
        String aux = "";
        for(i=0;i<this.getCantMax();i++){
            if(this.vector[i].isEncendido()){
                   aux = aux + "ESPACIO: " + (i + 1) + "\n";
                }
        }
        return aux;
    }

    
    public PCompu[] getVector() {
        return vector;
    }

    public void setVector(PCompu[] vector) {
        this.vector = vector;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }


}
