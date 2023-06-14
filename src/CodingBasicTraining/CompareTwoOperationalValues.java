package CodingBasicTraining;

public class CompareTwoOperationalValues {

    public static int getCompareVal(int a, int b) {

        // 制限事項
        if (a < 1 | b < 1 | a > 10000 | b > 10000) {
            return -1;
        }

        return Math.max(Integer.parseInt(a + String.valueOf(b)), (2 * a * b));
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(getCompareVal(2, 91));
        System.out.println(getCompareVal(91, 2));
    }
}
