package S2_BasicSyntax;

/**
 * Created by megmeehey on 14.07.17.
 */
public class LeapYear {
    public static int leapYearCount(int year) {
        return year / 4 - year / 100 + year / 400;
    }
}
