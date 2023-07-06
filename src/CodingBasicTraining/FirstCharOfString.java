package CodingBasicTraining;

public class FirstCharOfString {

    public static String slice(String my_string, int n) {

        // 制限事項
        if (my_string.length() < 1 | my_string.length() > 1000 | n < 1 | n > my_string.length()) {
            return "ERROR";
        }

        return my_string.substring(0, n);
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(slice("ProgrammerS123", 11));
        System.out.println(slice("He110W0r1d", 5));
    }
}
