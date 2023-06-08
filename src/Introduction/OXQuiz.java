package Introduction;

import java.util.ArrayList;
import java.util.Arrays;

public class OXQuiz {

    public static String[] getAnswer(String[] quiz) {

        // 制限事項
        if (quiz.length < 1 | quiz.length > 10) {
            return null;
        }

        String[] answer = new String[quiz.length];


        for (int i = 0; i < quiz.length; i++) {

            String[] words = quiz[i].split(" ");
            ArrayList<String> formula = new ArrayList<>(Arrays.asList(words));

            switch (formula.get(1)) {

                case "+" :
                    if (Integer.parseInt(formula.get(0)) + Integer.parseInt(formula.get(2))
                            == Integer.parseInt(formula.get(4))) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                    break;

                case "-" :
                    if (Integer.parseInt(formula.get(0)) - Integer.parseInt(formula.get(2))
                            == Integer.parseInt(formula.get(4))) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] quiz;

        // テストコード
        quiz = new String[] {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(getAnswer(quiz)));
        quiz = new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        System.out.println(Arrays.toString(getAnswer(quiz)));

    }
}
