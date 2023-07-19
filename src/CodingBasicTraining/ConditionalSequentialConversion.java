package CodingBasicTraining;

import java.util.Arrays;

public class ConditionalSequentialConversion {

    public static int[] change(int[] arr) {

        // 制限事項
        if (arr.length < 1 | arr.length > 1000000 | Arrays.stream(arr).min().getAsInt() < 1
                | Arrays.stream(arr).max().getAsInt() > 100) {
            return null;
        }

        int[] answer = new int[arr.length];

        for (int i = 0; i < answer.length; i++) {
            if (arr[i] >= 50 & arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] <= 50 & arr[i] % 2 != 0) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(Arrays.toString(change(new int[]{1, 2, 3, 100, 99, 98})));
    }
}
