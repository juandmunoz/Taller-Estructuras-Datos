import arreglos.*;
import arraylist.*;
import matrices.*;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");
            System.out.println();

            switch (opcion) {
                case 1 -> Ejercicio01Primos.ejecutar();
                case 2 -> Ejercicio02Pares.ejecutar();
                case 3 -> Ejercicio03Factoriales.ejecutar(scanner);
                case 4 -> Ejercicio04MayorMenor.ejecutar();
                case 5 -> Ejercicio05InvertirNumeros.ejecutar();
                case 6 -> Ejercicio06ArrayList.ejecutar();
                case 7 -> Ejercicio07InsertarEliminar.ejecutar(scanner);
                case 8 -> Ejercicio08Frecuencias.ejecutar();
                case 9 -> Ejercicio09Ordenar.ejecutar();
                case 10 -> Ejercicio10Partidos.ejecutar();
                case 11 -> Ejercicio11BuscarMatriz.ejecutar(scanner);
                case 12 -> Ejercicio12DiagonalOpuesta.ejecutar();
                case 13 -> Ejercicio13Simetrica.ejecutar();
                case 14 -> Ejercicio14Transpuesta.ejecutar();
                case 15 -> Ejercicio15IntercambiarFilas.ejecutar(scanner);
                case 0 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opción no válida.");
            }

            if (opcion != 0) {
                System.out.println("\nPresione ENTER para continuar...");
                scanner.nextLine();
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n========================================");
        System.out.println("     TALLER ESTRUCTURAS LINEALES");
        System.out.println("========================================");
        System.out.println("1.  Primeros 10 números primos");
        System.out.println("2.  Primeros 100 números pares");
        System.out.println("3.  Factoriales");
        System.out.println("4.  Mayor y menor");
        System.out.println("5.  Invertir números");
        System.out.println("6.  ArrayList hasta encontrar 10");
        System.out.println("7.  Insertar y eliminar en ArrayList");
        System.out.println("8.  Frecuencia de números");
        System.out.println("9.  Ordenar pares e impares");
        System.out.println("10. Partidos de fútbol");
        System.out.println("11. Buscar número en matriz");
        System.out.println("12. Diagonal opuesta");
        System.out.println("13. Matriz simétrica");
        System.out.println("14. Matriz transpuesta");
        System.out.println("15. Intercambiar primera y segunda fila");
        System.out.println("0.  Salir");
        System.out.println("========================================");
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número entero válido.");
            }
        }
    }
}
