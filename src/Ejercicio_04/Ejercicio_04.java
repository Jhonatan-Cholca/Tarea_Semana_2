package Ejercicio_04;
import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de filas (M): ");
        int m = sc.nextInt();
        System.out.print("Ingrese número de columnas (N): ");
        int n = sc.nextInt();

        int[][] matrizA = new int[m][n];
        int[][] matrizB = new int[m][n];

        Operaciones.llenarMatriz(matrizA);
        Operaciones.llenarMatriz(matrizB);

        System.out.println("\n--- Matriz A ---");
        Operaciones.imprimir(matrizA);
        System.out.println("\n--- Matriz B ---");
        Operaciones.imprimir(matrizB);

        System.out.println("\nSeleccione operación: 1.Sumar 2.Restar 3.Multiplicar 4.Trasponer");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                int[][] suma = Operaciones.sumar(matrizA, matrizB);
                System.out.println("\nResultado Suma:");
                Operaciones.imprimir(suma);
                break;
            case 2:
                int[][] resta = Operaciones.restar(matrizA, matrizB);
                System.out.println("\nResultado Resta:");
                Operaciones.imprimir(resta);
                break;

            case 3:
                int[][] multiplicacion = Operaciones.multiplicar(matrizA, matrizB);
                System.out.println("\nResultado Multiplicación (A * B):");
                Operaciones.imprimir(multiplicacion);
                break;
            case 4:
                int[][] traspuesta = Operaciones.trasponer(matrizA);
                System.out.println("\nResultado Traspuesta de A:");
                Operaciones.imprimir(traspuesta);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
