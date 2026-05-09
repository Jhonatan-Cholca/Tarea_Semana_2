package Ejercicio_07;

public class CalculosNotas {
    
// Literal A: El promedio de las calificaciones por cada estudiante (Filas)
    public double[] calcularPromedioPorEstudiante(double[][] notas) {
        double[] promedios = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < 8; j++) {
                suma += notas[i][j];
            }
            promedios[i] = suma / 8;
        }
        return promedios;
    }

    // Literal B: El promedio de la calificación por cada materia (Columnas)
    public double[] calcularPromedioPorMateria(double[][] notas) {
        double[] promediosMat = new double[8];
        for (int j = 0; j < 8; j++) {
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            promediosMat[j] = suma / notas.length;
        }
        return promediosMat;
    }

    // Literal C: Encontrar el estudiante con el mayor promedio
    public int obtenerIndiceMejorEstudiante(double[] promedios) {
        int indiceMejor = 0;
        double maxPromedio = promedios[0];
        for (int i = 1; i < promedios.length; i++) {
            if (promedios[i] > maxPromedio) {
                maxPromedio = promedios[i];
                indiceMejor = i;
            }
        }
        return indiceMejor;
    }

    // Literal D: Número de estudiantes aprobados (>= 7) por cada materia
    public int[] calcularAprobadosPorMateria(double[][] notas) {
        int[] aprobados = new int[8];
        for (int j = 0; j < 8; j++) {
            int contador = 0;
            for (int i = 0; i < notas.length; i++) {
                if (notas[i][j] >= 7.0 && notas[i][j] <= 10.0) {
                    contador++;
                }
            }
            aprobados[j] = contador;
        }
        return aprobados;
    }

    // Literal E: Número de estudiantes reprobados (< 7) por cada materia
    public int[] calcularReprobadosPorMateria(double[][] notas) {
        int[] reprobados = new int[8];
        for (int j = 0; j < 8; j++) {
            int contador = 0;
            for (int i = 0; i < notas.length; i++) {
                if (notas[i][j] < 7.0) {
                    contador++;
                }
            }
            reprobados[j] = contador;
        }
        return reprobados;
    }
}
