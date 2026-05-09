package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nomina servicio = new Nomina();

        System.out.print("¿Cuántos empleados desea ingresar? ");
        int n = sc.nextInt();

        // Llamamos a los módulos
        servicio.registrarEmpleados(n);
        
        // El ejercicio dice que al finalizar solicite un código
        servicio.buscarPorCodigo();
    }
}
