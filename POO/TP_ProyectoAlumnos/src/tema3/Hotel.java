
package tema3;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Hotel  {
    private int dimf;
    private Habitacion [] habitaciones;

    
    public Hotel(int cantidad){
      this.dimf = cantidad;
      this.habitaciones = new Habitacion[dimf]; //Java me inicializo nro habitaciones en null
      
      for(int i=0;i<dimf;i++){
         this.habitaciones[i]= new Habitacion();//Cada habitación se inicializa desocupada y con costo          aleatorio   
      }   
    }
    
    public void ingresarCliente(Cliente cli,int numHabitacion){
     
        if(numHabitacion >=1 && numHabitacion<dimf){
          Habitacion hab = habitaciones[numHabitacion-1];//ajustamos indice ya que el vec arranca en 0
          if(!hab.isOcupada()){//verifico si la habitacion esta desocupada
            hab.setOcupada(true);//marca la habitacion ocupadad
            hab.setCliente(cli);//asocia el cliente a la habitacion
            System.out.println("cliente ingresado a la habitacion numero : " + numHabitacion);
          }else{
            System.out.println("la habitacion "+ numHabitacion + " esta ocupada");
          }
          
        }else{
          System.out.println("numero de habitacion invalido");
        }   
        
    }
    
    public void aumentoHabitacion(double monto){
      for(int i=0;i<dimf;i++){
        double nuevoCosto= habitaciones[i].getCosto() + monto;
        habitaciones[i].setCosto(nuevoCosto);
      } 
    }
    
   public String toString(){
       String aux="";
      for(int i=0;i<dimf;i++){
         aux +="habitacion numero " +  ( i + 1)  +  this.habitaciones[i].toString();
      }
     return aux;
   }
    
    
    
}


