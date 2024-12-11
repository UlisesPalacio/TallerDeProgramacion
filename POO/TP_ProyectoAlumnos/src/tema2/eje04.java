package tema2;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;        

public class eje04 {

    public static void main(String[] args) {
        // Matriz de personas y vector para contar personas por día
        Persona [][] matriz = new Persona[5][8];
        int [] vector = new int[5];
        GeneradorAleatorio.iniciar();
        String nom;
        int dia;
        int edad, dni;
        int cantPersonas = 0;

        // Inicializamos el vector a 0
        for(int i = 0; i < 5; i++) {
            vector[i] = 0;
        }

        // Ingreso de personas hasta que se cumpla el límite
        nom = GeneradorAleatorio.generarString(3); // Nombre inicial
        
        while(!nom.equals("ZZZ") && cantPersonas < 40) { // Finaliza con "ZZZ" o al completar los cupos
            System.out.println("Ingrese el día de la entrevista (0 a 4):");
            dia = Lector.leerInt(); // Lectura del día
            
            if(dia >= 0 && dia < 5) { // Validación de que el día sea válido
                if(vector[dia] < 8) { // Si hay lugar en ese día
                    // Generación de datos aleatorios para la persona
                    edad = GeneradorAleatorio.generarInt(100);
                    dni = GeneradorAleatorio.generarInt(8000);
                    // Registro de la persona en la matriz
                    matriz[dia][vector[dia]] = new Persona(nom, dni, edad);  
                    vector[dia]++; // Aumento el contador de personas en el día
                    cantPersonas++; // Aumento el total de personas
                } else {
                    System.out.println("No hay lugar en el día " + (dia+1) + ".");
                }
            } else {
                System.out.println("Error: ingresar valores de día entre 0 y 4.");
            }
            
            // Pedir el siguiente nombre para continuar el ciclo
            nom = GeneradorAleatorio.generarString(3);
        }

        // Imprimir los resultados
        for(int i = 0; i < 5; i++) {
            System.out.println("---------------");
            System.out.println("Día " + (i+1) + ": " + "Cantidad de personas: " + vector[i]);
            for(int j = 0; j < vector[i]; j++) {
                System.out.println("Persona " + (j+1) + " - Nombre: " + matriz[i][j].getNombre() + 
                                   " (DNI: " + matriz[i][j].getDNI() + ", Edad: " + matriz[i][j].getEdad() + ")");
            }
        }
    }
}
