package Ejercicio_06;

import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de vendedores (N): ");
        int n = sc.nextInt();
        System.out.print("Ingrese número de años (M): ");
        int m = sc.nextInt();

        double[][] matrizVentas = new double[n][m];

        // Llenado de la matriz
        System.out.println("\n--- Ingreso de Ventas ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Vendedor " + (i + 1) + " - Año " + (j + 1) + ": ");
                matrizVentas[i][j] = sc.nextDouble();
            }
        }

        // Llamada a los reportes
        CalculosVentas.ventasPorVendedor(matrizVentas);
        CalculosVentas.ventasPorAnio(matrizVentas);
        
        double granTotal = CalculosVentas.calcularTotalGeneral(matrizVentas);
        System.out.printf("\nTotal general de ventas de la empresa: $%.2f\n", granTotal);
    }
}
