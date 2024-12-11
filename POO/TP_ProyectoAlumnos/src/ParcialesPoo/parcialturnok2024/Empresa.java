
package parcialturnok2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Empresa {
    
    private String nombre;
    private ProgramadorLider pl;
    private Programador [] programadores;
    private int cantMax;//dimf
    private int cantActual;//diml

    public Empresa(String nombre, ProgramadorLider pl, int cantMax) {
        this.nombre = nombre;
        this.pl = pl;
        this.cantMax = cantMax;
        this.cantActual=0;
        this.programadores = new Programador[cantMax];
        for(int i=0;i<this.getCantMax();i++){
           this.programadores[i]=null;
        }
    }
    
    public void agregarProgramador(Programador p){
        if(this.getCantActual()<this.getCantMax()){
          this.getProgramadores()[this.cantActual++]=p;
        }
    }
    
    
    public double montoTotal(){
      double maxLider=pl.sueldoLider();
      double total=0.0;
      for(int i=0;i<this.getCantActual();i++){
        if(this.getProgramadores()[i]!=null){
            if(this.getProgramadores()[i].getCantLineas()>200){
                total+=this.getProgramadores()[i].getSueldo() + 50000;
            }else{
              total+=this.getProgramadores()[i].getSueldo();
            }
        }
      }
      total+=maxLider;
      return total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ProgramadorLider getPl() {
        return pl;
    }

    public void setPl(ProgramadorLider pl) {
        this.pl = pl;
    }

    public Programador[] getProgramadores() {
        return programadores;
    }

    public void setProgramadores(Programador[] programadores) {
        this.programadores = programadores;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
    
    public void aumentarSueldos(double M){
      pl.aumetarLider(M);
      for(int i=0;i<this.getCantActual();i++){
         this.getProgramadores()[i].aumetarSueldoProg(M);
      }
    }
    
    public String unaVes(int a){
       if(a==0){
         return " programador LIder " + this.getPl().toString();
       }else{
          return "";
       }
    }

    public String concatenador(){
      String aux="";
      int a=0;
      for(int i=0;i<this.getCantActual();i++){
        if(this.getProgramadores()[i]!=null){
          aux+=  this.unaVes(a) + a++  + " Programador: "  + this.getProgramadores()[i].toString() + " \n ";
        }
      }
      return aux;
    }
    
    
    
    @Override
    public String toString() {
        String aux="Empresa" + " nombre " + this.getNombre() + "\n ";
        return aux + this.concatenador() ;
    }
    
    
    
    
            

}
