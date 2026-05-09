package Ejercicio_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Reprobados {
    
     public static int leerEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static ArrayList<String> llenarVector(String materia, int cantidad) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> vector = new ArrayList<>();
        System.out.println("Ingrese las " + cantidad + " cédulas de estudiantes que reprobaron " + materia + ":");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Cédula " + (i + 1) + ": ");
            vector.add(teclado.nextLine());
        }
        return vector;
    }

    public static ArrayList<String> interseccion(ArrayList<String> lista1, ArrayList<String> lista2) {
        ArrayList<String> resultado = new ArrayList<>();
        for (String cedula : lista1) {
            if (lista2.contains(cedula) && !resultado.contains(cedula)) {
                resultado.add(cedula);
            }
        }
        return resultado;
    }

    public static void imprimirVector(String titulo, ArrayList<String> vector) {
        System.out.println("\n" + titulo);
        if (vector.isEmpty()) {
            System.out.println("Ningún estudiante reprobó AMBAS materias");
        } else {
            for (String cedula : vector) {
                System.out.println(cedula);
            }
        }
    }
 
 
}
