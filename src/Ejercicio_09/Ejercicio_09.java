package Ejercicio_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_09 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Control_Inventario servicio = new Control_Inventario();
        ArrayList<Medicamentos> inventario = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE FARMACIA ---");
            System.out.println("1. Registrar Medicamento");
            System.out.println("2. Reporte Stock Bajo");
            System.out.println("3. Valor Total Inventario");
            System.out.println("4. Realizar Venta");
            System.out.println("5. Reporte General");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // a. Registrar
                    System.out.print("Nombre: ");
                    String nombre = sc.next();
                    System.out.print("Stock Actual: ");
                    int actual = sc.nextInt();
                    System.out.print("Stock Mínimo: ");
                    int min = sc.nextInt();
                    System.out.print("Precio Unitario: ");
                    double precio = sc.nextDouble();
                    inventario.add(new Medicamentos(nombre, actual, min, precio));
                    break;
                case 2: // b.
                    servicio.mostrarStockBajo(inventario);
                    break;
                case 3: // c.
                    System.out.println("Valor total del inventario: $" + servicio.calcularValorInventario(inventario));
                    break;
                case 4: // d.
                    System.out.print("Nombre del medicamento vendido: ");
                    String medVenta = sc.next();
                    System.out.print("Cantidad: ");
                    int cantVenta = sc.nextInt();
                    servicio.realizarVenta(inventario, medVenta, cantVenta);
                    break;
                case 5: // e.
                    servicio.mostrarReporte(inventario);
                    break;
            }
        } while (opcion != 0);
    }    
}
