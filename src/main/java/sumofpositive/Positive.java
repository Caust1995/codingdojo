package sumofpositive;

import java.util.Arrays;

/*
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
 */
public class Positive {

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(i -> i>0).sum();
    }

    public static int sum1(int[] arr) {
        int sumOfPositives = 0;
        for (int i : arr) {
            if (i > 0) {
                sumOfPositives += i;
            }
        }
        return sumOfPositives;
    }
}