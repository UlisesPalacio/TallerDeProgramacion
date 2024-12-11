
package parcial5;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Sistema {
    
    Paciente [][] pacient;
    int dia;
    int turnos;
    

    public Sistema() {
       this.dia=5;
       this.turnos=6;
       this.pacient = new Paciente[dia][turnos];
       for(int i=0;i<this.getDia();i++){
         for(int j=0;j<this.getTurnos();j++){
            pacient[i][j]=null;
         }
       }       
    }

    public Paciente[][] getPacient() {
        return pacient;
    }

    public void setPacient(Paciente[][] pacient) {
        this.pacient = pacient;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getTurnos() {
        return turnos;
    }

    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }
    
    public void agendarPaciente(int D,int T,Paciente p){
        if(D>=0 && D<this.getDia() && T>=0 && T < this.getTurnos()) {
            pacient[D][T]=p;
        }
    }
    
   public String liberarTurnos(int Di){
      String aux="";
      for(int j=0;j<this.getTurnos();j++){
          if(this.getPacient()[Di][j]!=null){
              System.out.println("liberando el turno del paciente " + this.getPacient()[Di][j].getNombre() );
             aux+=pacient[Di][j].getNombre() + " ";
             pacient[Di][j]=null;
          }
      }
      return "se cancelo el turno para estos pacientes: " + aux;
   }
    
    public double costoTotal(){
       double montoTotal=0;
      for(int i=0;i<this.getDia();i++){
         for(int j=0;j<this.getTurnos();j++){
             if(this.getPacient()[i][j] != null){
               montoTotal+=this.getPacient()[i][j].getCosto();
             }    
         }
      }
      return montoTotal;
    }
    
    
    

}
