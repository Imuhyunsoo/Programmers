package CodingBasicTraining;

import java.util.Arrays;

public class SequenceIntervalQuery4 {

    public static int[] getQuery(int[] arr, int[][] queries) {

        // 制限実行
        if (arr.length < 1 | arr.length > 1000 | queries.length < 1 | queries.length > 1000) {
            return null;
        }

        int[] answer = arr.clone();

        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {

                if (j % query[2] == 0) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(Arrays.toString(getQuery(new int[]{0, 1, 2, 4, 3},
                new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}})));
    }
}
