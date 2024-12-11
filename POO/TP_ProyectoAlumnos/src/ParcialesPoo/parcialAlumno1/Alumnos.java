
package Parciales;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Alumnos {
    private int dni;
    private String nombre;
    private Materia [] materias;
    private int cantAprobadas;
    private int cantMax;

    public Alumnos(int dni,String nombre,int cantMax) {
        this.dni = dni;
        this.nombre=nombre;
        this.materias = materias;
        this.cantAprobadas = 0;//sin materias aprobadas inicialmente
        this.cantMax = cantMax;
        this.materias = new Materia[cantMax];
        
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public int getCantAprobadas() {
        return cantAprobadas;
    }

    public void setCantAprobadas(int cantAprobadas) {
        this.cantAprobadas = cantAprobadas;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }
    
    public boolean hayEspacio(){
      return this.cantMax!= this.cantAprobadas;
    }
    
    public void agregarMateria(Materia mat){
        if(hayEspacio()){
           this.materias[this.cantAprobadas++]=mat;
        }
    }
    
   public boolean esGraduado(){
    int aux=0;
    if(this.cantAprobadas==this.cantMax){
        while((aux<this.cantAprobadas)&& (!this.materias[aux].getNombreMateria().equals("tesis"))){
           aux++;
        }
    }
     if(aux==this.cantAprobadas){//si aux es igual a la cantidad de materias aprobadas entonces
       return false;             //la tesis no esta y el false si no tiene el mismo tamaño
     }else{                      //encontro la materia tesis en alguna de las posiciones t no llego
      return true;               //al final entonces es true
     }
     
   } 
   
   public String concatenador(){
    int i;
    String aux="";
    for(i=0;i<this.getCantAprobadas();i++){
     
        aux += this.materias[i].toString();
    }
    return aux;
   }
   
  
    @Override
    public String toString() {
        return "dni: " + this.getDni() + " nombre: " + this.getNombre() + "Materias:" + this.concatenador() + "es graduado " + this.esGraduado();
    }
}
