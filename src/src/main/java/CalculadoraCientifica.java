class CalculadoraCientifica {

    public static void main(String[] args) {

    }

    public static String ecuacionDeRecta(double x1, double y1, double x2, double y2) {
        try {
            if (x1 == x2) {
                throw new ArithmeticException("¡¡ERROR DE CÁLCULO!!: El denominador no puede ser cero");
            }
            double pendiente = ((y2 - y1) / (x2 - x1));
            double términoN = y1 - (pendiente * x1);
            return "y = " + pendiente + "x + " + términoN;
        } catch (ArithmeticException error) {
            return error.getMessage();
        }
    }
}
