package Ejercicio_04;

import java.util.Random;

public class Operaciones {


    // Genera una matriz de M x N con números aleatorios
    public int[][] generarMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random rnd = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rnd.nextInt(10) + 1; // Números del 1 al 10
            }
        }
        return matriz;
    }

    public int[][] sumar(int[][] a, int[][] b) {
        int f = a.length;
        int c = a[0].length;
        int[][] resultado = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }

    public int[][] restar(int[][] a, int[][] b) {
        int f = a.length;
        int c = a[0].length;
        int[][] resultado = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                resultado[i][j] = a[i][j] - b[i][j];
            }
        }
        return resultado;
    }

    public int[][] trasponer(int[][] a) {
        int f = a.length;
        int c = a[0].length;
        int[][] resultado = new int[c][f]; // Dimensiones invertidas
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                resultado[j][i] = a[i][j];
            }
        }
        return resultado;
    }

    public int[][] multiplicar(int[][] a, int[][] b) {
        // Para multiplicar, columnas de A debe ser igual a filas de B
        int fA = a.length;
        int cA = a[0].length;
        int cB = b[0].length;
        int[][] resultado = new int[fA][cB];
        
        for (int i = 0; i < fA; i++) {
            for (int j = 0; j < cB; j++) {
                for (int k = 0; k < cA; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return resultado;
    }

    public void mostrarMatriz(int[][] m) {
        for (int[] fila : m) {
            for (int valor : fila) {
                System.out.print("[" + valor + "]\t");
            }
            System.out.println();
        }
    }
}
