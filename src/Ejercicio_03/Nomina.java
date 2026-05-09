package Ejercicio_03;

import java.util.HashMap;
import java.util.Scanner;

public class Nomina{
    // La llave es el Código, el valor es el Nombre
    private HashMap<String, String> mapaEmpleados = new HashMap<>();
    private Scanner leer = new Scanner(System.in);

    public void registrarEmpleados(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmpleado #" + (i + 1));
            System.out.print("Ingrese código: ");
            String codigo = leer.next();
            System.out.print("Ingrese nombre: ");
            String nombre = leer.next();
            
            // Guardamos en la colección
            mapaEmpleados.put(codigo, nombre);
        }
    }

    public void buscarPorCodigo() {
        System.out.print("\nIngrese el código del empleado a consultar: ");
        String busqueda = leer.next();

        if (mapaEmpleados.containsKey(busqueda)) {
            System.out.println("Empleado encontrado: " + mapaEmpleados.get(busqueda));
        } else {
            System.out.println("Error: El código " + busqueda + " no existe.");
        }
    }
}

