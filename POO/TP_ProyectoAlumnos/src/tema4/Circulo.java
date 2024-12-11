
package tema4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio, String unCR, String unCL) {
        super(unCR, unCL);
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        
        return super.toString() +  " radio:" + radio;
    }
    
    public double calcularPerimetro(){
    
        return 2* Math.PI * this.getRadio();
    }
    
    public double calcularArea(){
     
       return Math.PI *(this.getRadio() * this.getRadio());
    }
    
    public void despintar(String colorR ,String colorL){
         this.setColorRelleno(colorR);
         this.setColorLinea(colorL);
    }
    
    
}
