package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07InsertarEliminar {
    public static void ejecutar(Scanner scanner) {
        System.out.println("=== EJERCICIO 7 ===");
        ArrayList<Integer> numeros = generarPares();

        System.out.println("ArrayList inicial:");
        System.out.println(numeros);

        int nuevo = leerEntero(scanner, "Ingrese un número para insertar: ");
        insertarOrdenado(numeros, nuevo);

        System.out.println("ArrayList después de insertar:");
        System.out.println(numeros);

        int eliminar = leerEntero(scanner, "Ingrese el valor que desea borrar: ");
        if (numeros.remove(Integer.valueOf(eliminar))) {
            System.out.println("Valor eliminado correctamente.");
        } else {
            System.out.println("El valor no se encontró.");
        }

        System.out.println("ArrayList final:");
        System.out.println(numeros);
    }

    private static ArrayList<Integer> generarPares() {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            lista.add(i * 2);
        }
        return lista;
    }

    private static void insertarOrdenado(ArrayList<Integer> lista, int valor) {
        int posicion = 0;
        while (posicion < lista.size() && lista.get(posicion) < valor) {
            posicion++;
        }
        lista.add(posicion, valor);
    }

    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un entero válido.");
            }
        }
    }
}
