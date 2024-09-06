package dev_jorge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoTest {
    @Test
    void testCalcularPeaje() {
        Moto moto = new Moto("XYZ789");
        double peaje = moto.calcularPeaje();
        assertEquals(50, peaje, "El peaje de la moto debería ser 50");
    }

    @Test
    void testToString() {
        Moto moto = new Moto("XYZ789");
        String descripcion = moto.toString();
        assertEquals("Moto [placa=XYZ789]", descripcion, "La descripción de la moto no es correcta");
    }
}
