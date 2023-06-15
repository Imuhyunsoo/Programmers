package CodingBasicTraining;

public class OddAndEvenCasesDifferentValues {

    public static int oddAndEvenCaseDifVal(int n) {

        // 制限事項
        if (n < 1 | n > 100) {
            return -1;
        }

        int sum = 0;

        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                sum += i * i;
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(oddAndEvenCaseDifVal(7));
        System.out.println(oddAndEvenCaseDifVal(10));
    }
}
