/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author Usuario
 */
public class eje03 {

    /**
     * /@param args the command line arguments
     */
    /**
     3
        A- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros. 
        Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para: 
        (i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno 
        (iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.
        
        B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante, 
        busque e informe el autor del libro “Mujercitas”.
        
        C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que 
        almacenen como máximo N libros? ¿Cómo instanciaría el estante?
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estante estante = new Estante();//creo un objeto de clase estante
        String nombreLibro = Lector.leerString();
        String nombreAutor = Lector.leerString();
        
        while(!"zzz".equals(nombreLibro)){
          Autor autor = new Autor(); 
          autor.setNombre(nombreAutor);
          Libro libro = new Libro();
          libro.setTitulo(nombreLibro);
          libro.setPrimerAutor(autor);
          estante.agregarLibro(libro);
          System.out.println("ingrese un nuevo nombre de libro");
          nombreLibro =Lector.leerString();
          System.out.println("ingrese el nombre del autor");
          nombreAutor = Lector.leerString();
        }
        
        System.out.println(estante.getLibro("mujercitas"));
      
    }
    
}
