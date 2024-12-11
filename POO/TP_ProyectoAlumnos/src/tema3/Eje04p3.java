
package tema3;

import  PaqueteLectura.GeneradorAleatorio;
import  PaqueteLectura.Lector;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Eje04p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeneradorAleatorio.iniciar();
        int dimf,dni,edad,numHabitacion;
        double monto;
        String nombre;
        System.out.println("ingrese la cantidad de habitaciones disponibles");
        dimf= Lector.leerInt();
        Hotel hotel = new Hotel(dimf);
        
        Cliente cli1 = new Cliente(nombre=GeneradorAleatorio.generarString(6),dni=GeneradorAleatorio.generarInt(8000),edad=GeneradorAleatorio.generarInt(100));
        
       Cliente cli2 = new Cliente(nombre=GeneradorAleatorio.generarString(6),dni=GeneradorAleatorio.generarInt(8000),edad=GeneradorAleatorio.generarInt(100));
       
       Cliente cli3 = new Cliente(nombre=GeneradorAleatorio.generarString(6),dni=GeneradorAleatorio.generarInt(8000),edad=GeneradorAleatorio.generarInt(100));
        
       System.out.println("ingrese el numero de las habitaciones");
       hotel.ingresarCliente(cli1, numHabitacion=Lector.leerInt());
       hotel.ingresarCliente(cli2, numHabitacion=Lector.leerInt());
       hotel.ingresarCliente(cli3, numHabitacion=Lector.leerInt());
       
        System.out.print(hotel.toString());
        
        System.out.println("ingrese el monto a aumentar");
        hotel.aumentoHabitacion(monto = GeneradorAleatorio.generarDouble(20));
        System.out.println("monto a aumentar es "+ monto);
        
        System.out.print(hotel.toString());
        
        
        
    }

}
