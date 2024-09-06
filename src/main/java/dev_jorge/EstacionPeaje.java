package dev_jorge;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String ciudad;
    private double totalRecaudado;
    private List<Vehiculo> vehiculos;

    public EstacionPeaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalRecaudado = 0;
        this.vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        totalRecaudado += vehiculo.calcularPeaje();
    }

    public void imprimirReporte() {
        System.out.println("Estación de Peaje: " + nombre + " en " + ciudad);
        System.out.println("Vehículos registrados:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
        System.out.println("Total Recaudado: $" + totalRecaudado);
    }
}
