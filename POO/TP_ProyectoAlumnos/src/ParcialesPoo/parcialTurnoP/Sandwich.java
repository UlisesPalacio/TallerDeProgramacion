
package parcialTurnoP;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Sandwich {
    private String nombre;
    private Pan unPan;
    private Ingrediente [] ingredientes;
    private int maxIngredientes;
    private int cantIngredientes;

    public Sandwich(String nombre, Pan unPan, int maxIngredientes) {
        this.nombre = nombre;
        this.unPan = unPan;
        this.maxIngredientes = maxIngredientes;
        this.cantIngredientes=0;
        this.ingredientes = new Ingrediente[maxIngredientes];
         for (int i = 0; i < maxIngredientes; i++) {
            this.ingredientes[i] = new Ingrediente("Ingrediente genérico","nada", 0.0);
        }
    }
    
    public void agregarIngrediente(Ingrediente in){
       
     this.getIngredientes()[this.cantIngredientes++]=in;
         
    
    }
    
    
    
    public String concatenador(){
      String aux="";
      double valor =0.0;
      for(int i=0;i<this.getCantIngredientes();i++){
         if(this.getIngredientes()[i]!=null){
             valor=this.getIngredientes()[i].costoIngrediente() + this.getUnPan().costoPan();
            aux+= "cantidad de ingredientes " +  i + this.getIngredientes()[i].toString() + "costo final del sandwich "+ valor + "\n";
         }
      }
      return aux;
    }
    

    @Override
    public String toString() {
        return " Sandwich " + " nombre " + this.getNombre() + " un pan " + this.getUnPan().toString() + this.concatenador() + "\n" ;
    }
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pan getUnPan() {
        return unPan;
    }

    public void setUnPan(Pan unPan) {
        this.unPan = unPan;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getMaxIngredientes() {
        return maxIngredientes;
    }

    public void setMaxIngredientes(int maxIngredientes) {
        this.maxIngredientes = maxIngredientes;
    }

    public int getCantIngredientes() {
        return cantIngredientes;
    }

    public void setCantIngredientes(int cantIngredientes) {
        this.cantIngredientes = cantIngredientes;
    }
    
    
}
