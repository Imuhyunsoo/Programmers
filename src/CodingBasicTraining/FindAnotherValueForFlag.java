package CodingBasicTraining;

public class FindAnotherValueForFlag {

    public static int getValue(int a, int b, boolean flag) {

        // 制限事項
        if (a < -1000 | b < -1000 | a > 1000 | b > 1000) {
            return -1;
        }

        return flag ? a + b : a - b;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(getValue(-4, 7, true));
        System.out.println(getValue(-4, 7, false));
    }
}
