package CodingBasicTraining;

import java.util.Arrays;

public class LastTwoElements {

    public static int[] elementCheck(int[] num_list) {

        // 制限事項
        if (num_list.length < 2 | num_list.length > 10) {
            return null;
        }

        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer[answer.length - 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[answer.length - 1] = num_list[num_list.length - 1] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(Arrays.toString(elementCheck(new int[] {2, 1, 6})));
        System.out.println(Arrays.toString(elementCheck(new int[] {5, 2, 1, 7, 5})));
    }
}
