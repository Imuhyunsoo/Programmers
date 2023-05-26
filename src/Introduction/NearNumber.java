package Introduction;

import java.util.Arrays;

public class NearNumber {

    public static int getNearNum(int[] array, int n) {

        // Restrictions
        if (array.length < 1 | array.length > 100 | n < 1 | n > 100 |
                Arrays.stream(array).min().getAsInt() < 1 | Arrays.stream(array).max().getAsInt() > 100) {
            return -1;
        }

        int answer = 0;
        int proximity = 100;
        int temp;

        for (int j : array) {

            temp = Math.abs(n - j);

            if (proximity > temp) {
                proximity = temp;
                answer = j;
            } else if (proximity == temp) {
                answer = Math.min(answer, j);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] test;

        // TEST CODE
        test = new int[]{3, 10, 28};
        System.out.println(getNearNum(test, 20));
        test = new int[]{10, 11, 12};
        System.out.println(getNearNum(test, 13));
    }
}
