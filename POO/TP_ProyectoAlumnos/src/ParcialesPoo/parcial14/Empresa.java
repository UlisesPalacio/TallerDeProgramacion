
package parcial14;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Empresa {
    
    private String nombreEmp;
    private int direccion;
    private Director dirEjecutivo;
    private Encargado []sucursales;
    private int maxSucursales;//dimf
    private int cantSucursales;//diml

    public Empresa(String nombreEmp, int direccion, Director dirEjecutivo,int maxSucursales) {
        this.nombreEmp = nombreEmp;
        this.direccion = direccion;
        this.dirEjecutivo = dirEjecutivo;
        this.maxSucursales=maxSucursales;
        this.sucursales = new Encargado[maxSucursales];
        this.cantSucursales=0;
        for(int i=0;i<this.getMaxSucursales();i++){
            this.getSucursales()[i]= null;
        }
    }
    
    
    public void agregarEncargado(Encargado e){
      if(this.getCantSucursales()<this.getMaxSucursales()){
         this.getSucursales()[this.cantSucursales++]=e;
      }
    }
    
    public String concatenador(){
      String aux="";
      for(int i=0;i<this.getCantSucursales();i++){
         aux+= this.getSucursales()[i].toStringEngargado() + "numero de sucursal " + i + " \n ";
      }
      return aux;
    }
    
    public String sinEncargos(){
      String aux="";
      for(int i=0;i<this.getMaxSucursales();i++){
         if(this.getSucursales()[i]==null){
            aux+="la sucursal " + i + " no tiene encargos" + " \n ";
         }
      }
      
      return aux;
    }

    @Override
    public String toString() {
        return "Empresa " + "nombreEmpresa " + this.getNombreEmp()+ " \n "+ this.getDirEjecutivo().toStringDirector() + "direccion " + this.getDireccion() + this.concatenador() + this.sinEncargos();
    }
    
    
 
    

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public Director getDirEjecutivo() {
        return dirEjecutivo;
    }

    public void setDirEjecutivo(Director dirEjecutivo) {
        this.dirEjecutivo = dirEjecutivo;
    }

    public Encargado[] getSucursales() {
        return sucursales;
    }

    public void setSucursales(Encargado[] sucursales) {
        this.sucursales = sucursales;
    }

    public int getMaxSucursales() {
        return maxSucursales;
    }

    public void setMaxSucursales(int maxSucursales) {
        this.maxSucursales = maxSucursales;
    }

    public int getCantSucursales() {
        return cantSucursales;
    }

    public void setCantSucursales(int cantSucursales) {
        this.cantSucursales = cantSucursales;
    }
    
    
      
            

}
