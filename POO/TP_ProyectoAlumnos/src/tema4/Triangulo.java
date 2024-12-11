
package tema4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Triangulo extends Figura {
    
    private int lado1,lado2,lado3;

    public Triangulo(int lado1, int lado2, int lado3, String unColoR, String unColorL) {
        super(unColoR, unColorL);
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        String aux= super.toString() +
                " y sus lados  :" + "lado1:" + lado1 + ", lado2:" + lado2 + ", lado3:" + lado3;   
        return aux;
    }
    
    
    public double calcularPerimetro(){
        return lado1+lado2+lado3;
    }
    
    public double calcularArea(){
      double aux= calcularPerimetro()/2;
      return Math.sqrt(aux * (aux-lado1) * (aux-lado2)*(aux-lado3));
    }
    
    public void despintar(String colorR ,String colorL){
         this.setColorRelleno(colorR);
         this.setColorLinea(colorL);
    }

}
