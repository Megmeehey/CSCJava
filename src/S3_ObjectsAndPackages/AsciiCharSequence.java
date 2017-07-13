package S3_ObjectsAndPackages;

import java.util.Arrays;

/**
 * Created by megmeehey on 14.07.17.
 */
public class AsciiCharSequence implements java.lang.CharSequence {
    private final byte[] seq;

    public AsciiCharSequence(byte[] array) {
        seq = array.clone();
    }

    public int length() {
        return seq.length;
    }

    public char charAt(int index) {
        return (char) seq[index];
    }

    public AsciiCharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(seq, start, end));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seq.length; i++) {
            sb.append((char) seq[i]);
        }
        return sb.toString();
    }
}
