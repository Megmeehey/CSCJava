package S4_ExceptionHandling;

/**
 * Created by megmeehey on 14.07.17.
 */
public class SqrtExceptionTest {
    public static double sqrt(double x) {
        if (x < 0) {
            throw new java.lang.IllegalArgumentException("Expected non-negative number, got " + x);
        } else {
            return Math.sqrt(x);
        }
    }
}
