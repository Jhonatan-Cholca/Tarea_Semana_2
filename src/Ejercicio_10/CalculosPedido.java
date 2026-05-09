package Ejercicio_10;

public class CalculosPedido {

    // b y c. Calcular el total a pagar aplicando descuento si corresponde
    public static double calcularTotalConDescuento(int cantidad, double precioUnitario) {
        double subtotal = cantidad * precioUnitario;
        if (subtotal > 50) {
            return subtotal * 0.90; // Aplica descuento del 10%
        }
        return subtotal;
    }

    // d. Calcular el ingreso total del restaurante
    public static double calcularIngresoTotal(double[] totales) {
        double acumulador = 0;
        for (int i = 0; i < totales.length; i++) {
            acumulador += totales[i];
        }
        return acumulador;
    }

    // e. Buscar y mostrar el pedido de mayor valor
    public static void mostrarPedidoMayor(String[] clientes, String[] platos, double[] totales) {
        double mayorValor = -1;
        int indiceMayor = 0;

        for (int i = 0; i < totales.length; i++) {
            if (totales[i] > mayorValor) {
                mayorValor = totales[i];
                indiceMayor = i;
            }
        }
        
        System.out.println("\n--- PEDIDO DE MAYOR VALOR ---");
        System.out.println("Cliente: " + clientes[indiceMayor]);
        System.out.println("Plato: " + platos[indiceMayor]);
        System.out.println("Total pagado: $" + mayorValor);
    }
}