package Introduction;

import java.util.Arrays;

public class CompletionOfTriangle {

    public static int getCompletionCount (int[] sides) {

        int answer = 0;
        int max = Arrays.stream(sides).max().getAsInt();
        int min = Arrays.stream(sides).min().getAsInt();
        int temp = 0;

        // Restrictions
        if (sides.length != 2 | max > 1000 | min < 1) {
            return -1;
        }

        while (true) {
            if ((max + min) > temp & (min + temp) > max & (temp + max) > min) {
                answer++;
            } else if (max < temp) {
                break;
            }
            temp++;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] test;

        // TEST CODE
        test = new int[]{1, 2};
        System.out.println(getCompletionCount(test));
        test = new int[]{3, 6};
        System.out.println(getCompletionCount(test));
        test = new int[]{11, 7};
        System.out.println(getCompletionCount(test));
    }
}
