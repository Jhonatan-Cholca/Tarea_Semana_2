package Ejercicio_03;

public class Empleado {

    // Método estático para buscar un nombre según el código ingresado
    // Retorna el nombre si lo encuentra, o un mensaje de error si no existe
    public static String buscarEmpleado(String[] codigos, String[] nombres, String codigoBusqueda) {
        for (int i = 0; i < codigos.length; i++) {
            // Comparamos el contenido del código usando .equals()
            if (codigos[i].equals(codigoBusqueda)) {
                return nombres[i]; // Retornamos el nombre que está en la misma posición
            }
        }
        return "Empleado no encontrado";
    }
}
