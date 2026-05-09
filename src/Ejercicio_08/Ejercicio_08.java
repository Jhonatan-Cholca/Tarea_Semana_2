package Ejercicio_08;

import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de operarios (N): ");
        int n = sc.nextInt();

        // Arreglos paralelos para los datos de los operarios
        String[] codigos = new String[n];
        double[] horasAusencia = new double[n];
        int[] pupitresDefectuosos = new int[n];
        int[] pupitresProducidos = new int[n];
        int[] gradosEficiencia = new int[n];

        // Entrada de datos
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Datos del Operario #" + (i + 1) + " ---");
            System.out.print("Código: ");
            codigos[i] = sc.next();
            System.out.print("Horas de ausencia: ");
            horasAusencia[i] = sc.nextDouble();
            System.out.print("Pupitres defectuosos: ");
            pupitresDefectuosos[i] = sc.nextInt();
            System.out.print("Pupitres producidos: ");
            pupitresProducidos[i] = sc.nextInt();

            // Cálculo del grado usando el método estático
            gradosEficiencia[i] = OperacionesEficiencia.calcularGradoEficiencia(
                horasAusencia[i], 
                pupitresDefectuosos[i], 
                pupitresProducidos[i]
            );
        }

        // Impresión de resultados finales
        System.out.println("\n========== REPORTE DE EFICIENCIA ==========");
        for (int i = 0; i < n; i++) {
            OperacionesEficiencia.imprimirReporte(
                codigos[i], 
                horasAusencia[i], 
                pupitresDefectuosos[i], 
                pupitresProducidos[i], 
                gradosEficiencia[i]
            );
        }
    }
}