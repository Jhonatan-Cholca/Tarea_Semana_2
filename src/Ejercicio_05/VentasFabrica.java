package Ejercicio_05;
public class VentasFabrica {
// Calcula el total de dinero recaudado por cada artículo en todas las sucursales
    public double[] calcularTotalPorArticulo(double[][] precios, int[][] cantidades) {
        int nArticulos = precios.length;
        int mSucursales = precios[0].length;
        double[] totales = new double[nArticulos];

        for (int i = 0; i < nArticulos; i++) {
            double sumaArticulo = 0;
            for (int j = 0; j < mSucursales; j++) {
                sumaArticulo += precios[i][j] * cantidades[i][j];
            }
            totales[i] = sumaArticulo;
        }
        return totales;
    }

    // Calcula el total de dinero recaudado por cada sucursal (todas sus ventas)
    public double[] calcularTotalPorSucursal(double[][] precios, int[][] cantidades) {
        int nArticulos = precios.length;
        int mSucursales = precios[0].length;
        double[] totales = new double[mSucursales];

        for (int j = 0; j < mSucursales; j++) {
            double sumaSucursal = 0;
            for (int i = 0; i < nArticulos; i++) {
                sumaSucursal += precios[i][j] * cantidades[i][j];
            }
            totales[j] = sumaSucursal;
        }
        return totales;
    }    
}
