package Ejercicio_05;

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de artículos (N): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número de sucursales (M): ");
        int m = sc.nextInt();

        double[][] tablaPrecios = new double[n][m];
        int[][] tablaVentas = new int[n][m];

        // Llenado de Precios
        System.out.println("\n--- Registro de Precios ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Precio Articulo " + (i+1) + " en Sucursal " + (j+1) + ": ");
                tablaPrecios[i][j] = sc.nextDouble();
            }
        }

        // Llenado de Cantidades Vendidas
        System.out.println("\n--- Registro de Cantidades Vendidas ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Cantidad Articulo " + (i+1) + " en Sucursal " + (j+1) + ": ");
                tablaVentas[i][j] = sc.nextInt();
            }
        }

        // Cálculos finales
        VentasFabrica.calcularVentasPorArticulo(tablaPrecios, tablaVentas);
        VentasFabrica.calcularVentasPorSucursal(tablaPrecios, tablaVentas);
    }
}
