
package tema3;

import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Eje03p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=15;
        Estante estanteria = new Estante(n);
        GeneradorAleatorio.iniciar();
        
        int i;
        
        for (i=0;i<n;i++){
          Autor aut = new Autor(GeneradorAleatorio.generarString(6),GeneradorAleatorio.generarString(20),GeneradorAleatorio.generarString(8));
          Libro lib = new Libro(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(2024),aut,GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarDouble(100));
          if(i==11){
            lib.setTitulo("mujercitas");
          }
          estanteria.agregarLibro(lib);
         System.out.println(lib);
        } 
        
        
        
        System.out.println(estanteria.cantLibros());
        System.out.println(estanteria.estaLleno());
        System.out.println(estanteria.getLibro("mujercitas"));


    }
    

    

}
