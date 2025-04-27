package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColorsTest {

    @Test
    public void testGetColor() {
        // Verificar que cada valor del enum tiene el color correcto asociado
        assertEquals("Rojo", Colors.ROJO.getColor());
        assertEquals("Gris", Colors.GRIS.getColor());
        assertEquals("Amarillo", Colors.AMARILLO.getColor());
        assertEquals("Miel", Colors.MIEL.getColor());
    }

    @Test
    public void testEnumValues() {
        // Verificar que los valores del enum son correctos
        assertEquals(4, Colors.values().length);  // Verifica que hay 4 colores en el enum
    }

}
