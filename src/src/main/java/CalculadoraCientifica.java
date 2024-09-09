import java.util.InputMismatchException;

class CalculadoraCientifica {

    public static void main(String[] args) {

    }

    public static String ecuacionDeRecta(float x1, float y1, float x2, float y2) {
        try {
            if (x1 == x2) {
                throw new ArithmeticException("¡¡ERROR DE CÁLCULO!!: El denominador no puede ser cero");
            }
            float pendiente = ((y2 - y1) / (x2 - x1));
            float términoN = y1 - (pendiente * x1);
            return "y = " + pendiente + "x + " + términoN;
        } catch (ArithmeticException error) {
            return error.getMessage();
        }
    }
}
