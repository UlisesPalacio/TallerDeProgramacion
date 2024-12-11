
package tema3;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Estante {
/**
 * Un estante almacena a lo sumo 20 libros. Implemente un constructor que
 * permita iniciar el estante sin libros. Provea métodos para: (i) devolver la
 * cantidad de libros que almacenados (ii) devolver si el estante está lleno
 * (iii) agregar un libro al estante (iv) devolver el libro con un título particular
 * que se recibe.
 */
    
    
    private int diml = 0;
    
    private Libro [] vector = new Libro[20];
    private int cantTotal;
    
    public Estante(int n){
      this.cantTotal=n;
      this.vector= new Libro[n];
    
    }
    
    
    public int cantLibros(){
     return diml;
    }
    
    public boolean estaLleno(){
      return diml==20;
    }
    
    public void agregarLibro(Libro lib){
      if(diml<20){
        vector[diml]= lib;
        this.diml++;
      }
    }
    
    
    public Libro getLibro(String titulo){
        if (titulo == null) { 
           return null;
        }
       int aux=0;
       
        while((aux < diml) && (!titulo.equals(this.vector[aux].getTitulo()))){
          aux++;
       }
      if(aux < diml){
          return vector[aux];
      }
      else
           return null;
   }
       
       
  }
        

    
      
