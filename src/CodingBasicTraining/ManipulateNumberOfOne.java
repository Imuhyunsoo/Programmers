package CodingBasicTraining;

public class ManipulateNumberOfOne {

    public static int operation(int n, String control) {

        // 制限事項
        if (n < -100000 | n > 100000 | control.length() < 1 | control.length() > 100000) {
            return -2147483648;
        }

        for (int i = 0; i < control.length(); i++) {

            switch (control.charAt(i)) {
                case 'w' : n++;     break;
                case 's' : n--;     break;
                case 'd' : n += 10; break;
                case 'a' : n -= 10; break;
            }
        }
        return n;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(operation(0, "wsdawsdassw"));
    }
}
