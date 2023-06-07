package Introduction;

public class PressString {

    public static int press(String A, String B) {

        // 入力値制限
        if (A.length() == 0 | A.length() > 100 | B.length() == 0 | B.length() > 100) {
            return -1;
        }

        if (A.equals(B)) {
            return 0;
        }

        for (int i = 0; i < A.length(); i++) {
            A = A.substring(A.length() -1) + A.substring(0, A.length() - 1);

            if (A.equals(B)) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(press("hello", "ohell"));
        System.out.println(press("apple", "elppa"));
        System.out.println(press("atat", "tata"));
        System.out.println(press("abc", "abc"));
    }
}
