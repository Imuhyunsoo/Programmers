package CodingBasicTraining;

public class ChangeString {

    public static String change(int n) {

        // 制限事項
        if (n < 1 | n > 10000) {
            return "ERROR";
        }

        return String.valueOf(n);
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(change(123));
        System.out.println(change(2578));
    }
}
