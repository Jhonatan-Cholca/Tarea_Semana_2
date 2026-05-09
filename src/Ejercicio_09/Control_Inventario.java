package Ejercicio_09;

import java.util.ArrayList;

public class Control_Inventario {
// b. Mostrar medicamentos con stock crítico
    public void mostrarStockBajo(ArrayList<Medicamentos> lista) {
        System.out.println("\n--- ALERTAS DE STOCK MÍNIMO ---\n");
        boolean alerta = false;
        for (Medicamentos m : lista) {
            if (m.getStockActual() < m.getStockMinimo()) {
                System.out.println("ALERTA: " + m.getNombre() + " (Actual: " + m.getStockActual() + ")");
                alerta = true;
            }
        }
        if (!alerta) System.out.println("Todo el inventario está en niveles óptimos.");
    }

    // c. Calcular valor económico total
    public double calcularValorInventario(ArrayList<Medicamentos> lista) {
        double total = 0;
        for (Medicamentos m : lista) {
            total += m.getStockActual() * m.getPrecioUnitario();
        }
        return total;
    }

    // d. Actualizar stock después de una venta
    public void realizarVenta(ArrayList<Medicamentos> lista, String nombre, int cantidad) {
        for (Medicamentos m : lista) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                if (m.getStockActual() >= cantidad) {
                    m.setStockActual(m.getStockActual() - cantidad);
                    System.out.println("Venta realizada. Nuevo stock de " + nombre + ": " + m.getStockActual());
                } else {
                    System.out.println("Error: Stock insuficiente para la venta.");
                }
                return;
            }
        }
        System.out.println("Error: Medicamento no encontrado.");
    }

    // e. Mostrar reporte general
    public void mostrarReporte(ArrayList<Medicamentos> lista) {
        System.out.println("\n--- REPORTE GENERAL DE INVENTARIO ---");
        for (Medicamentos m : lista) {
            System.out.println(m.toString());
        }
    }
}    
