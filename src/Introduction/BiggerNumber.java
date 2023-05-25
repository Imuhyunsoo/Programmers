package Introduction;

import java.util.Arrays;

public class BiggerNumber {

    public static int[] getBiggerNum(int[] array) {

        int[] answer = new int[2];
        int count = 0;

        // Restrictions
        if (array.length < 1 & array.length > 100 &
                Arrays.stream(array).min().getAsInt() < 1 & Arrays.stream(array).max().getAsInt() > 1000) {
            return null;
        }

        answer[0] = Arrays.stream(array).max().getAsInt();

        for (int j : array) {
            if (answer[0] == j) {
                break;
            }
            count++;
        }

        answer[1] = count;

        return answer;
    }

    public static void main(String[] args) {

        int[] test;

        // TEST CODE
        test = new int[] {1, 8, 3};
        System.out.println(Arrays.toString(getBiggerNum(test)));
        test = new int[] {9, 10, 11, 8};
        System.out.println(Arrays.toString(getBiggerNum(test)));
    }
}
