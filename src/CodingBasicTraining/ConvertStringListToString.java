package CodingBasicTraining;

public class ConvertStringListToString {

    public static String conversion(String[] arr) {

        // 制限事項
        if (arr.length < 1 | arr.length > 200) {
            return "ERROR";
        }

        StringBuilder answer = new StringBuilder();

        for (String s : arr) {
            answer.append(s);
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(conversion(new String[] {"a", "b", "c"}));
    }
}
