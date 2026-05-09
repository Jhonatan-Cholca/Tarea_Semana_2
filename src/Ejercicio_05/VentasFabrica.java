package Ejercicio_05;

public class VentasFabrica {

    // 1. Calcula el total de ventas por cada ARTÍCULO (Suma de filas)
    // Se multiplica (Precio en Sucursal M * Cantidad en Sucursal M)
    public static void calcularVentasPorArticulo(double[][] precios, int[][] ventas) {
        System.out.println("\n--- TOTAL DE VENTAS POR ARTÍCULO ---");
        for (int i = 0; i < precios.length; i++) { // Recorre artículos
            double totalArticulo = 0;
            for (int j = 0; j < precios[i].length; j++) { // Recorre sucursales
                totalArticulo += precios[i][j] * ventas[i][j];
            }
            System.out.printf("Artículo #%d: $%.2f\n", (i + 1), totalArticulo);
        }
    }

    // 2. Calcula el total de ventas por cada SUCURSAL (Suma de columnas)
    public static void calcularVentasPorSucursal(double[][] precios, int[][] ventas) {
        System.out.println("\n--- TOTAL DE VENTAS POR SUCURSAL ---");
        int numArticulos = precios.length;
        int numSucursales = precios[0].length;

        for (int j = 0; j < numSucursales; j++) { // Recorre sucursales (columnas)
            double totalSucursal = 0;
            for (int i = 0; i < numArticulos; i++) { // Recorre artículos (filas)
                totalSucursal += precios[i][j] * ventas[i][j];
            }
            System.out.printf("Sucursal #%d: $%.2f\n", (j + 1), totalSucursal);
        }
    }
}