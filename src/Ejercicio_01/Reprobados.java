package Ejercicio_01;

public class Reprobados {

    // Método para encontrar estudiantes que reprobaron ambas materias
    public static String[] obtenerReprobadosAmbas(String[] mate, String[] ingles) {
        // Creamos un arreglo temporal del tamaño de la primera lista
        String[] temporal = new String[mate.length];
        int contador = 0;

        // Comparamos cada cédula de Matemática con todas las de Inglés
        for (int i = 0; i < mate.length; i++) {
            for (int j = 0; j < ingles.length; j++) {
                if (mate[i].equals(ingles[j])) {
                    temporal[contador] = mate[i];
                    contador++;
                    break; // Si ya lo encontramos, saltamos al siguiente estudiante de mate
                }
            }
        }

        // Creamos el arreglo final con el tamaño exacto de coincidencias encontradas
        String[] ambas = new String[contador];
        for (int i = 0; i < contador; i++) {
            ambas[i] = temporal[i];
        }
        return ambas;
    }

    // Método para imprimir cualquier arreglo de Strings
    public static void imprimirVector(String titulo, String[] vector) {
        System.out.println("\n" + titulo);
        if (vector.length == 0) {
            System.out.println("No hay registros.");
        } else {
            for (int i = 0; i < vector.length; i++) {
                System.out.println("[" + (i + 1) + "]: " + vector[i]);
            }
        }
    }
}
