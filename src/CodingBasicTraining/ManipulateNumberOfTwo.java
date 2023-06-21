package CodingBasicTraining;

public class ManipulateNumberOfTwo {

    public static String operation(int[] numLog) {

        // 制限事項
        if (numLog.length < 2 | numLog.length > 100000 | numLog[0] < -100000 | numLog[0] > 100000) {
            return "ERROR";
        }

        StringBuilder answer = new StringBuilder();
        int before = numLog[0];
        int after = 0;

        for (int i = 1; i < numLog.length; i++) {

            after = before - numLog[i];
            before = numLog[i];

            switch (after) {
                case  -1 : answer.append("w"); break;
                case   1 : answer.append("s"); break;
                case -10 : answer.append("d"); break;
                case  10 : answer.append("a"); break;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(operation(new int[] {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }
}
