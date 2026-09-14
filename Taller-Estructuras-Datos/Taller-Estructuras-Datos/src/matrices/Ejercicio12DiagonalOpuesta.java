package matrices;

import java.util.Random;

public class Ejercicio12DiagonalOpuesta {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 12 ===");

        int n = 5;
        int[][] matriz = generarMatriz(n, -50, 50);

        imprimirMatriz(matriz);

        int suma = calcularDiagonalOpuesta(matriz);
        System.out.println("Sumatoria de la diagonal opuesta: " + suma);
    }

    private static int[][] generarMatriz(int n, int minimo, int maximo) {
        Random random = new Random();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(maximo - minimo + 1) + minimo;
            }
        }
        return matriz;
    }

    private static int calcularDiagonalOpuesta(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }

    private static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%5d", valor);
            }
            System.out.println();
        }
    }
}
