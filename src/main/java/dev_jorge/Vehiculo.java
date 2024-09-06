package dev_jorge;

public abstract class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public abstract double calcularPeaje();

    @Override
    public String toString() {
        return "Vehículo [placa=" + placa + "]";
    }
}
