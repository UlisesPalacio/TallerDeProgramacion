/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import PaqueteLectura.Lector;

/**
 *
 * @author Usuario
 */
public class eje04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            /* 4- Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
        (1..4). 
        
        Realice un programa que permita informar la cantidad de personas que 
        concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al 
        edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de 
        oficina a la cual quiere concurrir. 
        
        * La llegada de personas finaliza al indicar un nro. 
        de piso 9. Al finalizar la llegada de personas, informe lo pedido.
     */
        
      int [][]  tabla = new int[8][4];
      int i,j,numP,numO;
      numP=0;
      numO=0;
      for(i = 0;i<8;i++){
            for(j = 0;j<4;j++){
                tabla[i][j] = 0;
            }
        }
        
      
      while(numP != 9){
      System.out.println("ingrese un num de piso");
      numP = Lector.leerInt();
      if(numP != 9){
        System.out.println("ingrese el numero de oficina");
        numO = Lector.leerInt();
        tabla[numP][numO-1]=tabla[numP-1][numO-1] ++;// se resta 1 a las pos de la matriz ya que arrancan en 0
        System.out.println("ingrese un num de piso");
        numP = Lector.leerInt();
      }
      }
       for(i = 0;i<8;i++){
            System.out.println("Piso numero: "+(i+1));//piso 1 o mayor ya que arrancan en 0
            for(j = 0;j<4;j++){
                if(tabla[i][j]!=0){
                    System.out.println("Oficina numero: "+(j+1)); //numero de oficina +1 por que arranca en 0
                    System.out.println("("+i+" , "+j+")" +"Cantidad de ocupantes: "+ tabla[i][j]);
                }
            }
       }          
        

    }
    
}
