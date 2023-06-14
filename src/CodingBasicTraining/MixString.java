package CodingBasicTraining;

public class MixString {

    public static String mix(String str1, String str2) {

        // 制限事項
        if (str1.length() < 1 | str1.length() > 10 | str1.length() != str2.length()) {
            return "ERROR";
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(mix("aaaaa", "bbbbb"));
    }
}
