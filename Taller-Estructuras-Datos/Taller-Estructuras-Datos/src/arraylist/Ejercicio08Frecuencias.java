package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio08Frecuencias {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 8 ===");
        ArrayList<Integer> numeros = generarLista(100, 1, 20);

        System.out.println("Lista generada:");
        System.out.println(numeros);

        int[] frecuencias = contarFrecuencias(numeros, 20);

        System.out.println("\nNúmero | Frecuencia");
        System.out.println("-------------------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%6d | %10d%n", i, frecuencias[i]);
        }

        int masRepetido = encontrarMasRepetido(frecuencias);
        System.out.println("\nNúmero que más se repite: " + masRepetido);
        System.out.println("Frecuencia: " + frecuencias[masRepetido]);
    }

    private static ArrayList<Integer> generarLista(int cantidad, int minimo, int maximo) {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            lista.add(random.nextInt(maximo - minimo + 1) + minimo);
        }
        return lista;
    }

    private static int[] contarFrecuencias(ArrayList<Integer> lista, int maximo) {
        int[] frecuencias = new int[maximo + 1];
        for (int numero : lista) {
            frecuencias[numero]++;
        }
        return frecuencias;
    }

    private static int encontrarMasRepetido(int[] frecuencias) {
        int numeroMayor = 1;
        for (int i = 2; i < frecuencias.length; i++) {
            if (frecuencias[i] > frecuencias[numeroMayor]) {
                numeroMayor = i;
            }
        }
        return numeroMayor;
    }
}
