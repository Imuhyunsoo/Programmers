package CodingBasicTraining;

public class OverwriteString {

    public static String overwrite(String my_string, String overwrite_string, int s) {

        // 制限事項
        if (overwrite_string.length() < 1 | overwrite_string.length() > my_string.length()
                | my_string.length() > 1000 | s < 0 | s > (my_string.length() - overwrite_string.length())) {
            return "ERROR";
        }

        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(overwrite("He11oWor1d", "lloWorl", 2));
        System.out.println(overwrite("Program29b8UYP", "merS123", 7));

    }
}
