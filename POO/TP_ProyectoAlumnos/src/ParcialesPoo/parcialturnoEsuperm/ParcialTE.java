
package parcialturnoEsuperm;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ParcialTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Supermercado s = new Supermercado(1234);
        
        Caja c1 = new Caja("aa",5);
        Caja c2 = new Caja("bb",5);
        Caja c3 = new Caja("cc",5);
        Caja c4 = new Caja("dd",5);

        s.agregarCaja(c1);
        s.agregarCaja(c2);
        s.agregarCaja(c3);
        s.agregarCaja(c4);
        
        s.GenerarTicket(1,22,2,20.0,"pago crédito");
        s.GenerarTicket(2,33,3,20.0,"pago crédito");
        s.GenerarTicket(3,44,4,20.0,"pago efectivo");
        s.GenerarTicket(4,55,5,20.0,"pago débito");


        
        System.out.println(s.toString());
        
        System.out.println("la caja con menor ticket es " + s.CajaMenor());

    }

}
