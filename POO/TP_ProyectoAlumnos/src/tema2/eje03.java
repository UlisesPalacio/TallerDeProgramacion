package tema2;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;        

public class eje03 {

    public static void main(String[] args) {
        // Matriz de personas y vector para contar personas por día
        Persona [][] matriz = new Persona[5][8];
        int [] vector = new int[5];
        GeneradorAleatorio.iniciar();
        String nom;
        int dia = 0;
        int edad, dni;
        int cantPersonas = 0;

        // Inicializamos el vector a 0
        for(int i = 0; i < 5; i++) {
            vector[i] = 0;
        }

        // Ingreso de personas hasta que se cumpla el límite
        System.out.println("Ingrese el nombre de la persona del casting");
        nom = GeneradorAleatorio.generarString(3);

        while(!nom.equals("ZZZ") && cantPersonas < 40 && dia < 5) {
            edad = GeneradorAleatorio.generarInt(100);  // Genera la edad
            dni = GeneradorAleatorio.generarInt(8000);  // Genera el DNI
            
            matriz[dia][vector[dia]] = new Persona(nom, dni, edad);  // Registra la persona
            vector[dia]++;  // Incrementa el contador del día actual
            cantPersonas++;  // Incrementa el total de personas

            if(vector[dia] == 8) {  // Si se completó el día, pasa al siguiente
                dia++;
            }
            
            System.out.println("Ingrese el nombre de la siguiente persona del casting");
            nom = Lector.leerString();
        }

        // Imprimir los resultados
        for(int i = 0; i < 5; i++) {
            System.out.println("Día " + (i+1) + ":");
            for(int j = 0; j < vector[i]; j++) {
                System.out.println("Persona " + (j+1) + ": " + matriz[i][j].getNombre() + " (DNI: " + matriz[i][j].getDNI() + ", Edad: " + matriz[i][j].getEdad() + ")");
            }
        }
    }
}
