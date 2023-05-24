package Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleOfNum {

    public static int[] getMultipleList(int n, int[] numlist) {

        int[] answer = new int[numlist.length];
        int count = 0;


        // Restrictions
        if (n < 1 & n > 10000 & numlist.length < 1 & numlist.length > 100 &
                Arrays.stream(numlist).min().getAsInt() < 1 &
                Arrays.stream(numlist).max().getAsInt() < 100000) {
            return null;
        }

        for (int i : numlist) {

            if (i % n == 0) {
                answer[count++] = i;
            }
        }

        int[] list = new int[count];

        for (int i = 0; i < count; i++) {
            list[i] = answer[i];
        }

        return list;
    }

    public static void main(String[] args) {

        int [] test;

        // TEST CODE
        test = new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(getMultipleList(3, test)));
        test = new int[] {1, 9, 3, 10, 13, 5};
        System.out.println(Arrays.toString(getMultipleList(5, test)));
        test = new int[] {2, 100, 120, 600, 12, 12};
        System.out.println(Arrays.toString(getMultipleList(12, test)));

    }
}
