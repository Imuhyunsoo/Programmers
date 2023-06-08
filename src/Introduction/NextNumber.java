package Introduction;

import java.util.Arrays;

public class NextNumber {

    public static int getNextNumber(int[] common) {

        // 制限事項
        if (common.length < 2 | common.length > 1000 |
                Arrays.stream(common).min().getAsInt() < -1000 |Arrays.stream(common).max().getAsInt() > 2000) {
            return -1;
        }

        // 等差数列
        if (common[1] - common[0] == common[2] - common[1]) {
            return common[0] + (common.length) * (common[1] - common[0]);
        }

        // 等比数列
        if (common[1] / common[0] == common[2] / common[1]) {
            return (int) (common[0] * Math.pow((double) common[1] / common[0], common.length));
        }
        return -1;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(getNextNumber(new int[] {1, 2, 3, 4}));
        System.out.println(getNextNumber(new int[] {2, 4, 8}));
    }
}
