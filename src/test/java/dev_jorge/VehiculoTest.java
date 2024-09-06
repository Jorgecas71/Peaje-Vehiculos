package dev_jorge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

    @Test
    void testCalcularPeaje() {      
        Vehiculo vehiculo = new Vehiculo();
        double peajeEsperado = 5.0; 
        assertEquals(peajeEsperado, vehiculo.calcularPeaje(), "El cálculo del peaje no es correcto");
    }

    @Test
    void testToString() {      
        Vehiculo vehiculo = new Vehiculo();
        String resultadoEsperado = "Vehiculo{...}"; 
        assertEquals(resultadoEsperado, vehiculo.toString(), "El método toString no es correcto");
    }
}
