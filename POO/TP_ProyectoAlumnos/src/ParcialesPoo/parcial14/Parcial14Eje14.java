
package parcial14;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Parcial14Eje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Director dir = new Director(22.0,"a",123,2010,100.0);
        
        Empresa emp = new Empresa("charly car",33432,dir,5);
        
        Encargado enc1 = new Encargado(2,"bbbb",5432,2015,50.0);
        Encargado enc2 = new Encargado(3,"ccccc",5432,2011,60.0);
        Encargado enc3 = new Encargado(4,"dddd",5432,2009,70.0);
        Encargado enc4 = new Encargado(5,"eeee",5432,2008,80.0);

        emp.agregarEncargado(enc1);
        emp.agregarEncargado(enc2);
        emp.agregarEncargado(enc3);
        emp.agregarEncargado(enc4);

        System.out.println("string del encargado " +  emp.toString());
        
    }

}
