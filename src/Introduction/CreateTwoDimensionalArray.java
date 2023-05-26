package Introduction;

import java.util.Arrays;

public class CreateTwoDimensionalArray {

    public static int[][] create(int[] num_list, int n) {

        // Restrictions
        if (num_list.length % n != 0 | num_list.length > 150 | n < 2 | n > num_list.length) {
            return null;
        }

        int[][] answer = new int[num_list.length / n][n];
        int count = 0;

        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[count++];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] test;

        // TEST CODE
        test = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.deepToString(create(test, 2)));
        test = new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948};
        System.out.println(Arrays.deepToString(create(test, 3)));
    }
}