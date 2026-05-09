package Ejercicio_08;

public class Operario {
private String codigo;
    private double horasAusencia;
    private int defectuosos;
    private int producidos;
    private int gradoEficiencia;

    public Operario(String codigo, double horasAusencia, int defectuosos, int producidos) {
        this.codigo = codigo;
        this.horasAusencia = horasAusencia;
        this.defectuosos = defectuosos;
        this.producidos = producidos;
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public double getHorasAusencia() { return horasAusencia; }
    public int getDefectuosos() { return defectuosos; }
    public int getProducidos() { return producidos; }
    public int getGradoEficiencia() { return gradoEficiencia; }
    public void setGradoEficiencia(int gradoEficiencia) { this.gradoEficiencia = gradoEficiencia; }
} 