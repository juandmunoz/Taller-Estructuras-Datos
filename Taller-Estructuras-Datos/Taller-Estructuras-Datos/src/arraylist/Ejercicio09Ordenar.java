package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio09Ordenar {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 9 ===");

        ArrayList<Integer> original = generarLista(20, 1, 100);
        ArrayList<Integer> ascendente = new ArrayList<>(original);
        ArrayList<Integer> descendente = new ArrayList<>(original);

        Collections.sort(ascendente);
        Collections.sort(descendente, Collections.reverseOrder());

        ArrayList<Integer> pares = separarPares(original);
        ArrayList<Integer> impares = separarImpares(original);

        System.out.println("Lista original:");
        System.out.println(original);
        System.out.println("\nDe menor a mayor:");
        System.out.println(ascendente);
        System.out.println("\nDe mayor a menor:");
        System.out.println(descendente);
        System.out.println("\nNúmeros pares:");
        System.out.println(pares);
        System.out.println("\nNúmeros impares:");
        System.out.println(impares);
    }

    private static ArrayList<Integer> generarLista(int cantidad, int minimo, int maximo) {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            lista.add(random.nextInt(maximo - minimo + 1) + minimo);
        }
        return lista;
    }

    private static ArrayList<Integer> separarPares(ArrayList<Integer> lista) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int numero : lista) {
            if (numero % 2 == 0) pares.add(numero);
        }
        return pares;
    }

    private static ArrayList<Integer> separarImpares(ArrayList<Integer> lista) {
        ArrayList<Integer> impares = new ArrayList<>();
        for (int numero : lista) {
            if (numero % 2 != 0) impares.add(numero);
        }
        return impares;
    }
}
