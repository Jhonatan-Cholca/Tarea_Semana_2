package Ejercicio_10;

public class Pedido {
    
private String cliente;
    private String plato;
    private int cantidad;
    private double precioUnitario;
    private double totalFinal;

    public Pedido(String cliente, String plato, int cantidad, double precioUnitario) {
        this.cliente = cliente;
        this.plato = plato;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // Getters
    public String getCliente() { return cliente; }
    public String getPlato() { return plato; }
    public int getCantidad() { return cantidad; }
    public double getPrecioUnitario() { return precioUnitario; }
    public double getTotalFinal() { return totalFinal; }

    // Setter para el total calculado (incluyendo descuento)
    public void setTotalFinal(double totalFinal) {
        this.totalFinal = totalFinal;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %-12s | Plato: %-15s | Cant: %-3d | Total: $%.2f", 
                cliente, plato, cantidad, totalFinal);
    }
}    
