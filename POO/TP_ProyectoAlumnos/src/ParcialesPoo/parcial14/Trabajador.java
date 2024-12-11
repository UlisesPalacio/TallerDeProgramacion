
package parcial14;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public abstract class Trabajador {
    private String nom;
    private int dni;
    private int anioIngreso;
    private double sueldoBasico;

    public Trabajador(String nom, int dni, int anioIngreso, double sueldoBasico) {
        this.nom = nom;
        this.dni = dni;
        this.anioIngreso = anioIngreso;
        this.sueldoBasico = sueldoBasico;
    }
    
    public double sueldoTrabajador(){
      double total=0.0;
      if((this.anioIngreso-2024)>20){
        return total= this.getSueldoBasico()*10.0;
      }
      return total+this.getSueldoBasico();
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    public String TrabajadorSt(){
      String aux;
      aux = " nombre " + this.getNom() + " dni " + this.getDni() ;
      return aux;
    }
    
    
}
