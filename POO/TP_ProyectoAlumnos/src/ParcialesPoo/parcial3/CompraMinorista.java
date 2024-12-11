
package parcial3;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class CompraMinorista extends Compra {

    private boolean jubilado;

    public CompraMinorista(boolean jubilado, int cantMaxproduc, int nro) {
        super(cantMaxproduc, nro);
        this.jubilado = jubilado;
    }

    public String verificarJub(){
      String aux;
      if(isJubilado()){
        aux="SI";
      }else{
        aux="NO";
      }
      return aux;
    }
    
    public boolean isJubilado() {
        return jubilado;
    }

    public void setJubilado(boolean jubilado) {
        this.jubilado = jubilado;
    }

    @Override
    public String toString() {
        String aux = super.toString() + " es jubilado " + this.verificarJub();
        return aux;
    }
    
    
    
}
