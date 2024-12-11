
package parcial4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Concurso {
    
    private Pareja []parejas;
    private int cantParejas;
    private int maxParejas;

    public Concurso(int maxPar) {
        this.maxParejas = maxPar;
        this.cantParejas=0;
        this.parejas= new Pareja[this.maxParejas];
        for(int i=0;i<this.getMaxParejas();i++){
            this.getParejas()[i]=null;//sin parejas inicialmente
        }
    }
    
    public boolean hayLugar(){
      return this.getCantParejas()< this.getMaxParejas();
    }
    
    public void agregarPareja(Pareja p){
      if(hayLugar()){
         this.getParejas()[this.cantParejas]=p;
         this.cantParejas++;
      }
       
    }
    
    public Pareja maxDiferencia(){
      int max=-1;
      Pareja parMax= null;
      for(int i=0;i<this.getCantParejas();i++){
        if(this.getParejas()[i].diferencia()> max){
           max=this.getParejas()[i].diferencia();
           parMax = this.getParejas()[i];
        }
          
      }
      return parMax;
         
    }
    

    public Pareja[] getParejas() {
        return parejas;
    }

    public void setParejas(Pareja[] parejas) {
        this.parejas = parejas;
    }

    public int getCantParejas() {
        return cantParejas;
    }

    public void setCantParejas(int cantParejas) {
        this.cantParejas = cantParejas;
    }

    public int getMaxParejas() {
        return maxParejas;
    }

    public void setMaxParejas(int maxParejas) {
        this.maxParejas = maxParejas;
    }

    @Override
    public String toString() {
        return this.maxDiferencia().toString();
    }
    
    
    
    
    
    
    

}
