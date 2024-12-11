
package parcialTurnoP;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Ingrediente extends Comida {
  
    private String grupo;

    public Ingrediente(String grupo, String nomComida, double costo) {
        super(nomComida, costo);
        this.grupo=grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupoA(String calidad) {
        this.grupo = calidad;
    }

    
    
    
    public double costoIngrediente(){
      return super.costoComida(grupo);
    }
    
    

    @Override
    public String toString() {
        return   " Un Ingrediente " + super.toStringComida() + " grupo " + this.getGrupo()+ "\n";
    }
    
    
    
}
