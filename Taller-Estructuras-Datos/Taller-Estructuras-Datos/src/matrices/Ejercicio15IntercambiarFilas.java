package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15IntercambiarFilas {
    public static void ejecutar(Scanner scanner) {
        System.out.println("=== EJERCICIO 15 ===");

        int filas = leerMinimo(scanner, "Número de filas (mínimo 2): ", 2);
        int columnas = leerMinimo(scanner, "Número de columnas: ", 1);

        int[][] matriz = generarMatriz(filas, columnas, 1, 50);

        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        intercambiarPrimerasFilas(matriz);

        System.out.println("\nMatriz después de intercambiar la primera fila con la segunda:");
        imprimirMatriz(matriz);
    }

    private static int[][] generarMatriz(int filas, int columnas, int minimo, int maximo) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(maximo - minimo + 1) + minimo;
            }
        }
        return matriz;
    }

    private static void intercambiarPrimerasFilas(int[][] matriz) {
        int[] temporal = matriz[0];
        matriz[0] = matriz[1];
        matriz[1] = temporal;
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }

    private static int leerMinimo(Scanner scanner, String mensaje, int minimo) {
        int valor;
        do {
            valor = leerEntero(scanner, mensaje);
            if (valor < minimo) {
                System.out.println("El valor debe ser mínimo " + minimo + ".");
            }
        } while (valor < minimo);
        return valor;
    }

    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un entero válido.");
            }
        }
    }
}
