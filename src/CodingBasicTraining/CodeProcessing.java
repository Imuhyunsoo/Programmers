package CodingBasicTraining;

public class CodeProcessing {

    public static String startProcess(String code) {

        // 制限事項
        if (code.length() < 1 | code.length() > 100000) {
            return "ERROR";
        }

        StringBuilder answer = new StringBuilder();
        int count = 0;
        boolean check = false;

        for (int i = 0; i < code.length(); i++) {

            if (code.charAt(i) == '1') {
                count++;
                continue;
            }

            if (count % 2 == 0 & i % 2 == 0) {
                answer.append(code.charAt(i));
                check = true;
            } else if (count % 2 != 0 & i % 2 != 0) {
                answer.append(code.charAt(i));
                check = true;
            }
        }
        return check ? answer.toString() : "EMPTY";
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(startProcess("abc1abc1abc"));
    }
}
