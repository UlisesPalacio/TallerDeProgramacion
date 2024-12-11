
package parcial4;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Pareja {
     private Participantes participante1;
     private Participantes participante2;
     private String estiloDeBaile;

    public Pareja(Participantes participante1, Participantes participante2, String estiloDeBaile) {
        this.participante1 = participante1;
        this.participante2 = participante2;
        this.estiloDeBaile = estiloDeBaile;
    }

    public Participantes getParticipante1() {
        return participante1;
    }

    public void setParticipante1(Participantes participante1) {
        this.participante1 = participante1;
    }

    public Participantes getParticipante2() {
        return participante2;
    }

    public void setParticipante2(Participantes participante2) {
        this.participante2 = participante2;
    }

    public String getEstiloDeBaile() {
        return estiloDeBaile;
    }

    public void setEstiloDeBaile(String estiloDeBaile) {
        this.estiloDeBaile = estiloDeBaile;
    }
     
     
    public int diferencia(){
        int aux;
       if(this.getParticipante1().getEdad() > this.getParticipante2().getEdad()){
           aux=this.getParticipante1().getEdad() - this.getParticipante2().getEdad();
       }else{
            aux=this.getParticipante2().getEdad() -this.getParticipante1().getEdad();
       }
       return aux;
    }

    @Override
    public String toString() {
        return  participante1 + " y " + participante2 +  " estilo De Baile " + estiloDeBaile;
    }

     
     
}
