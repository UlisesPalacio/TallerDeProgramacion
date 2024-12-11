
package tema2;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class eje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Partido [] vector = new Partido[20];
        String local,visitante;
        int cantGolLocal,cantGolVisi;
        int  diml=0;
        System.out.println("ingrese el nombre del equipo visitante");
        visitante = Lector.leerString();
        int cantidad=0;
        int cant=0;
        
        while(!visitante.equals("ZZZ")&& diml<20){
          System.out.println("ingrese el equipo local");  
          local = Lector.leerString();
          System.out.println("ingrese los goles del local");  
          cantGolLocal=Lector.leerInt();
          System.out.println("ingrese los goles del visitante");  
          cantGolVisi = Lector.leerInt();
          
          vector[diml] = new Partido(local,visitante,cantGolLocal,cantGolVisi);
          
         
         if(vector[diml].getLocal().equalsIgnoreCase("river") && vector[diml].getGolesLocal() > vector[diml].getGolesVisitante()){
            cantidad++;
           } else if(vector[diml].getVisitante().equalsIgnoreCase("river") && vector[diml].getGolesVisitante() > vector[diml].getGolesLocal()){
           cantidad++;
}
          if(vector[diml].getLocal().equalsIgnoreCase("boca")){
             cant+=vector[diml].getGolesLocal();
          }
          
          
          diml +=1;
          System.out.println("ingrese otro nombre del equipo visitante");
          visitante = Lector.leerString();
        }
        System.out.println("la cantidad de partidos que gano river es "+ cantidad);
        System.out.println("la cantidad de goles que hizo river de local es " + cant);
       for(int i = 0; i < diml; i++) {
            System.out.println("Partido " + (i+1) + ": " + vector[i].getLocal() + " " + vector[i].getGolesLocal() + " vs " + vector[i].getVisitante() + " " + vector[i].getGolesVisitante());
        }
       
        
        
        
    }

}
