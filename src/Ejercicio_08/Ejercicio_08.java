package Ejercicio_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_08 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperacionesEficiencia servicio = new OperacionesEficiencia();
        ArrayList<Operario> listaOperarios = new ArrayList<>();

        System.out.print("Ingrese la cantidad de operarios (N): ");
        int n = sc.nextInt();

        // Registro de datos
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Registro Operario #" + (i + 1) + " ---");
            System.out.print("Código: ");
            String cod = sc.next();
            System.out.print("Horas de ausencia: ");
            double horas = sc.nextDouble();
            System.out.print("Pupitres defectuosos: ");
            int def = sc.nextInt();
            System.out.print("Pupitres producidos: ");
            int prod = sc.nextInt();

            // Crear objeto y calcular su grado inmediatamente
            Operario op = new Operario(cod, horas, def, prod);
            int grado = servicio.calcularGrado(horas, def, prod);
            op.setGradoEficiencia(grado);

            // Guardar en la colección
            listaOperarios.add(op);
        }

        // Impresión de resultados
        System.out.println("\n========= INFORME DE EFICIENCIA =========");
        for (Operario op : listaOperarios) {
            servicio.mostrarInforme(op);
        }
    }    
}
