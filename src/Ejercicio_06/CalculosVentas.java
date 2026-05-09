package Ejercicio_06;

public class CalculosVentas {

    // a. Total de ventas por cada vendedor (Suma de cada fila)
    public static void ventasPorVendedor(double[][] matriz) {
        System.out.println("\n--- TOTAL VENTAS POR VENDEDOR ---");
        for (int i = 0; i < matriz.length; i++) {
            double sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.printf("Vendedor #%d: $%.2f\n", (i + 1), sumaFila);
        }
    }

    // b. Total de ventas por cada año (Suma de cada columna)
    public static void ventasPorAnio(double[][] matriz) {
        System.out.println("\n--- TOTAL VENTAS POR AÑO ---");
        int numVendedores = matriz.length;
        int numAnios = matriz[0].length;

        for (int j = 0; j < numAnios; j++) {
            double sumaColumna = 0;
            for (int i = 0; i < numVendedores; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.printf("Año #%d: $%.2f\n", (j + 1), sumaColumna);
        }
    }

    // c. Total de ventas de la empresa (Suma de todos los elementos)
    public static double calcularTotalGeneral(double[][] matriz) {
        double total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total += matriz[i][j];
            }
        }
        return total;
    }
}