import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        boolean[] esPrimo = new boolean[100];

        // Llenar el array con números aleatorios
        Utilidades.llenarArrayConAleatorios(numeros);

        long startTime = System.nanoTime();

        // Calcular si los números son primos
        for (int i = 0; i < numeros.length; i++) {
            esPrimo[i] = Utilidades.esPrimo(numeros[i]);
        }

        long endTime = System.nanoTime();
        long tiempoEnNanosegundos = endTime - startTime;
        double tiempoEnMilisegundos = tiempoEnNanosegundos / 1e6;
        double tiempoEnSegundos = tiempoEnMilisegundos / 1000.0;

        System.out.println("Tiempo de cálculo: " + tiempoEnSegundos + " segundos");
        System.out.println("Tiempo de calcuilo: "+ tiempoEnMilisegundos + "milisegundos");
        System.out.println("Tiempo de calculo: "+ tiempoEnNanosegundos + "nanosegundos");

        // Mostrar los números y si son primos o no
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i] + ", ¿Es primo? " + esPrimo[i]);
        }
    }
}