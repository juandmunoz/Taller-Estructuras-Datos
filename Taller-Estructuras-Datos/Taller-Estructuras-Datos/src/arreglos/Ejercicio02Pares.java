package arreglos;

public class Ejercicio02Pares {
    public static void ejecutar() {
        int[] pares = generarPares();

        System.out.println("=== EJERCICIO 2 ===");
        System.out.println("100 primeros números pares en una línea:");
        imprimirUnaLinea(pares);

        System.out.println("\n\n100 primeros números pares en 10 líneas:");
        imprimirDiezLineas(pares);
    }

    private static int[] generarPares() {
        int[] pares = new int[100];
        for (int i = 0; i < pares.length; i++) {
            pares[i] = i * 2;
        }
        return pares;
    }

    private static void imprimirUnaLinea(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
    }

    private static void imprimirDiezLineas(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (i % 10 == 0) {
                System.out.print("\nLínea " + ((i / 10) + 1) + ": ");
            }
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
