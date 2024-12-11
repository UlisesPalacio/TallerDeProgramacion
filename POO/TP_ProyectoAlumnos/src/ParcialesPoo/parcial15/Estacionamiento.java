
package parcial15;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Estacionamiento {
    
    private String direccion;
    private double costo;
    private int cantVehiculos;
    private int cantSectores;
    private Vehiculos [][] matriz;

    public Estacionamiento(String direccion, double costo, int cantVehiculos, int cantSectores) {
        this.direccion = direccion;
        this.costo = costo;
        this.cantVehiculos = cantVehiculos;
        this.cantSectores = cantSectores;
        this.matriz = new Vehiculos [cantSectores][cantVehiculos];
        for(int i=0;i<this.getCantSectores();i++){
           for(int j=0;j<this.getCantVehiculos();j++){
             this.matriz[i][j]=null;
           }
        }
    }
    
    
    public boolean esPosible(int X,int Y){
        boolean aux=false;
       if(X<this.getCantSectores() && Y < this.getCantVehiculos()){
          if(this.matriz[X][Y]==null){
              aux=true;
          }
       }
       return aux;
    }
    
    public void agregarVehiculo(int X,int Y, Vehiculos v){
       if(esPosible(X,Y)){
           this.getMatriz()[X-1][Y-1]=v;
       }
    }
    
    
    public String liberarLugar(int X,String M){
        String aux="";
        for(int j=0;j<this.getCantVehiculos();j++){
           if( this.getMatriz()[X-1][j]!= null  &&  this.getMatriz()[X-1][j].getMarca().equals(M)){
              aux+="Patente" + this.getMatriz()[X-1][j].getPatente()+ "Marca"+ this.getMatriz()[X-1][j].getMarca() + "modelo" + this.getMatriz()[X-1][j].getModelo() + "horas"+ this.getMatriz()[X-1][j].getCantHorasEstacionamiento();
              this.getMatriz()[X-1][j]=null;
           }
        }
        return aux;
    }
    
    public int masVehiculos(){
        double aux=0.0;
        int posMax=0;
        double max=-1;
        for(int i=0;i<this.getCantSectores();i++){
            aux=0;
           for(int j=0;j<this.getCantVehiculos();j++){
              if(this.getMatriz()[i][j]!=null){
                  aux+= this.getMatriz()[i][j].getCantHorasEstacionamiento() * this.getCosto();
              } 
           }
           if(aux > max){
              max=aux;
              posMax=i+1;
           }
        }
        return posMax;
    }
    
    public String desocupado(int i,int j){
        String aux="";
       if(this.getMatriz()[i][j]==null){
         aux="desocupado";
       }else{
          aux=this.getMatriz()[i][j].toString();
       }
       return aux;
    }
    
    
    public String concatenador(){
       String aux="";
       for(int i=0;i<this.getCantSectores();i++){
           aux+=" Sector " + (i+1) + "\n" ;
           for(int j=0;j<this.getCantVehiculos();j++){       
             if(this.getMatriz()[i][j]!=null){
                aux+=  " lugar " + (j+1)  + this.desocupado(i, j) + "\n";

             }  
           }
        }
       return aux;
    }

    @Override
    public String toString() {
        return " Estacionamiento " + " direccion" + this.getDireccion() + " costo " + this.getCosto()+ "\n" + this.concatenador();
    }

    
    
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantVehiculos() {
        return cantVehiculos;
    }

    public void setCantVehiculos(int cantVehiculos) {
        this.cantVehiculos = cantVehiculos;
    }

    public int getCantSectores() {
        return cantSectores;
    }

    public void setCantSectores(int cantSectores) {
        this.cantSectores = cantSectores;
    }

    public Vehiculos[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Vehiculos[][] matriz) {
        this.matriz = matriz;
    }
    
    

}
