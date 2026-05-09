package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operaciones ms = new Operaciones();

        System.out.print("Ingrese número de filas (M): ");
        int m = sc.nextInt();
        System.out.print("Ingrese número de columnas (N): ");
        int n = sc.nextInt();

        int[][] matA = ms.generarMatriz(m, n);
        int[][] matB = ms.generarMatriz(m, n);

        System.out.println("\nMatriz A generada:");
        ms.mostrarMatriz(matA);
        System.out.println("\nMatriz B generada:");
        ms.mostrarMatriz(matB);

        System.out.println("\n--- MENÚ DE OPERACIONES ---");
        System.out.println("1. Sumar (A+B)");
        System.out.println("2. Restar (A-B)");
        System.out.println("3. Multiplicar (A*B)");
        System.out.println("4. Trasponer A");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                ms.mostrarMatriz(ms.sumar(matA, matB));
                break;
            case 2:
                ms.mostrarMatriz(ms.restar(matA, matB));
                break;
            case 3:
                // Nota: Multiplicación requiere lógica de dimensiones extra, 
                // aquí se asume que son compatibles para el ejemplo
                ms.mostrarMatriz(ms.multiplicar(matA, matB));
                break;
            case 4:
                ms.mostrarMatriz(ms.trasponer(matA));
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }    
}
