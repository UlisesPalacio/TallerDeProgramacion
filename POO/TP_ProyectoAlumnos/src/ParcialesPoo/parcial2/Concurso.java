
package parcial2;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Concurso {
    
    private Alumnos [][] matrizAlu;
    private int [] cantAlumnos;

    public Concurso(int N) {
        matrizAlu = new Alumnos[5][N];
        cantAlumnos = new int [5];
        for(int i=0;i<5;i++){
           this.cantAlumnos[i]=0;
        }
        for(int i=0;i<5;i++){
          for(int j=0;j<N;j++){
              this.matrizAlu[i][j]= new Alumnos("ninguno",0,"nada");
          }
        }       
    }
    
    
    public void agregarAlumno(Alumnos alu,int gener){
      matrizAlu[gener][this.cantAlumnos[gener]]= alu;
      this.cantAlumnos[gener]++;
    }
    
  
    public void agregarPuntaje(double punt, String nom){
       int i=0,j=0;
       boolean encontrado=false;
        while(i<5  && !encontrado ){
            while(j<this.cantAlumnos[i] && !encontrado){
              if(matrizAlu[i][j].getNombre().equals(nom)){
                 encontrado=true;
                 this.matrizAlu[i][j].setPuntaje(punt);
              }
              j++;
            }
            i++;
            j=0;
        }
     }
        
    
    public int generoMax(){
        int generoMax=0;
        int max=-999;
        for(int i=0;i<5;i++){
           if(this.cantAlumnos[i]<max) 
               max=this.cantAlumnos[i];
               generoMax=i;
        }
        return generoMax;
    }
    
    
     public Alumnos[][] getMatrizAlu() {
        return matrizAlu;
    }

    public void setMatrizAlu(Alumnos[][] matrizAlu) {
        this.matrizAlu = matrizAlu;
    }

    public int[] getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int[] cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }

    
    private String concatenador(){
        String aux="";
        for(int i=0;i<5;i++){
          for(int j=0;j<this.cantAlumnos[i];j++){
            aux +=" Genero "+ i+ this.matrizAlu[i][j].toString() + "\n";
          }
        }
        return aux;
        
    }
    
    
    @Override
    public String toString() {
        return this.concatenador();
    }
     
    
    
    
}
    
    

   
    
    
    
    
    
    
    
    


