package Ejercicio_09;

public class Control_Inventario {

    // b. Mostrar medicamentos cuyo stock esté por debajo del mínimo
    public static void mostrarAlertas(String[] nombres, int[] actual, int[] minimo) {
        System.out.println("\n--- ALERTAS DE REABASTECIMIENTO ---");
        boolean alerta = false;
        for (int i = 0; i < nombres.length; i++) {
            if (actual[i] < minimo[i]) {
                System.out.println("-> " + nombres[i] + ": Stock actual (" + actual[i] + ") menor al mínimo (" + minimo[i] + ")");
                alerta = true;
            }
        }
        if (!alerta) System.out.println("Todo el inventario está en niveles normales.");
    }

    // c. Calcular el valor económico total del inventario
    public static double calcularValorTotal(int[] actual, double[] precios) {
        double acumulador = 0;
        for (int i = 0; i < actual.length; i++) {
            acumulador += actual[i] * precios[i];
        }
        return acumulador;
    }

    // d. Actualizar el stock después de una venta
    public static void procesarVenta(String[] nombres, int[] actual, String buscar, int cantidad) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                if (actual[i] >= cantidad) {
                    actual[i] -= cantidad;
                    System.out.println("Venta exitosa. Stock actualizado.");
                } else {
                    System.out.println("Error: No hay suficiente stock (Disponible: " + actual[i] + ")");
                }
                return; // Sale del método tras encontrar el producto
            }
        }
        System.out.println("Error: El medicamento '" + buscar + "' no existe.");
    }

    // e. Mostrar un reporte general del inventario
    public static void mostrarReporte(String[] n, int[] s, int[] m, double[] p) {
        System.out.println("\n================ INVENTARIO COMPLETO ================");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Nombre", "Actual", "Mínimo", "Precio");
        for (int i = 0; i < n.length; i++) {
            System.out.printf("%-15s %-10d %-10d $%-10.2f\n", n[i], s[i], m[i], p[i]);
        }
    }
}