package Ejercicio_07;

import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de estudiantes: ");
        int n = sc.nextInt();

        String[] codigos = new String[n];
        double[][] matrizNotas = new double[n][8];

        // Llenado de datos
        for (int i = 0; i < n; i++) {
            System.out.print("\nCódigo del estudiante #" + (i + 1) + ": ");
            codigos[i] = sc.next();
            for (int j = 0; j < 8; j++) {
                System.out.print("  Nota materia " + (j + 1) + ": ");
                matrizNotas[i][j] = sc.nextDouble();
            }
        }

        // Llamamos a cada método por separado siguiendo los literales
        CalculosNotas.calcularPromedioPorEstudiante(codigos, matrizNotas);
        CalculosNotas.calcularPromedioPorMateria(matrizNotas);
        CalculosNotas.mostrarEstudianteMayorPromedio(codigos, matrizNotas);
        CalculosNotas.contarAprobadosPorMateria(matrizNotas);
        CalculosNotas.contarReprobadosPorMateria(matrizNotas);
    }
}