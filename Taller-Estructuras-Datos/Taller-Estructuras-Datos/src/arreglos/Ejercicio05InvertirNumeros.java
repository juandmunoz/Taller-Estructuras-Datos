package arreglos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05InvertirNumeros {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 5 ===");
        int[] originales = generarArreglo(20, 0, 999);
        int[] invertidos = invertirArreglo(originales);

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(originales));
        System.out.println("Arreglo con números invertidos:");
        System.out.println(Arrays.toString(invertidos));
    }

    private static int[] generarArreglo(int cantidad, int minimo, int maximo) {
        Random random = new Random();
        int[] arreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            arreglo[i] = random.nextInt(maximo - minimo + 1) + minimo;
        }
        return arreglo;
    }

    private static int[] invertirArreglo(int[] arreglo) {
        int[] invertidos = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertidos[i] = invertirNumero(arreglo[i]);
        }
        return invertidos;
    }

    private static int invertirNumero(int numero) {
        if (numero == 0) return 0;
        int invertido = 0;
        int valor = numero;

        while (valor > 0) {
            invertido = invertido * 10 + valor % 10;
            valor /= 10;
        }
        return invertido;
    }
}
