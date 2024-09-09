class CalculadoraCientifica {

    public static void main(String[] args) {

    }

    public static double ecuacionDeRecta (double x1, double y1, double x2, double y2) {
        try {
            String x = "x";
            double pendiente = (y2 - y1)/(x2- x1);
            double términoN = y1 - (pendiente * x1);
            double ecuacion = x * pendiente + términoN;
        }
    }

}
