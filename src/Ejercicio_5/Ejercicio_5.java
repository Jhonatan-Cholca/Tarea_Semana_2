package Ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VentasFabrica fs = new VentasFabrica();

        System.out.print("Ingrese número de artículos (N): ");
        int n = sc.nextInt();
        System.out.print("Ingrese número de sucursales (M): ");
        int m = sc.nextInt();

        double[][] tablaPrecios = new double[n][m];
        int[][] tablaCantidades = new int[n][m];

        // Llenado de datos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Precio Articulo " + (i+1) + " en Sucursal " + (j+1) + ": ");
                tablaPrecios[i][j] = sc.nextDouble();
                System.out.print("Cantidad vendida: ");
                tablaCantidades[i][j] = sc.nextInt();
            }
        }

        // Cálculos
        double[] ventasArticulos = fs.calcularTotalPorArticulo(tablaPrecios, tablaCantidades);
        double[] ventasSucursales = fs.calcularTotalPorSucursal(tablaPrecios, tablaCantidades);

        // Resultados
        System.out.println("\n--- TOTAL DE VENTAS POR ARTÍCULO ---");
        for (int i = 0; i < ventasArticulos.length; i++) {
            System.out.println("Artículo " + (i+1) + ": $" + ventasArticulos[i]);
        }

        System.out.println("\n--- TOTAL DE VENTAS POR SUCURSAL ---");
        for (int j = 0; j < ventasSucursales.length; j++) {
            System.out.println("Sucursal " + (j+1) + ": $" + ventasSucursales[j]);
        }
    } 
}
