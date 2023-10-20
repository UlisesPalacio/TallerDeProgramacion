/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;

/**
 *
 * @author Usuario
 */
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    /**
      Se dispone de la clase Persona (en la carpeta tema2). Un objeto persona puede crearse 
    sin valores iniciales o enviando en el mensaje de creación el nombre, DNI y edad (en ese 
    orden). Un objeto persona responde a los siguientes mensajes: 
    * 
    getNombre() retorna el nombre (String) de la persona
    getDNI() retorna el dni (int) de la persona
    getEdad() retorna la edad (int) de la persona
    setNombre(X) modifica el nombre de la persona al “String” pasado por parámetro (X)
    setDNI(X) modifica el DNI de la persona al “int” pasado por parámetro (X)
    setEdad(X) modifica la edad de la persona al “int” pasado por parámetro (X)
    toString() retorna un String que representa al objeto. Ej: “Mi nombre es Mauro, 
    mi DNI es 11203737 y tengo 70 años” 
    * 
    Realice un programa que cree un objeto persona con datos leídos desde teclado. Luego 
    muestre en consola la representación de ese objeto en formato String. 
     */
    
    String nombre;
    int dni,edad;
    System.out.println("ingrese el nombre de la persona");
    nombre = Lector.leerString();
    
    System.out.println("ingrese el dni de la persona");
    dni = Lector.leerInt();
    
    System.out.println("ingrese la edad de la persona");
    edad = Lector.leerInt();
    
    Persona pers = new Persona(nombre,dni,edad);
    
    System.out.println(pers.toString());
    
    Persona per2 = new Persona();
        
        System.out.println("Ingrese nombre de la persona");
        per2.setNombre(Lector.leerString());
        
        System.out.println("Ingrese dni de la persona");
        per2.setDNI(Lector.leerInt());
        
        System.out.println("Ingrese edad de la persona");
        per2.setEdad(Lector.leerInt());
        
        System.out.println(per2.toString());
        
     
    
    
    
    
    
    
    
    
    
        
        
        
    }
    
}
