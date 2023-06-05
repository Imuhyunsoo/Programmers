package Introduction;

public class CursedNumber {

    public static int changeTo3XLanguage(int n) {

        // 制限事項
        if (n < 1 | n > 100) {
            return -1;
        }

        int answer = 1;

        while (n != 0) {
            if (answer % 3 == 0 | answer % 10 == 3 |
                    (answer >= 30 & answer <= 39) | (answer >= 130 & answer <= 139)) {
                answer++;
            } else {
                answer++;
                n--;
            }
        }

        return --answer;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(changeTo3XLanguage(15));  // 答え：25
        System.out.println(changeTo3XLanguage(40));  // 答え：76
    }
}
