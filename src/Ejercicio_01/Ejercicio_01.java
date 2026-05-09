package Ejercicio_01;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes para Matemática: ");
        int n1 = sc.nextInt();
        String[] reprobadosMate = new String[n1];
        
        for (int i = 0; i < n1; i++) {
            System.out.print("Cédula reprobado Matemática #" + (i + 1) + ": ");
            reprobadosMate[i] = sc.next();
        }

        System.out.print("\nIngrese la cantidad de estudiantes para Inglés: ");
        int n2 = sc.nextInt();
        String[] reprobadosIngles = new String[n2];
        
        for (int i = 0; i < n2; i++) {
            System.out.print("Cédula reprobado Inglés #" + (i + 1) + ": ");
            reprobadosIngles[i] = sc.next();
        }

        // Llamamos al método estático para formar el tercer vector
        String[] reprobadosAmbas = Reprobados.obtenerReprobadosAmbas(reprobadosMate, reprobadosIngles);

        // Impresión de resultados
        System.out.println("\n========== REPORTE FINAL ==========");
        Reprobados.imprimirVector("REPROBADOS MATEMÁTICA", reprobadosMate);
        Reprobados.imprimirVector("REPROBADOS INGLÉS", reprobadosIngles);
        Reprobados.imprimirVector("REPROBADOS EN AMBAS MATERIAS", reprobadosAmbas);
    }
}