package dev_jorge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamionTest {
    @Test
    void testCalcularPeaje() {
        Camion camion = new Camion("LMN456", 4);
        double peaje = camion.calcularPeaje();
        assertEquals(200, peaje, "El peaje del camión debería ser 200");
    }

    @Test
    void testToString() {
        Camion camion = new Camion("LMN456", 4);
        String descripcion = camion.toString();
        assertEquals("Camion [placa=LMN456, ejes=4]", descripcion, "La descripción del camión no es correcta");
    }
}
