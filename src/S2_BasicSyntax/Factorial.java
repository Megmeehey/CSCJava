package S2_BasicSyntax;

import java.math.BigInteger;

/**
 * Created by megmeehey on 14.07.17.
 */
public class Factorial {
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param num positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int num) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= num; ++i) fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }
}
