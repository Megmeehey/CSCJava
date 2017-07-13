package S2_BasicSyntax;

/**
 * Created by megmeehey on 14.07.17.
 */
public class Expr {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(c - (a + b)) <= 0.0001;
    }
}
