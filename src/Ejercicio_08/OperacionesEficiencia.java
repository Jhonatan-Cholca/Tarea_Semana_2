package Ejercicio_08;

public class OperacionesEficiencia {

    // Método para calcular el grado de eficiencia basado en las 3 condiciones
    public static int calcularGradoEficiencia(double horas, int defectuosos, int producidos) {
        // Evaluamos las condiciones individualmente
        boolean cond1 = (horas <= 3);
        boolean cond2 = (defectuosos < 300);
        boolean cond3 = (producidos > 10000);

        // h. Si cumple las tres condiciones
        if (cond1 && cond2 && cond3) return 20;
        
        // g. Si cumple la segunda y la tercera
        if (cond2 && cond3) return 15;
        
        // f. Si cumple la primera y la tercera
        if (cond1 && cond3) return 13;
        
        // e. Si cumple la primera y la segunda
        if (cond1 && cond2) return 12;
        
        // d. Si cumple solo la tercera
        if (cond3) return 9;
        
        // c. Si cumple solo la segunda
        if (cond2) return 8;
        
        // b. Si cumple solo la primera
        if (cond1) return 7;
        
        // a. Si no cumple ninguna
        return 5;
    }

    // Método para imprimir el reporte de un operario
    public static void imprimirReporte(String cod, double h, int d, int p, int grado) {
        System.out.println("Cód: " + cod + " | Horas Ausente: " + h + 
                           " | Defectuosos: " + d + " | Producidos: " + p + 
                           " | GRADO: " + grado);
    }
}