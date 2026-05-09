package Ejercicio_02;

public class Calculos {

    // a. Buscar la posición de un número (Retorna -1 si no existe)
    public static int buscarPosicion(int[] vector, int numero) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                return i; // Retorna el índice donde lo encontró
            }
        }
        return -1; // Valor centinela si no lo encuentra
    }

    // b. Crear vector con índices impares (Posiciones 1, 3, 5, etc.)
    public static int[] obtenerIndicesImpares(int[] original) {
        // Un vector de 20 elementos tiene 10 posiciones impares
        int[] resultante = new int[10];
        int j = 0;
        for (int i = 1; i < original.length; i += 2) {
            resultante[j] = original[i];
            j++;
        }
        return resultante;
    }

    // c. Contar elementos mayores a 20 en el segundo vector
    public static int contarMayoresA20(int[] vector) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 20) {
                contador++;
            }
        }
        return contador;
    }

    // Método auxiliar para imprimir vectores
    public static void imprimirVector(String mensaje, int[] vector) {
        System.out.print(mensaje + ": [ ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
