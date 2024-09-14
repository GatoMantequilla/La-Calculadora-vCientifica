import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SistemaEcTest {

    // Pruebas para el método despejarX
    @Test
    public void testDespejarX_Caso1() {
        SistemaEc sistema = new SistemaEc();
        double[] coeficientes = {2, 4, 6};  // Coeficientes iniciales
        double[] resultadoEsperado = {1, -2, 3};  // Resultado esperado después de despejar X
        assertArrayEquals(resultadoEsperado, sistema.despejarX(coeficientes));
    }

    @Test
    public void testDespejarX_Caso2() {
        SistemaEc sistema = new SistemaEc();
        double[] coeficientes = {5, 10, 15};  // Coeficientes iniciales
        double[] resultadoEsperado = {1, -2, 3};  // Resultado esperado después de despejar X
        assertArrayEquals(resultadoEsperado, sistema.despejarX(coeficientes));
    }

    // Pruebas para el método resolver
    @Test
    public void testResolver_Caso1() {
        SistemaEc sistema = new SistemaEc();
        double[] coeficientes = {2, 4, 6, 1, 5, 10};  // Coeficientes para el sistema de ecuaciones
        double[] resultadoEsperado = {-1.67, 2.33};  // Valores esperados de x e y
        assertArrayEquals(resultadoEsperado, sistema.resolver(coeficientes));
    }

    @Test
    public void testResolver_Caso2() {
        SistemaEc sistema = new SistemaEc();
        double[] coeficientes = {3, 6, 9, 2, 7, 14};  // Coeficientes para el sistema de ecuaciones
        double[] resultadoEsperado = {-2.33, 2.67};  // Valores esperados de x e y
        assertArrayEquals(resultadoEsperado, sistema.resolver(coeficientes));
    }

}
