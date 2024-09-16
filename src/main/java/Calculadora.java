public class Calculadora {
    public static void main(String[] args) {
        imprimirSoluciones(solucionEcuacionCuadratica(1, -5, 6));
    }
    public static double[] solucionEcuacionCuadratica(double a, double b, double c) {
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        System.out.println("---------------------------------");
        if (discriminante < 0) {
            System.out.println("No tiene soluciones reales");
            System.out.println("---------------------------------");
            return new double[0];
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            double[] soluciones = { x1, x2 };
            return soluciones;
        }
    }
    public static void imprimirSoluciones(double[] soluciones) {
        if (soluciones.length == 0) {
            return;
        }
        System.out.println("Solución 1: " + soluciones[0]);
        System.out.println("Solución 2: " + soluciones[1]);
        System.out.println("---------------------------------");
    }
}
