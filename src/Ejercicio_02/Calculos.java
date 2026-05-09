package Ejercicio_02;

import java.util.Random;

public class Calculos {
    // Genera el vector de 20 elementos aleatorios
    public int[] generarVector(int tamano) {
        int[] v = new int[tamano];
        Random rnd = new Random();
        for (int i = 0; i < tamano; i++) {
            v[i] = rnd.nextInt(100) + 1; // Números del 1 al 100
        }
        return v;
    }

    // Parte A: Buscar posición
    public void buscarPosicion(int[] v, int numero) {
        boolean encontrado = false;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == numero) {
                System.out.println("-> Encontrado en el índice: " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("-> El número no existe en el vector.");
        }
    }

    // Parte B: Crear vector con índices impares (1, 3, 5...)
    public int[] obtenerIndicesImpares(int[] v) {
        int[] nuevoVector = new int[v.length / 2];
        int aux = 0;
        for (int i = 1; i < v.length; i += 2) {
            nuevoVector[aux] = v[i];
            aux++;
        }
        return nuevoVector;
    }

    // Parte C: Contar mayores a 20
    public int contarMayoresA20(int[] v) {
        int contador = 0;
        for (int elemento : v) {
            if (elemento > 20) {
                contador++;
            }
        }
        return contador;
    }

    // Método extra para imprimir cualquier vector
    public void mostrarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "] ");
        }
        System.out.println();
    }
}
