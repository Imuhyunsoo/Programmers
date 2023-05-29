package Introduction;

import java.util.Arrays;

public class LuckySeven {

    public static int getSevenNum(int[] array) {

        // Restrictions
        if (array.length < 1 | array.length > 100 |
                Arrays.stream(array).min().getAsInt() < 0 | Arrays.stream(array).max().getAsInt() > 100000) {
            return -1;
        }

        int answer = 0;
        String temp = "";

        for (int k : array) {
            temp = String.valueOf(k);
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '7') {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] test;

        // TEST CODE
        test = new int[]{7, 77, 17};
        System.out.println(getSevenNum(test));
        test = new int[]{10, 29};
        System.out.println(getSevenNum(test));
    }
}
