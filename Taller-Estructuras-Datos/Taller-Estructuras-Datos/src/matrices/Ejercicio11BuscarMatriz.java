package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11BuscarMatriz {
    public static void ejecutar(Scanner scanner) {
        System.out.println("=== EJERCICIO 11 ===");

        int filas = leerPositivo(scanner, "Número de filas: ");
        int columnas = leerPositivo(scanner, "Número de columnas: ");

        int[][] matriz = generarMatriz(filas, columnas, 1, 20);
        imprimirMatriz(matriz);

        int buscado = leerEntero(scanner, "Ingrese el número que desea buscar: ");
        buscarPrimeraOcurrencia(matriz, buscado);
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

    private static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }

    private static void buscarPrimeraOcurrencia(int[][] matriz, int buscado) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == buscado) {
                    System.out.println("Número encontrado en fila " + (i + 1)
                            + ", columna " + (j + 1) + ".");
                    return;
                }
            }
        }
        System.out.println("El número no se encuentra en la matriz.");
    }

    private static int leerPositivo(Scanner scanner, String mensaje) {
        int valor;
        do {
            valor = leerEntero(scanner, mensaje);
            if (valor <= 0) System.out.println("Debe ser mayor que cero.");
        } while (valor <= 0);
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
