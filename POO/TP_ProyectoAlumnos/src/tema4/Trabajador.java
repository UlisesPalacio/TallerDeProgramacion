
package tema4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Trabajador extends Persona {
    
    private String rolTrabajo;

    public Trabajador(String rolTrabajo, String unNombre, int unDNI, int unaEdad) {
        super(unNombre, unDNI, unaEdad);
        setRolTrabajo(rolTrabajo);
    }

    public String getRolTrabajo() {
        return rolTrabajo;
    }

    public void setRolTrabajo(String rolTrabajo) {
        this.rolTrabajo = rolTrabajo;
    }

    @Override
    public String toString() {
        return super.toString()  + " soy "+ this.getRolTrabajo();
    }

    
    

}
