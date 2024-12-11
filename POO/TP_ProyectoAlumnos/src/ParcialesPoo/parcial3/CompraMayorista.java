
package parcial3;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class CompraMayorista extends Compra {

    private int cuit;

    public CompraMayorista(int cuit, int cantMaxproduc, int nro) {
        super(cantMaxproduc, nro);
        this.cuit = cuit;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        String aux= super.toString() + " Cuit " +this.cuit ;
        return aux;
    }

    
    
}
