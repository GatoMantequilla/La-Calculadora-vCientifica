import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SistemaEcTest {

    //Se prueba que el metodo despejarX funciona en un caso normal
    @Test
    public void testDespejarX_Caso1() {
        SistemaEc sistema = new SistemaEc();
        double[] coeficientes = {2, 4, 6};
        double[] resultadoEsperado = {1, -2, 3};
        assertArrayEquals(resultadoEsperado, sistema.despejarX(coeficientes));
        System.out.println("La prueba se realizo correctamente...");

    }
    //Se prueba que el metodo despejarX funciona en el caso extremo 0/0
    @Test
    public void testDespejarXThrowsArithmeticException() {
        double[] coeficientes = {0, 2, 3};
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            new SistemaEc().despejarX(coeficientes);
        });
        assertEquals("El coeficiente principal no puede ser cero.", exception.getMessage());
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
