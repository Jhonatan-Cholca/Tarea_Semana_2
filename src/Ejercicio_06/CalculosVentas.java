package Ejercicio_06;

public class CalculosVentas {
// a. Total de ventas de cada vendedor (Suma de cada fila)
    public double[] calcularVentasPorVendedor(double[][] matriz) {
        int nVendedores = matriz.length;
        int mAnios = matriz[0].length;
        double[] totales = new double[nVendedores];

        for (int i = 0; i < nVendedores; i++) {
            double suma = 0;
            for (int j = 0; j < mAnios; j++) {
                suma += matriz[i][j];
            }
            totales[i] = suma;
        }
        return totales;
    }

    // b. Total de ventas en cada año (Suma de cada columna)
    public double[] calcularVentasPorAnio(double[][] matriz) {
        int nVendedores = matriz.length;
        int mAnios = matriz[0].length;
        double[] totales = new double[mAnios];

        for (int j = 0; j < mAnios; j++) {
            double suma = 0;
            for (int i = 0; i < nVendedores; i++) {
                suma += matriz[i][j];
            }
            totales[j] = suma;
        }
        return totales;
    }

    // c. Total de ventas de la empresa (Suma de toda la matriz)
    public double calcularVentaTotalEmpresa(double[][] matriz) {
        double totalGlobal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                totalGlobal += matriz[i][j];
            }
        }
        return totalGlobal;
    }    
}
