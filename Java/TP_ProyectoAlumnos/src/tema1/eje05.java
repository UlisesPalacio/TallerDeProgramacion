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
public class eje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
     5- El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen 
        (con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad 
        de la comida (2) Precio (3) Ambiente.
        Escriba un programa que lea desde teclado las calificaciones de los cinco clientes 
        para cada uno de los aspectos y almacene la información en una estructura. Luego 
        imprima la calificación promedio obtenida por cada aspecto
     */
    int [][] tabla= new int[5][4];
    String[] servicios = new String[]{"Atencion", "Comida", "Precio", "Ambiente"};

    int i,j,k,puntaje;
    
      
        for(i=0;i<5;i++){
            System.out.println("Cliente numero: "+(i+1));
            System.out.println("  ------------------  ");
            for(j=0;j<4;j++){
                System.out.println("Calificacion de "+servicios[j]+": ");
                puntaje = Lector.leerInt();
                while((puntaje<1)||(puntaje>10)){
                    System.out.println("Ingrese un calificacion valida de "+servicios[j]+": ");
                    puntaje = Lector.leerInt();
                }
                tabla[i][j]= puntaje;
            }
        }

        double prom;
        System.out.println("Promedio de valoraciones: ");
        for(j=0;j<4;j++){
            prom = 0;
            for(i=0;i<5;i++){
                prom += tabla[i][j];
            }
            System.out.println("El promedio del servicio "+servicios[j]+" es "+prom/5);
        }
    
    }
    
}
