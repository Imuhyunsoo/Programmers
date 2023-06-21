package CodingBasicTraining;

import java.util.Arrays;

public class SequenceIntervalQuery {

    public static int[] changeList(int[] arr, int[][] queries) {

        // 制限事項
        if (arr.length < 1 | arr.length > 1000 | queries.length < 1 | queries.length> 1000) {
            return null;
        }

        int temp;

        for (int[] query : queries) {
            temp = arr[query[1]];
            arr[query[1]] = arr[query[0]];
            arr[query[0]] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(Arrays.toString(changeList(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}})));
    }
}
