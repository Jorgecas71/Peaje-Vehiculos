package dev_jorge;


public class Coche extends Vehiculo {
    public Coche(String placa) {
        super(placa);
    }

    @Override
    public double calcularPeaje() {
        return 100;
    }

    @Override
    public String toString() {
        return "Coche [placa=" + placa + "]";
    }
    
}
