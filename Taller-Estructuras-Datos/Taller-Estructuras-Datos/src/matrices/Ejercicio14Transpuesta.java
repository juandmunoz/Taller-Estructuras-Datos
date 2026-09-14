package matrices;

public class Ejercicio14Transpuesta {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 14 ===");

        // Valores predeterminados
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] transpuesta = obtenerTranspuesta(matriz);

        System.out.println("Matriz inicial:");
        imprimirMatriz(matriz);

        System.out.println("\nMatriz transpuesta:");
        imprimirMatriz(transpuesta);
    }

    private static int[][] obtenerTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }
}
