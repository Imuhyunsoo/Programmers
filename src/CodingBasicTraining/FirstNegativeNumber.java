package CodingBasicTraining;

import java.util.Arrays;

public class FirstNegativeNumber {

    public static int getNegativeNumPoint(int[] num_list) {

        // 制限事項
        if (num_list.length < 5 | num_list.length > 100 | Arrays.stream(num_list).min().getAsInt() < -10
                | Arrays.stream(num_list).max().getAsInt() > 100) {
            return -1;
        }

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(getNegativeNumPoint(new int[] {12, 4, 15, 46, 38, -2, 15}));
        System.out.println(getNegativeNumPoint(new int[] {13, 22, 53, 24, 15, 6}));
    }
}
