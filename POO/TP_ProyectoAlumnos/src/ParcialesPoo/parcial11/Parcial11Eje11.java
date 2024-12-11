
package parcial11;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial11Eje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Sala salas = new Sala(5);

        PCompu pc1 = new PCompu(10.0);
        PCompu pc2 = new PCompu(11.0);
        PCompu pc3 = new PCompu(15.0);

        salas.agregarPC(pc1, 1);
        salas.agregarPC(pc2, 2);
        salas.agregarPC(pc3, 3);

        System.out.println("Estado inicial de las PCs:");
        System.out.println(pc1.toString());
        System.out.println(pc2.toString());
        System.out.println(pc3.toString());

        System.out.println("Las PCs que están encendidas son: " + salas.concatenador());
        System.out.println("..............................");

        salas.pcApagada();
        System.out.println("Las PCs que están encendidas son: " + salas.concatenador());

        System.out.println("------.--------------");

        salas.pcApagada();
        System.out.println("Las PCs que están encendidas son: " + salas.concatenador());
    }

}
