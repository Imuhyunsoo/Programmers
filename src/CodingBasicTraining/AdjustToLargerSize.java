package CodingBasicTraining;

public class AdjustToLargerSize {

    public static int getAddMax(int a, int b) {

        // 制限事項
        if (a < 1 | b < 1 | a > 10000 | b > 10000) {
            return -1;
        }

        return Math.max((Integer.parseInt((a + String.valueOf(b)))), (Integer.parseInt((b + String.valueOf(a)))));
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(getAddMax(9, 91));
        System.out.println(getAddMax(89, 8));
    }
}
