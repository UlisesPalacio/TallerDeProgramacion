
package parcial12;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Concurso {
    
    private int [] categoria;
    private Canciones [][] cancion;
    private int categoMax;
    private int cancionesMax;

    public Concurso(int categoMax, int cancionesMax) {
        this.categoMax = categoMax;
        this.cancionesMax = cancionesMax;
        this.cancion = new Canciones[categoMax][cancionesMax];
        this.categoria = new int[categoMax];
        for(int i=0;i<this.getCategoMax();i++){
            this.getCategoria()[i]=0;
        }
        
         for(int i=0;i<this.getCategoMax();i++){
             for(int j=0;j<this.getCancionesMax();j++){
                this.getCancion()[i][j]=null;
             }
        }
        
    }
    
    public void agregarCancion(Canciones c,int catego){
        this.getCancion()[catego][this.getCategoria()[catego++]]=c;
    }
    
    
    public void interpretarCancion(int identif,Estudiante est,int puntaje){
       int i=0;
       boolean encontre=false;
       while(i<this.getCategoMax() && !encontre){
         int pos=0;
         while(pos < this.getCategoria()[i] && this.getCancion()[i][pos].getIdentificador()!=identif){
           if(pos < this.getCategoria()[i]){
              encontre=true;
              if(this.getCancion()[i][pos].getPuntaje()<puntaje){
                 this.getCancion()[i][pos].setPuntaje(puntaje);
                 this.getCancion()[i][pos].setGanador(est);
              }
           }
           i++;  
         } 
         
       }
    }
    
  public Estudiante estudianteGanador(int ident){
    int puntajeMax=0;  
    Estudiante maxEstudiante = null;
    for(int i=0;i<this.getCategoMax();i++){
       for(int j=0;j<this.getCancionesMax();j++){
          if(this.getCancion()[i][j].getIdentificador()==ident){
            if(this.getCancion()[i][j].getPuntaje() > puntajeMax){  
            maxEstudiante = this.estudianteGanador(ident);
            }
          } 
       }
    }
    return maxEstudiante;
  }
    
  public String cancionMax(int categ){
      int max=-1;
      String aux="";
     for(int j=0;j<this.getCancionesMax();j++){
        if(this.getCancion()[categ][j].getPuntaje()>max){
            max=this.getCancion()[categ][j].getPuntaje();
            aux=this.getCancion()[categ][j].getNombre();
        }
     }
     return aux;
  }  
  
  
    public int[] getCategoria() {
        return categoria;
    }

    public void setCategoria(int[] categoria) {
        this.categoria = categoria;
    }

    public Canciones[][] getCancion() {
        return cancion;
    }

    public void setCancion(Canciones[][] cancion) {
        this.cancion = cancion;
    }

    public int getCategoMax() {
        return categoMax;
    }

    public void setCategoMax(int categoMax) {
        this.categoMax = categoMax;
    }

    public int getCancionesMax() {
        return cancionesMax;
    }

    public void setCancionesMax(int cancionesMax) {
        this.cancionesMax = cancionesMax;
    }
    
    
 

}
