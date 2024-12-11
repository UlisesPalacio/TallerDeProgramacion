
package parcial8;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public abstract class Curso {

    private int anioCursada;
    private int cantAlu;
    private int maxAlu;
    private Alumno [] alum;

    public Curso(int anioCursada,int maxAlu) {
        this.anioCursada = anioCursada;
        this.cantAlu = 0;
        this.maxAlu = maxAlu;
        alum = new Alumno[maxAlu];
        for(int i=0;i<this.getMaxAlu();i++){
           alum[i]=null;
        }
    }

    
    public int getAnioCursada() {
        return anioCursada;
    }

    public void setAnioCursada(int anioCursada) {
        this.anioCursada = anioCursada;
    }

    public int getCantAlu() {
        return cantAlu;
    }

    public void setCantAlu(int cantAlu) {
        this.cantAlu = cantAlu;
    }

    public int getMaxAlu() {
        return maxAlu;
    }

    public void setMaxAlu(int maxAlu) {
        this.maxAlu = maxAlu;
    }

    public Alumno[] getAlum() {
        return alum;
    }

    public void setAlum(Alumno[] alum) {
        this.alum = alum;
    }
    
    public boolean agregarAlumno(Alumno al){
        if(this.getCantAlu()<this.getMaxAlu()){
           alum[this.cantAlu++]=al;
           return true;
        }else{
          return false;
        }
    }
    
    public void aumentarAsistencia(int dni){
       for(int i=0;i<this.getCantAlu();i++){
         if(this.getAlum()[i].getDni()==dni){
            this.getAlum()[i].incAsistencias();
         }
       }
    }
    
   public void aumentarAutoevaluaciones(int dni){
     for(int i=0;i<this.getCantAlu();i++){
         if(this.getAlum()[i].getDni()==dni){
            this.getAlum()[i].incAutoevaluaciones();
         }
       }
   }

   public abstract boolean puedeRendir(Alumno a);
   
   public int cantQuePuedenRendir(){
     int aux=0;
     for(int i=0;i<this.getCantAlu();i++){
       if(this.puedeRendir(this.getAlum()[i])){
          aux++;
       }
     }
     return aux;
   }

   
   
   
}
       
  
    
    

