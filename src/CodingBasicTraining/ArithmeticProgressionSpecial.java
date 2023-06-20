package CodingBasicTraining;

public class ArithmeticProgressionSpecial {

    public static int getSum(int a, int d, boolean[] included) {

        // 制限事項
        if (a < 1 | d < 1 | included.length < 1 | a > 100 | d > 100 | included.length > 100) {
            return -1;
        }

        int sum = 0;
        int count = a;

        for (boolean bool : included) {

            if (bool) {
                sum += count;
            } count += d;
        }
        return sum;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(getSum(3, 4, new boolean[] {true, false, false, true, true}));
        System.out.println(getSum(7, 1, new boolean[] {false, false, false, true, false, false, false}));
    }
}
