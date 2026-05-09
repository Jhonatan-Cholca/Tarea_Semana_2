package Ejercicio_01;
import java.util.ArrayList;
import java.util.Scanner;

public class Reprobados {
     public static int leerEntero(String mensaje) {
        // Creamos un objeto Scanner para leer desde el teclado (System.in)
        Scanner teclado = new Scanner(System.in);
        System.out.print(mensaje);
        // Leemos y devolvemos el número entero ingresado
        return teclado.nextInt();
    }
    public static ArrayList<String> llenarVector(String materia, int cantidad) {
        Scanner teclado = new Scanner(System.in);
        // Creamos el ArrayList vacío que almacenará las cédulas (como Strings)
        ArrayList<String> vector = new ArrayList<>();
        // Mensaje informativo con la materia y la cantidad
        System.out.println("Ingrese las " + cantidad + " cédulas de estudiantes que reprobaron " + materia + ":");
        // Bucle for: se repite tantas veces como 'cantidad' indique
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Cédula " + (i + 1) + ": ");
            vector.add(teclado.nextLine());
        }
        return vector;
    }
    public static ArrayList<String> interseccion(ArrayList<String> lista1, ArrayList<String> lista2) {
        // ArrayList que guardará el resultado (estudiantes en ambas listas)
        ArrayList<String> resultado = new ArrayList<>();
        for (String cedula : lista1) {
            if (lista2.contains(cedula) && !resultado.contains(cedula)) {
                resultado.add(cedula);
            }
        }
        // Devolvemos la lista de estudiantes que reprobaron ambas materias
        return resultado;
    }
    public static void imprimirVector(String titulo, ArrayList<String> vector) {
        System.out.println("\n" + titulo);
        // Verificamos si el ArrayList no tiene elementos
        if (vector.isEmpty()) {
            System.out.println("Ningún estudiante reprobó AMBAS materias");
        } else {
            // Recorremos el ArrayList y mostramos cada cédula
            for (String cedula : vector) {
                System.out.println(cedula);
            }
        }
    }
}
