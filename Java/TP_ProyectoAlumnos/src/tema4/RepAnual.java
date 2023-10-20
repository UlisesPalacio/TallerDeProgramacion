/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Usuario
 */
public class RepAnual extends Sistema {
    
     public RepAnual(int anioInicial, int cantAnios, Estacion estacion) {
        super(estacion,anioInicial, cantAnios);
    }
    
    public String retornarMedia() {
        String aux = "";
        double total;
        for(int i=0;i<this.getCantAnios();i++){
            total = 0;
            for(int j=0;j<12;j++){
                total += obtenerTemp(j, i);
            }
            aux += "Anio "+(i+this.getAnioInicial())+": "+Math.round((total/12)*100)/100.0+"°C \n";
        }
        return aux;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


//////////////////////

