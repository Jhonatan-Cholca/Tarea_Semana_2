package Ejercicio_01;

import java.util.ArrayList;

public class Ejercicio_01 {
    public static void main(String[] args) {
        // Leer tamaños independientes para cada materia
        int nMate = Reprobados.leerEntero("Ingrese la cantidad de estudiantes que reprobaron MATEMÁTICA: ");
        int nIngles = Reprobados.leerEntero("Ingrese la cantidad de estudiantes que reprobaron INGLÉS: ");
        
        // Llenar cada vector con su propio tamaño
        ArrayList<String> reprobadosMate = Reprobados.llenarVector("MATEMÁTICA", nMate);
        ArrayList<String> reprobadosIngles = Reprobados.llenarVector("INGLÉS", nIngles);        
        
        // Intersección (estudiantes en ambos)
        ArrayList<String> reprobadosAmbas = Reprobados.interseccion(reprobadosMate, reprobadosIngles);
        
        // Imprimir resultados
        Reprobados.imprimirVector("=== Reprobaron MATEMÁTICA testset===", reprobadosMate);
        Reprobados.imprimirVector("=== Reprobaron INGLÉS ===", reprobadosIngles);
        Reprobados.imprimirVector("=== Reprobaron AMBAS materias ===", reprobadosAmbas);
    }
}