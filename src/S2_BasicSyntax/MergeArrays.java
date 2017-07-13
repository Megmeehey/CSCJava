package S2_BasicSyntax;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by megmeehey on 14.07.17.
 */
public class MergeArrays {
    /**
     * Merges two given sorted arrays into one
     *
     * @param a first sorted array
     * @param b second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a, int[] b) {
        return a.length >= b.length ? merging(a, b) : merging(b, a);
    }

    private static int[] merging(int[] a, int[] b) {
        int j = 0;
        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            while (j < b.length && (b[j] <= a[i])) {
                intList.add(b[j]);
                j++;
            }
            intList.add(a[i]);
        }

        while (j < b.length) {
            intList.add(b[j]);
            j++;
        }

        int[] array = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) array[i] = intList.get(i);
        return array; // your implementation here
    }
}
