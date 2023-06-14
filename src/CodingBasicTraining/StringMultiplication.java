package CodingBasicTraining;

public class StringMultiplication {

    public static String mulString(String my_string, int k) {

        // 制限事項
        if (my_string.length() < 1 | my_string.length() > 100 | k < 1 | k > 100) {
            return "ERROR";
        }

        return my_string.repeat(k);
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(mulString("string", 3));
        System.out.println(mulString("love", 10));
    }
}
