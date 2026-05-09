package Ejercicio_06;

import java.util.Scanner;

public class Ejercicio_06 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculosVentas cs = new CalculosVentas();

        System.out.print("Ingrese el número de vendedores (N): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número de años (M): ");
        int m = sc.nextInt();

        double[][] ventas = new double[n][m];

        // Llenado de la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Venta Vendedor " + (i + 1) + " - Año " + (j + 1) + ": ");
                ventas[i][j] = sc.nextDouble();
            }
        }

        // Ejecución de cálculos mediante el servicio
        double[] ventasVendedor = cs.calcularVentasPorVendedor(ventas);
        double[] ventasAnio = cs.calcularVentasPorAnio(ventas);
        double ventaTotalGlobal = cs.calcularVentaTotalEmpresa(ventas);

        // Mostrar resultados
        System.out.println("\n--- A. TOTAL POR VENDEDOR ---");
        for (int i = 0; i < ventasVendedor.length; i++) {
            System.out.println("Vendedor " + (i + 1) + ": $" + ventasVendedor[i]);
        }

        System.out.println("\n--- B. TOTAL POR AÑO ---");
        for (int j = 0; j < ventasAnio.length; j++) {
            System.out.println("Año " + (j + 1) + ": $" + ventasAnio[j]);
        }

        System.out.println("\n--- C. TOTAL GLOBAL DE LA EMPRESA ---");
        System.out.println("La empresa vendió un total de: $" + ventaTotalGlobal);
    }    
}
