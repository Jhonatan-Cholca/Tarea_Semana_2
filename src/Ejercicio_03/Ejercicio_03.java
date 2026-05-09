package Ejercicio_03;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados (N): ");
        int n = sc.nextInt();

        // Creamos dos arreglos paralelos del mismo tamaño N
        String[] codigos = new String[n];
        String[] nombres = new String[n];

        // Llenado de los arreglos (Literal A)
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Registro de Empleado #" + (i + 1) + " ---");
            System.out.print("Código: ");
            codigos[i] = sc.next(); // Usamos next() para evitar errores de búfer
            
            System.out.print("Nombre: ");
            nombres[i] = sc.next();
        }

        // Búsqueda del empleado
        System.out.print("\nIngrese el código del empleado que desea buscar: ");
        String busqueda = sc.next();

        // Llamamos al método de la clase Servicios (Lógica)
        String resultado = Empleado.buscarEmpleado(codigos, nombres, busqueda);

        // Impresión del resultado
        System.out.println("\nResultado de la búsqueda: " + resultado);
    }
}
