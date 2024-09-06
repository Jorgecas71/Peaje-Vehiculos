package dev_jorge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CocheTest {
    @Test
    void testCalcularPeaje() {
        Coche coche = new Coche("ABC123");
        double peaje = coche.calcularPeaje();
        assertEquals(100, peaje, "El peaje del coche debería ser 100");
    }

    @Test
    void testToString() {
        Coche coche = new Coche("ABC123");
        String descripcion = coche.toString();
        assertEquals("Coche [placa=ABC123]", descripcion, "La descripción del coche no es correcta");
    }
}
