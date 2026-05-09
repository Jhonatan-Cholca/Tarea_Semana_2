package Ejercicio_09;

public class Medicamentos {
private String nombre;
    private int stockActual;
    private int stockMinimo;
    private double precioUnitario;

    public Medicamentos(String nombre, int stockActual, int stockMinimo, double precioUnitario) {
        this.nombre = nombre;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.precioUnitario = precioUnitario;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public int getStockActual() { return stockActual; }
    public void setStockActual(int stockActual) { this.stockActual = stockActual; }
    public int getStockMinimo() { return stockMinimo; }
    public double getPrecioUnitario() { return precioUnitario; }

    @Override
    public String toString() {
        return String.format("Nombre: %-15s | Stock: %-4d | Min: %-4d | Precio: $%.2f", 
                nombre, stockActual, stockMinimo, precioUnitario);
    }
}    

