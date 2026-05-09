package Ejercicio_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_10 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculosPedidos servicio = new CalculosPedidos();
        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        System.out.print("¿Cuántos pedidos desea registrar?: ");
        int n = sc.nextInt();

        // a. Registrar pedidos
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Pedido #" + (i + 1) + " ---");
            System.out.print("Nombre del cliente: ");
            String cliente = sc.next();
            System.out.print("Plato solicitado: ");
            String plato = sc.next();
            System.out.print("Cantidad: ");
            int cant = sc.nextInt();
            System.out.print("Precio unitario: ");
            double precio = sc.nextDouble();

            Pedido nuevoPedido = new Pedido(cliente, plato, cant, precio);
            
            // b y c. Calcular total y aplicar descuento automáticamente
            double totalCalculado = servicio.calcularTotalConDescuento(cant, precio);
            nuevoPedido.setTotalFinal(totalCalculado);

            listaPedidos.add(nuevoPedido);
        }

        // MOSTRAR RESULTADOS
        System.out.println("\n========= REPORTE DE VENTAS =========");
        for (Pedido p : listaPedidos) {
            System.out.println(p.toString());
        }

        // d. Ingreso total
        double ingreso = servicio.calcularIngresoTotal(listaPedidos);
        System.out.printf("\nIngreso total del restaurante: $%.2f\n", ingreso);

        // e. Pedido de mayor valor
        Pedido mayor = servicio.obtenerPedidoMayorValor(listaPedidos);
        if (mayor != null) {
            System.out.println("\n--- PEDIDO DE MAYOR VALOR ---");
            System.out.println("El cliente " + mayor.getCliente() + " pagó $" + mayor.getTotalFinal());
        }
    }    
}
