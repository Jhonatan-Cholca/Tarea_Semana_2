package Ejercicio_10;

import java.util.ArrayList;

public class CalculosPedidos {
// b y c. Calcular total aplicando descuento si supera los 50 USD
    public double calcularTotalConDescuento(int cantidad, double precio) {
        double subtotal = cantidad * precio;
        if (subtotal > 50.0) {
            return subtotal * 0.90; // Descuento del 10%
        }
        return subtotal;
    }

    // d. Calcular el ingreso total de todos los pedidos
    public double calcularIngresoTotal(ArrayList<Pedido> lista) {
        double ingresoTotal = 0;
        for (Pedido p : lista) {
            ingresoTotal += p.getTotalFinal();
        }
        return ingresoTotal;
    }

    // e. Buscar el pedido de mayor valor
    public Pedido obtenerPedidoMayorValor(ArrayList<Pedido> lista) {
        if (lista.isEmpty()) return null;
        
        Pedido mayor = lista.get(0);
        for (Pedido p : lista) {
            if (p.getTotalFinal() > mayor.getTotalFinal()) {
                mayor = p;
            }
        }
        return mayor;
    }    
}
