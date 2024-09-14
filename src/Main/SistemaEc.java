import java.math.BigDecimal;
import java.math.RoundingMode;

public class SistemaEc {
    public double[] despejarX(double [] coeficientes ){
        coeficientes[2] = coeficientes[2]/coeficientes[0];
        coeficientes[1] = (coeficientes[1]/coeficientes[0])*-1;
        coeficientes[0] = 1;
        return coeficientes;
    }
    public double[] resolver(double[] coeficientes){
        double y = (coeficientes[5]-((coeficientes[3]*coeficientes[2])/coeficientes[0]))/(coeficientes[4]-((coeficientes[3]*coeficientes[1])/coeficientes[0]));
        BigDecimal Y = new BigDecimal(y);
        Y = Y.setScale(2, RoundingMode.HALF_UP);
        double x = -y*(coeficientes[1]/coeficientes[0])+(coeficientes[2]/coeficientes[0]);
        BigDecimal X = new BigDecimal(x);
        X = X.setScale(2, RoundingMode.HALF_UP);
        x = X.doubleValue();
        y = Y.doubleValue();
        double[] incognitas = new double[2];
        incognitas[0] = x;
        incognitas[1] = y;
        return  incognitas;
    }public void mostarResultado(double[] incognitas){
            String x = Double.toString(incognitas[0]);
            String y = Double.toString(incognitas[1]);

            System.out.println("La variable x es: "+x);
            System.out.println("La variable y es: "+y);
    }
}
