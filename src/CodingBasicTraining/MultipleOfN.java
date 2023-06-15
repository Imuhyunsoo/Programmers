package CodingBasicTraining;

public class MultipleOfN {

    public static int multiple(int num, int n) {

        // 制限事項
        if (num < 2 | num > 100 | n < 2 | n > 9) {
            return -1;
        }

        return num % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(multiple(98, 2));
        System.out.println(multiple(34, 3));
    }
}
