package arraylist;

import java.util.ArrayList;

public class Ejercicio10Partidos {
    public static void ejecutar() {
        System.out.println("=== EJERCICIO 10 ===");

        ArrayList<Partido> partidos = crearPartidos();

        System.out.println("Partidos originales:");
        imprimirPartidos(partidos);

        System.out.println("\nPartidos donde el visitante fue ganador:");
        imprimirPartidos(visitanteGanador(partidos));

        System.out.println("\nPartidos ganados por Barcelona: " + contarVictoriasBarcelona(partidos));

        ArrayList<Partido> empates = eliminarNoEmpates(partidos);
        System.out.println("\nPartidos después de eliminar los que no fueron empate:");
        imprimirPartidos(empates);

        ArrayList<Partido> originales = crearPartidos();
        System.out.println("\nPartidos ganados por el equipo local: " + contarVictoriasLocal(originales));
    }

    private static ArrayList<Partido> crearPartidos() {
        ArrayList<Partido> partidos = new ArrayList<>();

        partidos.add(new Partido("Barcelona", "Real Madrid", 3, 1));
        partidos.add(new Partido("Atlético Nacional", "Millonarios", 1, 1));
        partidos.add(new Partido("Cali", "Barcelona", 0, 2));
        partidos.add(new Partido("Barcelona", "Junior", 2, 2));
        partidos.add(new Partido("Santa Fe", "Barcelona", 1, 3));
        partidos.add(new Partido("Nacional", "América", 2, 0));
        partidos.add(new Partido("Barcelona", "Cali", 1, 0));
        partidos.add(new Partido("Millonarios", "Santa Fe", 0, 1));

        return partidos;
    }

    private static ArrayList<Partido> visitanteGanador(ArrayList<Partido> partidos) {
        ArrayList<Partido> resultado = new ArrayList<>();
        for (Partido partido : partidos) {
            if (partido.getGolesVisitante() > partido.getGolesLocal()) {
                resultado.add(partido);
            }
        }
        return resultado;
    }

    private static int contarVictoriasBarcelona(ArrayList<Partido> partidos) {
        int contador = 0;
        for (Partido partido : partidos) {
            if (partido.getEquipoLocal().equalsIgnoreCase("Barcelona")
                    && partido.getGolesLocal() > partido.getGolesVisitante()) {
                contador++;
            } else if (partido.getEquipoVisitante().equalsIgnoreCase("Barcelona")
                    && partido.getGolesVisitante() > partido.getGolesLocal()) {
                contador++;
            }
        }
        return contador;
    }

    private static ArrayList<Partido> eliminarNoEmpates(ArrayList<Partido> partidos) {
        ArrayList<Partido> empates = new ArrayList<>(partidos);
        empates.removeIf(partido -> partido.getGolesLocal() != partido.getGolesVisitante());
        return empates;
    }

    private static int contarVictoriasLocal(ArrayList<Partido> partidos) {
        int contador = 0;
        for (Partido partido : partidos) {
            if (partido.getGolesLocal() > partido.getGolesVisitante()) {
                contador++;
            }
        }
        return contador;
    }

    private static void imprimirPartidos(ArrayList<Partido> partidos) {
        if (partidos.isEmpty()) {
            System.out.println("No hay partidos para mostrar.");
            return;
        }
        for (Partido partido : partidos) {
            System.out.println(partido);
        }
    }
}

class Partido {
    private final String equipoLocal;
    private final String equipoVisitante;
    private final int golesLocal;
    private final int golesVisitante;

    public Partido(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    @Override
    public String toString() {
        return equipoLocal + " " + golesLocal + " - " + golesVisitante + " " + equipoVisitante;
    }
}
