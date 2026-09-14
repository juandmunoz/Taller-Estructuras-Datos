package arreglos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03Factoriales {
    public static void ejecutar(Scanner scanner) {
        System.out.println("=== EJERCICIO 3 ===");
        int n = leerCantidad(scanner);
        int[] numeros = generarNumeros(n, 1, 10);
        long[] factoriales = calcularFactoriales(numeros);

        System.out.println("Números iniciales:");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Factoriales:");
        System.out.println(Arrays.toString(factoriales));
    }

    private static int leerCantidad(Scanner scanner) {
        while (true) {
            try {
                System.out.print("¿Cuántos números desea generar?: ");
                int n = Integer.parseInt(scanner.nextLine());
                if (n > 0) return n;
                System.out.println("La cantidad debe ser mayor que cero.");
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un entero válido.");
            }
        }
    }

    private static int[] generarNumeros(int cantidad, int minimo, int maximo) {
        Random random = new Random();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(maximo - minimo + 1) + minimo;
        }
        return numeros;
    }

    private static long[] calcularFactoriales(int[] numeros) {
        long[] factoriales = new long[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = factorial(numeros[i]);
        }
        return factoriales;
    }

    private static long factorial(int numero) {
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
