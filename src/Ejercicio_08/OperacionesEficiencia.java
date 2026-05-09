package Ejercicio_08;
public class OperacionesEficiencia {
    
public int calcularGrado(double horas, int defectuosos, int producidos) {

    // Evaluamos las 3 condiciones básicas
        boolean c1 = horas <= 3;
        boolean c2 = defectuosos < 300;
        boolean c3 = producidos > 10000;

        // Lógica de Grados
        if (c1 && c2 && c3) return 20;
        if (c2 && c3) return 15;
        if (c1 && c3) return 13;
        if (c1 && c2) return 12;
        if (c3) return 9;
        if (c2) return 8;
        if (c1) return 7;
        
        return 5; // Si no cumple ninguna
    }

    public void mostrarInforme(Operario op) {
        System.out.println("----------------------------------------");
        System.out.println("Código: " + op.getCodigo());
        System.out.println("Horas Ausencia: " + op.getHorasAusencia());
        System.out.println("Defectuosos: " + op.getDefectuosos());
        System.out.println("Producidos: " + op.getProducidos());
        System.out.println("GRADO DE EFICIENCIA: " + op.getGradoEficiencia());
    }    
}
