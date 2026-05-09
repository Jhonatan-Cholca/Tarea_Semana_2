package Ejercicio_3;

public class Empleado {
    private String codigo;
    private String nombre;

    public Empleado(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}
