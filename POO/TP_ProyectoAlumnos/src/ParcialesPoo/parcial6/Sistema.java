
package parcial6;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Sistema {
    
    private Paciente [][] pacient;
    private int dia;
    private int turno;

    public Sistema() {
        this.dia=5;
        this.turno=6;
        this.pacient = new Paciente[dia][turno];
        for(int i=0;i<this.getDia();i++){
          for(int j=0;j<this.getTurno();j++){
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

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public boolean hayLugar(){
        return this.getDia()>=0 && this.getDia()<5 && this.getTurno()>=0 && this.getTurno()<6;
    }
    
   public void agregarPaciente(int dia, int turno, Paciente p) {
    if (this.pacient[dia][turno] == null) {
        this.pacient[dia][turno] = p;
        System.out.println("Paciente agregado en dia " + dia + " y turno " + turno + ": " + p.getNombre());
    }
}
    
    public void liberarPaciente(String nom){
        
        for(int i=0;i<this.getDia();i++){
          for(int j=0;j<this.getTurno();j++){
              if(this.getPacient()[i][j]!=null && this.getPacient()[i][j].getNombre().equals(nom)){
                 pacient[i][j]=null;
              }  
                 
          }
        }
    }
    
    public boolean tieneTurno(int dia, String nombre) {
    boolean encontre = false;
    int j = 0;
    // Recorremos todas las posiciones de turnos en el día especificado
    while (!encontre && j < this.getTurno()) {
        // Verificamos que el paciente no sea null y que el nombre coincida
        if (this.getPacient()[dia][j] != null && this.getPacient()[dia][j].getNombre().equalsIgnoreCase(nombre)) {
            encontre = true;  // Si lo encontramos, marcamos como encontrado
        } else {
            j++;  // Seguimos buscando en la siguiente posición
        }
    }
    return encontre;  // Retorna true si lo encontró, false de lo contrario
}    

}
