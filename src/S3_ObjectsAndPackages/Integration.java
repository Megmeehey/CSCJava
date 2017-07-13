package S3_ObjectsAndPackages;

import java.util.function.DoubleUnaryOperator;

/**
 * Created by megmeehey on 14.07.17.
 */
public class Integration {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double n = 10000000;
        double delta = (b - a) / n;           // step size
        double sum = 0.0;                     // area
        for (int i = 0; i < n; i++) {
            sum += delta * f.applyAsDouble(a + delta * (i + 0.5));
        }
        return sum;
    }
}
