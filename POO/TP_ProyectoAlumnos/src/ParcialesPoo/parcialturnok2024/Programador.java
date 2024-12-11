
package parcialturnok2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Programador {
    private String nom;
    private int dni;
    private double sueldo;
    private int cantLineas;
    private String lenguaje;

    public Programador(String nom, int dni, double sueldo, int cantLineas, String lenguaje) {
        this.nom = nom;
        this.dni = dni;
        this.sueldo = sueldo;
        this.cantLineas = cantLineas;
        this.lenguaje = lenguaje;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCantLineas() {
        return cantLineas;
    }

    public void setCantLineas(int cantLineas) {
        this.cantLineas = cantLineas;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    public void aumetarSueldoProg(double M){
        this.setSueldo(this.getSueldo() + M);
    }

    @Override
    public String toString() {
        return  " nombre " + this.getNom() + " dni " + this.getDni() +   this.getLenguaje()+ " sueldoFinal " + this.getSueldo();
    }
    
    
    
}
