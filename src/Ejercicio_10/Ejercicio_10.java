package Ejercicio_10;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Registro de pedidos
        System.out.print("¿Cuántos pedidos desea registrar?: ");
        int n = sc.nextInt();

        String[] nombresClientes = new String[n];
        String[] platosSolicitados = new String[n];
        int[] cantidades = new int[n];
        double[] preciosUnitarios = new double[n];
        double[] totalesFinales = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nRegistro del Pedido #" + (i + 1));
            System.out.print("Nombre del cliente: ");
            nombresClientes[i] = sc.next();
            System.out.print("Plato solicitado: ");
            platosSolicitados[i] = sc.next();
            System.out.print("Cantidad: ");
            cantidades[i] = sc.nextInt();
            System.out.print("Precio Unitario: ");
            preciosUnitarios[i] = sc.nextDouble();

            // Calculamos el total de una vez para guardarlo en su arreglo
            totalesFinales[i] = CalculosPedido.calcularTotalConDescuento(
                cantidades[i], 
                preciosUnitarios[i]
            );
        }

        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE RESTAURANTE ---");
            System.out.println("1. Mostrar todos los pedidos (con descuentos)");
            System.out.println("2. Ver ingreso total del restaurante");
            System.out.println("3. Ver pedido de mayor valor");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- LISTADO DE PEDIDOS ---");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Cliente: " + nombresClientes[i] + 
                                           " | Plato: " + platosSolicitados[i] + 
                                           " | Total: $" + totalesFinales[i]);
                    }
                    break;
                case 2:
                    double ingreso = CalculosPedido.calcularIngresoTotal(totalesFinales);
                    System.out.println("\nEl ingreso total del día es: $" + ingreso);
                    break;
                case 3:
                    CalculosPedido.mostrarPedidoMayor(nombresClientes, platosSolicitados, totalesFinales);
                    break;
            }
        } while (opcion != 0);
    }
}