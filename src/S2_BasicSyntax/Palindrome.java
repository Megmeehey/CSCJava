package S2_BasicSyntax;

/**
 * Created by megmeehey on 14.07.17.
 */
public class Palindrome {
    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        return text.replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase(new StringBuilder(text).reverse().toString());
    }
}
