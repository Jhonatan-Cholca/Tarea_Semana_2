package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
    
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // INSTANCIAMOS la clase de servicios para poder usar sus métodos
        Calculos servicio = new Calculos();
        
        // 1. Crear y mostrar vector original
        int[] v1 = servicio.generarVector(20);
        System.out.println("VECTOR ORIGINAL:");
        servicio.mostrarVector(v1);
        
        // Parte A: Búsqueda
        System.out.print("\nIngrese número a buscar: ");
        int n = teclado.nextInt();
        servicio.buscarPosicion(v1, n);
        
        // Parte B: Nuevo vector de impares
        int[] v2 = servicio.obtenerIndicesImpares(v1);
        System.out.println("\nVECTOR DE POSICIONES IMPARES:");
        servicio.mostrarVector(v2);
        
        // Parte C: Conteo
        int mayores = servicio.contarMayoresA20(v2);
        System.out.println("\nEn el segundo vector hay " + mayores + " números mayores a 20.");
    }
}