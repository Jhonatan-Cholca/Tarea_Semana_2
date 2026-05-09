package Ejercicio_09;

import java.util.Scanner;

public class Ejercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Registro inicial de N medicamentos
        System.out.print("¿Cuántos medicamentos desea registrar?: ");
        int n = sc.nextInt();

        String[] nombres = new String[n];
        int[] stockActual = new int[n];
        int[] stockMinimo = new int[n];
        double[] precios = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nDatos del medicamento #" + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = sc.next();
            System.out.print("Stock actual: ");
            stockActual[i] = sc.nextInt();
            System.out.print("Stock mínimo: ");
            stockMinimo[i] = sc.nextInt();
            System.out.print("Precio unitario: ");
            precios[i] = sc.nextDouble();
        }

        int opcion;
        do {
            System.out.println("\n--- MENÚ DE CONTROL DE INVENTARIO ---");
            System.out.println("1. Ver alertas de stock bajo");
            System.out.println("2. Ver valor total del inventario");
            System.out.println("3. Registrar una venta");
            System.out.println("4. Mostrar reporte general");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Control_Inventario.mostrarAlertas(nombres, stockActual, stockMinimo);
                    break;
                case 2:
                    double total = Control_Inventario.calcularValorTotal(stockActual, precios);
                    System.out.println("\nEl valor total de la mercadería es: $" + total);
                    break;
                case 3:
                    System.out.print("\nNombre del producto vendido: ");
                    String buscar = sc.next();
                    System.out.print("Cantidad vendida: ");
                    int cant = sc.nextInt();
                    Control_Inventario.procesarVenta(nombres, stockActual, buscar, cant);
                    break;
                case 4:
                    Control_Inventario.mostrarReporte(nombres, stockActual, stockMinimo, precios);
                    break;
            }
        } while (opcion != 0);
    }
}