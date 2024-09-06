package dev_jorge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class EstacionPeajeTest {

    @Test
    void testRegistrarVehiculo() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Central", "Ciudad X");
        Vehiculo vehiculo = new Vehiculo();
        estacion.registrarVehiculo(vehiculo);

        List<Vehiculo> vehiculosEsperados = new ArrayList<>();
        vehiculosEsperados.add(vehiculo);

        assertEquals(vehiculosEsperados, estacion.getVehiculos(), "El vehículo no se registró correctamente");
        assertEquals(vehiculo.calcularPeaje(), estacion.getTotalRecaudado(), 0.01, "El total recaudado no es correcto");
    }

    @Test
    void testImprimirReporte() {
        EstacionPeaje estacion = new EstacionPeaje("Peaje Central", "Ciudad X");
        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo vehiculo2 = new Vehiculo();
        estacion.registrarVehiculo(vehiculo1);
        estacion.registrarVehiculo(vehiculo2);

        estacion.imprimirReporte();
    }
}
