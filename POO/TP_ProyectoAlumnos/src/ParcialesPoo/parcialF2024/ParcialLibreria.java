
package parcialF2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ParcialLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libreria l = new Libreria("charly", 5);  // Inicializa con 5 tickets por caja
    
    l.generarTicket(1, 75437, 3, 12.0, "débito"); // Caja 1
    l.generarTicket(2, 77655, 4, 15.0, "credito"); // Caja 2
    l.generarTicket(3, 676, 2, 20.0, "efectivo");   // Caja 3
    l.generarTicket(4, 544, 1, 25.0, "débito");     // Caja 4
    
    // Añade más tickets si es necesario, asegurándote de no exceder el número de tickets por caja
    l.generarTicket(1, 12345, 5, 30.0, "débito"); // Caja 1 - nuevo ticket
    
    l.menosVenta(4);  // Actualiza la disponibilidad de las cajas

    Ticket tMax = l.MaxTicketTotal();
    
    System.out.println(l.toString());
    
    if (tMax != null) {
        System.out.println(tMax.toString());  // Solo imprime si tMax no es null
    } else {
        System.out.println("No hay tickets disponibles para mostrar el máximo.");
    }
        
    }

}
