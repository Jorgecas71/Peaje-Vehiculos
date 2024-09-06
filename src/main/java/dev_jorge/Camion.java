package dev_jorge;

public class Camion extends Vehiculo {
    private int ejes;

    public Camion(String placa, int ejes) {
        super(placa);
        this.ejes = ejes;
    }

    @Override
    public double calcularPeaje() {
        return 50 * ejes;
    }

    @Override
    public String toString() {
        return "Camion [placa=" + placa + ", ejes=" + ejes + "]";
    }
}
