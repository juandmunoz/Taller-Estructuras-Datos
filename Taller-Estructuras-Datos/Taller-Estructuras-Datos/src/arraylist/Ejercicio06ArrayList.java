package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio06ArrayList {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 6 ===");
        ArrayList<Integer> numeros = generarHastaDiez();

        System.out.println("Números leídos:");
        System.out.println(numeros);
        System.out.println("Suma: " + calcularSuma(numeros));
        System.out.printf("Media: %.2f%n", calcularMedia(numeros));
    }

    private static ArrayList<Integer> generarHastaDiez() {
        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;
        do {
            numero = random.nextInt(21) - 10;
            numeros.add(numero);
        } while (numero != 10);

        return numeros;
    }

    private static int calcularSuma(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) suma += numero;
        return suma;
    }

    private static double calcularMedia(ArrayList<Integer> numeros) {
        return (double) calcularSuma(numeros) / numeros.size();
    }
}
