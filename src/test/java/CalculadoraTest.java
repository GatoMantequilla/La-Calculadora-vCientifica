import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void solucionEcuacionCuadratica_PositiveDiscriminant() {
        double[] soluciones = Calculadora.solucionEcuacionCuadratica(1, -5, 6);
        assertEquals(2, soluciones.length);
        assertEquals(3.0, soluciones[0], 0.0001);
        assertEquals(2.0, soluciones[1], 0.0001);
    }

    @Test
    public void solucionEcuacionCuadratica_NegativeDiscriminant() {
        double[] soluciones = Calculadora.solucionEcuacionCuadratica(1, 2, 5);
        assertEquals(0, soluciones.length);
    }
}