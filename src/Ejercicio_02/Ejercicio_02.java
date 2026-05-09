package Ejercicio_02;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        
        int[] vectorOriginal = new int[20];

        // Llenado aleatorio del vector original (Valores entre 1 y 50)
        for (int i = 0; i < 20; i++) {
            vectorOriginal[i] = rnd.nextInt(50) + 1;
        }

        Calculos.imprimirVector("Vector Original", vectorOriginal);

        // a. Búsqueda por teclado
        System.out.print("\nIngrese un número a buscar: ");
        int numBuscar = sc.nextInt();
        int pos = Calculos.buscarPosicion(vectorOriginal, numBuscar);
        
        if (pos != -1) {
            System.out.println("El número se encuentra en la posición (índice): " + (pos+1));
        } else {
            System.out.println("Número no encontrado en el vector.");
        }

        // b. Crear e imprimir vector de posiciones impares
        int[] vectorImpares = Calculos.obtenerIndicesImpares(vectorOriginal);
        Calculos.imprimirVector("\nVector Resultante (Índices Impares)", vectorImpares);

        // c. Contar mayores a 20
        int cantidad = Calculos.contarMayoresA20(vectorImpares);
        System.out.println("\nCantidad de elementos mayores a 20 en el segundo vector: " + cantidad);
    }
}