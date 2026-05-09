package Ejercicio_07;

public class CalculosNotas {

    // Literal A: El promedio de las calificaciones por cada estudiante
    public static void calcularPromedioPorEstudiante(String[] codigos, double[][] notas) {
        System.out.println("\n--- [LITERAL A] PROMEDIO POR ESTUDIANTE ---");
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < 8; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / 8;
            System.out.println("Estudiante: " + codigos[i] + " | Promedio: " + promedio);
        }
    }

    // Literal B: El promedio de la calificación por cada materia
    public static void calcularPromedioPorMateria(double[][] notas) {
        System.out.println("\n--- [LITERAL B] PROMEDIO POR MATERIA ---");
        for (int j = 0; j < 8; j++) {
            double sumaMateria = 0;
            for (int i = 0; i < notas.length; i++) {
                sumaMateria += notas[i][j];
            }
            System.out.println("Materia #" + (j + 1) + ": " + (sumaMateria / notas.length));
        }
    }

    // Literal C: El estudiante con mayor promedio
    public static void mostrarEstudianteMayorPromedio(String[] codigos, double[][] notas) {
        double mayorPromedio = -1;
        String mejorEstudiante = "";

        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < 8; j++) {
                suma += notas[i][j];
            }
            double promedioActual = suma / 8;
            if (promedioActual > mayorPromedio) {
                mayorPromedio = promedioActual;
                mejorEstudiante = codigos[i];
            }
        }
        System.out.println("\n--- [LITERAL C] MEJOR ESTUDIANTE ---");
        System.out.println("El código con mayor promedio es: " + mejorEstudiante + " con " + mayorPromedio);
    }

    // Literal D: Estudiantes aprobados por materia (>= 7)
    public static void contarAprobadosPorMateria(double[][] notas) {
        System.out.println("\n--- [LITERAL D] APROBADOS POR MATERIA ---");
        for (int j = 0; j < 8; j++) {
            int aprobados = 0;
            for (int i = 0; i < notas.length; i++) {
                if (notas[i][j] >= 7 && notas[i][j] <= 10) {
                    aprobados++;
                }
            }
            System.out.println("Materia #" + (j + 1) + ": " + aprobados + " aprobados.");
        }
    }

    // Literal E: Estudiantes reprobados por materia (< 7)
    public static void contarReprobadosPorMateria(double[][] notas) {
        System.out.println("\n--- [LITERAL E] REPROBADOS POR MATERIA ---");
        for (int j = 0; j < 8; j++) {
            int reprobados = 0;
            for (int i = 0; i < notas.length; i++) {
                if (notas[i][j] < 7) {
                    reprobados++;
                }
            }
            System.out.println("Materia #" + (j + 1) + ": " + reprobados + " reprobados.");
        }
    }
}