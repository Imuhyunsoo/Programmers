package CodingBasicTraining;

public class CharactersAfterString {

    public static String getAfterString(String my_string, int n) {

        // 制限事項
        if (my_string.length() < 1 | my_string.length() > 1000 | n < 1 | n > my_string.length()) {
            return "ERROR";
        }

        return my_string.substring(my_string.length() - n);
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(getAfterString("ProgrammerS123", 11));
        System.out.println(getAfterString("He110W0r1d", 5));
    }
}
