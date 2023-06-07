package Introduction;

import java.util.ArrayList;
import java.util.Collections;

public class Polynomial {

    public static String sum(String polynomial) {

        // 入力値制限
        if (polynomial.length() == 0 | polynomial.length() > 100) {
            return "ERROR";
        }

        int sum = 0;
        int x = 0;
        String answer = "";
        ArrayList<String> arrayList = new ArrayList<>();
        String[] terms = polynomial.split(" ");

        // セッティング
        Collections.addAll(arrayList, terms);
        // "+"の要素を削除する
        arrayList.removeIf(element -> element.equals("+"));

        for (String term : arrayList) {
            try {
                sum += Integer.parseInt(term);
            } catch (NumberFormatException e) {
                if (term.equals("x")) {
                    x += 1;
                } else {
                    x += Integer.parseInt(term.substring(0, term.length() - 1));
                }
            }
        }

        if (x == 1) {
            answer += "x";
        } else if (x > 1) {
            answer += x + "x";
        }

        if (x == 0 & sum > 0) {
            answer += sum;
        } else if (sum > 0) {
            answer += " + " + sum;
        }

        return answer;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(sum("3x + 7 + x"));
        System.out.println(sum("x + x + x"));
    }
}
