package dev_jorge;

public class App {
    public static void main(String[] args) {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Central", "Ciudad");

        Vehiculo coche = new Coche("ABC123");
        Vehiculo moto = new Moto("XYZ789");
        Vehiculo camion = new Camion("LMN456", 4); 

        estacion.registrarVehiculo(coche);
        estacion.registrarVehiculo(moto);
        estacion.registrarVehiculo(camion);

        estacion.imprimirReporte();
    }
}
