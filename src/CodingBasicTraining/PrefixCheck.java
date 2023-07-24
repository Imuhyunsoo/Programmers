package CodingBasicTraining;

public class PrefixCheck {

    public static int check(String my_string, String is_prefix) {

        //制限事項
        if (my_string.length() < 1 | my_string.length() > 100 | is_prefix.length() < 1 | is_prefix.length() > 100
                | is_prefix.length() > my_string.length()) {
            return 0;
        }

        if (my_string.substring(0, is_prefix.length()).equals(is_prefix)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {

        //　テストコード
        System.out.println(check("banana", "ban"));
        System.out.println(check("banana", "nan"));
        System.out.println(check("banana", "abcd"));
        System.out.println(check("banana", "bananan"));

    }
}
