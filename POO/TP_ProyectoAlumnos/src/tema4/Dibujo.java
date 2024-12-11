
package tema4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Dibujo {

    private String titulo;
    private Figura [] vector;
    private int guardadas;
    private int capacidadMaxima=10;

    public Dibujo(String titulo){
     this.titulo=titulo;   
     this.vector = new Figura[capacidadMaxima];
     this.guardadas=0;
    }
    
    public int getGuardadas(){
      return guardadas;
    }
    
    
    public void agregarFigura(Figura f){
      vector[this.getGuardadas()]=f;  
      System.out.println("la figura " + f.toString() + " se a guardado");
    }
    
    
    public double calcularArea(){
      double aux=0;  
      for(int i=0;i<getGuardadas();i++){
         aux += vector[i].calcularArea();
      }
      return aux;
    }
    
    public void mostrar(){
      int i;
      for(i=0;i<getGuardadas();i++){
        System.out.println(vector[i].toString());
      }
    }
    
    public boolean estaLleno(){
      return guardadas==capacidadMaxima;
    }
    
    
    
}
