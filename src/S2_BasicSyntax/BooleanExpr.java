package S2_BasicSyntax;

/**
 * Created by megmeehey on 14.07.17.
 */
public class BooleanExpr {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean e = a ^ b, f = a ^ c, g = a ^ d;
        return ((!e && f && g) || (!f && e && g) || (!g && f && e));
    }
}
