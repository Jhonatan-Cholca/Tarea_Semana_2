package Ejercicio_07;

import java.util.Scanner;

public class Ejercicio_07 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculosNotas service = new CalculosNotas();

        System.out.print("Ingrese la cantidad de estudiantes (N): ");
        int n = sc.nextInt();

        // La matriz tiene N estudiantes (filas) y 8 materias (columnas)
        double[][] matrizNotas = new double[n][8];

        // Llenado de la matriz
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Registro Estudiante #" + (i + 1) + " ---");
            for (int j = 0; j < 8; j++) {
                System.out.print("Ingrese nota materia " + (j + 1) + ": ");
                matrizNotas[i][j] = sc.nextDouble();
            }
        }

        // --- CÁLCULOS Y REPORTES ---
        System.out.println("\n========================================");
        System.out.println("          REPORTE ACADÉMICO             ");
        System.out.println("========================================");

        // a. Promedios por Estudiante
        double[] promediosEst = service.calcularPromedioPorEstudiante(matrizNotas);
        System.out.println("\na) Promedio por Estudiante:");
        for (int i = 0; i < promediosEst.length; i++) {
            System.out.printf("   Estudiante %d: %.2f\n", (i + 1), promediosEst[i]);
        }

        // b. Promedios por Materia
        double[] promediosMat = service.calcularPromedioPorMateria(matrizNotas);
        System.out.println("\nb) Promedio por Materia:");
        for (int j = 0; j < promediosMat.length; j++) {
            System.out.printf("   Materia %d: %.2f\n", (j + 1), promediosMat[j]);
        }

        // c. Estudiante con mayor promedio
        int mejorIndice = service.obtenerIndiceMejorEstudiante(promediosEst);
        System.out.println("\nc) Estudiante con mayor promedio:");
        System.out.printf("Estudiante: %d | Promedio: %.2f\n", (mejorIndice + 1), promediosEst[mejorIndice]);

        // d. Aprobados por materia
        int[] aprobados = service.calcularAprobadosPorMateria(matrizNotas);
        System.out.println("\nd) Estudiantes Aprobados por Materia:");
        for (int j = 0; j < 8; j++) {
            System.out.println("   Materia " + (j + 1) + ": " + aprobados[j]);
        }

        // e. Reprobados por materia
        int[] reprobados = service.calcularReprobadosPorMateria(matrizNotas);
        System.out.println("\ne) Estudiantes Reprobados por Materia:");
        for (int j = 0; j < 8; j++) {
            System.out.println("   Materia " + (j + 1) + ": " + reprobados[j]);
        }
        
        System.out.println("\n========================================");
    }   
}
