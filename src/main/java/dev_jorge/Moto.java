package dev_jorge;

public class Moto extends Vehiculo {
    public Moto(String placa) {
        super(placa);
    }

    @Override
    public double calcularPeaje() {
        return 50;
    }

    @Override
    public String toString() {
        return "Moto [placa=" + placa + "]";
    }
}
