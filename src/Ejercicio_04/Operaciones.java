package Ejercicio_04;

import java.util.Random;

public class Operaciones{

    // Método para llenar una matriz con números aleatorios (1 al 10)
    public static void llenarMatriz(int[][] matriz) {
        Random rnd = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(10) + 1;
            }
        }
    }

    // Sumar matrices: A[i][j] + B[i][j]
    public static int[][] sumar(int[][] a, int[][] b) {
        int filas = a.length;
        int cols = a[0].length;
        int[][] resultado = new int[filas][cols];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }

    // Restar matrices: A[i][j] - B[i][j]
    public static int[][] restar(int[][] a, int[][] b) {
        int filas = a.length;
        int cols = a[0].length;
        int[][] resultado = new int[filas][cols];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                resultado[i][j] = a[i][j] - b[i][j];
            }
        }
        return resultado;
    }
    
    public static int[][] multiplicar(int[][] a, int[][] b) {
    int filasA = a.length;
    int colsA = a[0].length;
    int colsB = b[0].length;
    
    // La matriz resultante tendrá las filas de A y las columnas de B
    int[][] resultado = new int[filasA][colsB];

    for (int i = 0; i < filasA; i++) {
        for (int j = 0; j < colsB; j++) {
            // Tercer ciclo para realizar la suma de los productos
            for (int k = 0; k < colsA; k++) {
                resultado[i][j] += a[i][k] * b[k][j];
            }
        }
    }
    return resultado;
}
    // Trasponer matriz: Cambiar filas por columnas
    public static int[][] trasponer(int[][] a) {
        int filas = a.length;
        int cols = a[0].length;
        int[][] resultado = new int[cols][filas]; // Dimensiones invertidas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                resultado[j][i] = a[i][j];
            }
        }
        return resultado;
    }

    // Imprimir matriz con formato
    public static void imprimir(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}