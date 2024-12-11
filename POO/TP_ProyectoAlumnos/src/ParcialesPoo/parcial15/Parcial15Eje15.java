
package parcial15;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial15Eje15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estacionamiento e = new Estacionamiento("aaa",100.0,5,5);
        
        Vehiculos v1 = new Vehiculos(432,1.0,"fiat","uno");
        Vehiculos v2 = new Vehiculos(765,3.0,"fiat","600");
        Vehiculos v3 = new Vehiculos(286,20.0,"renault","12");
        Vehiculos v4 = new Vehiculos(972,20.0,"chevrolet","corsa");
        Vehiculos v5 = new Vehiculos(169,20.0,"fiat","uno");
        
        e.agregarVehiculo(1, 1, v1);
        e.agregarVehiculo(1, 2, v5);
        e.agregarVehiculo(2, 2, v2);
        e.agregarVehiculo(3, 3, v3);
        e.agregarVehiculo(4, 5, v4);
        
        System.out.println(e.toString());

        e.liberarLugar(1, "fiat");
        
        System.out.println(e.liberarLugar(1, "fiat"));

        System.out.println(e.toString());

        
    }

}
