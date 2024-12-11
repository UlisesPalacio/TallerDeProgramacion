
package parcial10;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Fecha {
    private int [] vector;
    private int cantSalas;
    private int cantAlumnos;
    private Alumno [][] matriz;

    public Fecha(int n,int m) {
        this.cantSalas = n;
        this.cantAlumnos = m;
        this.matriz = new Alumno[cantSalas][cantAlumnos];
        this.vector = new int [this.cantSalas];
        for(int i=0;i<this.getCantSalas();i++){
          this.vector[i]=0;
        }
         for(int i=0;i<this.cantSalas;i++){
            for(int j=0;j<this.cantAlumnos;j++){
                this.matriz[i][j] = new Alumno("NADA", 0);
            }
        }
        
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getCantSalas() {
        return cantSalas;
    }

    public void setCantSalas(int cantSalas) {
        this.cantSalas = cantSalas;
    }

    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }

    public Alumno[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Alumno[][] matriz) {
        this.matriz = matriz;
    }

    public void agregarAlumno(Alumno a,int X){
      this.getMatriz()[X][this.vector[X]++]=a;
      
    }
    
    public void argregarTemas(int M){
      for(int i=0;i<this.getCantSalas();i++){
        for(int j=0;j<this.getCantAlumnos();j++){
           if(this.getMatriz()[i][j]!=null){
             this.getMatriz()[i][j].asignarTema(M);
           } 
        }
      }
    }
    
    public String concatenador(int M){
      String aux="";
      for(int i=0;i<this.getCantSalas();i++){
         for(int j=0;j<this.getCantAlumnos();j++){
            if(this.getMatriz()[i][j]!=null){
               if(this.getMatriz()[i][j].getNumeroTema()==M){
                 aux+=this.getMatriz()[i][j].toString();
               } 
            }
         }
      }
      return aux;
    }

    public String toString(int M) {
        return this.concatenador(M);
    }
    
    
    
    
}
