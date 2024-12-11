
package Parciales.parcialempresa2024;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Empresa {
    private String nombre;
    private ProgramadorLider programadorLider;
    private Programadores [] programador;
    private int cantProgramadores;
    private int dimf;

    public Empresa(String nombre, ProgramadorLider programadorLider,int dimf) {
        this.nombre = nombre;
        this.programadorLider = programadorLider;
        this.programador = new Programadores[dimf];
        this.cantProgramadores=0;
        this.dimf=dimf;
    }
    
    
    public void agregarProgramador(Programadores prog){
      if(cantProgramadores < this.getDimf()){
        programador[cantProgramadores]=prog;
         cantProgramadores++;
      }else{
         System.out.println("no se pueden agregar mas programadores");
      }
    }
    
    public int getDimf(){
       return this.dimf;
    }
    
    public void setDimf(int dimf){
      this.dimf = dimf;
    
    }
    
    public double calcularMontoSueldos(){
       double montoTotal=this.programadorLider.sueldoFinal();//incluir el sueldo del lider
       for(int i=0;i<this.getCantProgramadores();i++){
         montoTotal+= this.programador[i].sueldoFinal();// Incluir sueldos de los programadores
       }
       return montoTotal;  
    }
    
    public void aumentarSueldo(double M){
       programadorLider.setSueldoBasico(programadorLider.getSueldoBasico() + M);
       for(int i=0;i<this.getCantProgramadores();i++){
           this.programador[i].setSueldoBasico(this.programador[i].getSueldoBasico() + M);
       } 
       
    };
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ProgramadorLider getProgramadorLider() {
        return programadorLider;
    }

    public void setProgramadorLider(ProgramadorLider programadorLider) {
        this.programadorLider = programadorLider;
    }

    public Programadores[] getProgramador() {
        return programador;
    }

    public void setProgramador(Programadores[] programador) {
        this.programador = programador;
    }

    public int getCantProgramadores() {
        return cantProgramadores;
    }

    public void setCantProgramadores(int cantProgramadores) {
        this.cantProgramadores = cantProgramadores;
    }

    @Override
    public String toString() {
        String resultado = "Empresa:"+ this.getNombre()+ "\n";
        resultado += "Programador Lider " + this.programadorLider.toString() + "\n";
        for(int i=0;i<this.getCantProgramadores();i++){
           resultado += "programador : " + this.programador[i].toString() + "\n";
        }
        return resultado;
    }
    

    
    
    

}
