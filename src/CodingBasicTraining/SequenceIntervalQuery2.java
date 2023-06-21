package CodingBasicTraining;

import java.util.Arrays;

public class SequenceIntervalQuery2 {

    public static int[] getQuery(int[] arr, int[][] queries) {

        // 制限事項
        if (arr.length < 1 | arr.length > 1000 | queries.length < 1 | queries.length > 1000) {
            return null;
        }

        int min;
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            min = 2000000;

            for (int j = queries[i][0]; j <= queries[i][1]; i++) {
                if (arr[j] > queries[i][2] & min > arr[j]) {
                    min = arr[j];
                }
            }
            if (min == 2000000) {
                answer[i] = -1;
            } else {
                answer[i] = min;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        //　テストコード
        System.out.println(Arrays.toString(getQuery(new int[]{0, 1, 2, 4, 3},
                new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}})));
    }
}
