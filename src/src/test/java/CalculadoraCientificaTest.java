import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EcuacionDeRectaTest {

    @Test
    public void testPendientePositiva() {
        String resultado = CalculadoraCientifica.ecuacionDeRecta(1, 2, 3, 4);
        assertEquals("y = 1.0x + 1.0", resultado);
    }

    @Test
    public void testPendienteNegativa() {
        String resultado = CalculadoraCientifica.ecuacionDeRecta(1, 5, 4, 2);
        assertEquals("y = -1.0x + 6.0", resultado);
    }

    @Test
    public void testRectaHorizontal() {
        String resultado = CalculadoraCientifica.ecuacionDeRecta(1, 2, 3, 2);
        assertEquals("y = 0.0x + 2.0", resultado);
    }

    @Test
    public void testRectaVertical() {
        String resultado = CalculadoraCientifica.ecuacionDeRecta(2, 3, 2, 5);
        assertEquals("¡¡ERROR DE CÁLCULO!!: El denominador no puede ser cero", resultado);
    }
}
