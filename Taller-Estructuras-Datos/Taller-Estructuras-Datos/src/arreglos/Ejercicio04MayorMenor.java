package arreglos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio04MayorMenor {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 4 ===");
        int[] numeros = generarArreglo(25, -50, 50);

        System.out.println("Arreglo:");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Número menor: " + encontrarMenor(numeros));
        System.out.println("Número mayor: " + encontrarMayor(numeros));
    }

    private static int[] generarArreglo(int cantidad, int minimo, int maximo) {
        Random random = new Random();
        int[] arreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            arreglo[i] = random.nextInt(maximo - minimo + 1) + minimo;
        }
        return arreglo;
    }

    private static int encontrarMenor(int[] arreglo) {
        int menor = arreglo[0];
        for (int numero : arreglo) {
            if (numero < menor) menor = numero;
        }
        return menor;
    }

    private static int encontrarMayor(int[] arreglo) {
        int mayor = arreglo[0];
        for (int numero : arreglo) {
            if (numero > mayor) mayor = numero;
        }
        return mayor;
    }
}
