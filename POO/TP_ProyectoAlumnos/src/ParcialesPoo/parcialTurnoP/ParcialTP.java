
package parcialTurnoP;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ParcialTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pan unPan = new Pan("premium","frances",10.0);
        
        Sandwich s = new Sandwich("pebetete",unPan,5);
        
        Ingrediente  i1 = new Ingrediente("B","tomate",5.0);
        Ingrediente  i2 = new Ingrediente("A","mayonesa",3.0);
        Ingrediente  i3 = new Ingrediente("B","lechuga",6.0);
        Ingrediente  i4 = new Ingrediente("A","palta",7.0);

        
        s.agregarIngrediente(i1);
        s.agregarIngrediente(i2);
        s.agregarIngrediente(i3);
        s.agregarIngrediente(i4);
       
        
        
        double aux=0.0;
        System.out.println("metodo to String de el sandwich " + s.toString());
        
    }

}
