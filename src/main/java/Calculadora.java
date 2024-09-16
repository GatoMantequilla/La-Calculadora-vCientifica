public class Calculadora {
    public static void main(String[] args) {
        imprimirSoluciones(solucionEcuacionCuadratica(1, -5, 6));
    }

    public static double[] solucionEcuacionCuadratica(double a, double b, double c) {
        try {
            double discriminante = Math.pow(b, 2) - 4 * a * c;
            System.out.println("---------------------------------");
            if (discriminante < 0) {
                System.out.println("No tiene soluciones reales");
                System.out.println("---------------------------------");
                return new double[0];
            } else {
                try {
                    double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                    double[] soluciones = { x1, x2 };
                    return soluciones;
                } catch (ArithmeticException e) {
                    System.err.println("Error: División por cero");
                    return new double[0];
                }
            }
        } catch (Exception e) {
            System.err.println("Error al calcular las soluciones: " + e.getMessage());
            return new double[0];
        }
    }

    public static void imprimirSoluciones(double[] soluciones) {
        try {
            if (soluciones.length == 0) {
                return;
            }
            System.out.println("Solución 1: " + soluciones[0]);
            System.out.println("Solución 2: " + soluciones[1]);
            System.out.println("---------------------------------");
        } catch (Exception e) {
            System.err.println("Error al imprimir las soluciones: " + e.getMessage());
        }
    }
}