
package parcial3;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public abstract class Compra {

    private int nro;
    Producto []produc;
    private int cantProduc;//la cantidad que voy a tener al cargar productos
    private int cantMaxProduc;//limite de productos

    public Compra(int cantMax,int nro) {
        this.cantMaxProduc=cantMax;
        this.nro = nro;
        produc = new Producto[cantMaxProduc];
        this.cantProduc=0;//sin productos cargados
        for(int i=0;i<cantMaxProduc;i++){
          this.getProduc()[i]=null;
        }
    }
    
    
    public boolean hayEspacio(){
       return this.getCantProduc() < this.getCantMaxProduc();
    }
    
    public double precioAPagar(){
      double precioTotal=0;  
      for(int i=0;i<this.getCantProduc();i++){
        precioTotal+=produc[i].getPrecio();
      }
       precioTotal= precioTotal * 21.0;
       return precioTotal;
    }
    
    
    public void agregarProducto(Producto p) {
    if (hayEspacio()) {
        this.getProduc()[cantProduc++] = p; // se agrega el producto en la posición actual
        //cantProduc++; // se incrementa el contador
        System.out.println("Producto agregado. Total de productos ahora: " + cantProduc);
    } else {
        System.out.println("No hay espacio para más productos.");
    }
}

    

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Producto[] getProduc() {
        return produc;
    }

    public void setProduc(Producto[] produc) {
        this.produc = produc;
    }

    public int getCantProduc() {
        return cantProduc;
    }

    public void setCantProduc(int cantProduc) {
        this.cantProduc = cantProduc;
    }

    public int getCantMaxProduc() {
        return cantMaxProduc;
    }

    public void setCantMaxProduc(int cantMaxProduc) {
        this.cantMaxProduc = cantMaxProduc;
    }

    public String concatenador(){
      String aux="";
      for(int i=0;i<this.getCantProduc();i++){
         aux+= this.produc[i].toString();
      }
      return aux;  
    }
    
    @Override
    public  String toString(){
       String aux;
       aux = "Nro: "+ this.getNro() +" lista de productos: " +this.concatenador() + " precioTotal a Pagar " + this.precioAPagar() ;
       return aux;
    };
    
    
    
}
