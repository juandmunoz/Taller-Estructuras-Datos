package matrices;

import java.util.Random;

public class Ejercicio13Simetrica {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 13 ===");

        int n = 5;
        int[][] matriz = generarMatriz(n, 1, 20);

        imprimirMatriz(matriz);

        System.out.println("\n¿La matriz es simétrica? " + (esSimetrica(matriz) ? "Sí" : "No"));

        System.out.println("\nNúmeros de las esquinas:");
        System.out.println("Superior izquierda: " + matriz[0][0]);
        System.out.println("Superior derecha: " + matriz[0][n - 1]);
        System.out.println("Inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Inferior derecha: " + matriz[n - 1][n - 1]);
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

    private static boolean esSimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
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
}
