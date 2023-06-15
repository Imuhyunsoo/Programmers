package CodingBasicTraining;

public class CommonMultiple {

    public static int isCommonMul(int number, int n, int m) {

        // 制限事項
        if (number < 10 | number > 100 | n < 2 | m < 2 | n > 10 | m > 10) {
            return -1;
        }

        return number % n == 0 & number % m == 0 ? 1 : 0;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(isCommonMul(60, 2, 3));
        System.out.println(isCommonMul(55, 10, 5));
    }
}
