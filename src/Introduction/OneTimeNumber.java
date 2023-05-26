package Introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OneTimeNumber {

    public static String getNumber(String s) {

        // Restrictions
        if (s.length() == 0 | s.length() > 1000) {
            return "ERROR";
        }

        String answer = "";
        List<String> temp = new ArrayList<>();
        List<String> blacklist = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (!temp.contains(s.substring(i, i + 1)) & !blacklist.contains(s.substring(i, i + 1))) {
                temp.add(s.substring(i, i + 1));
            } else {
                temp.remove(s.substring(i, i + 1));
                blacklist.add(s.substring(i, i + 1));
            }
        }

        Collections.sort(temp);

        for (String value : temp) {
            answer += value;
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getNumber("abcabcadc"));
        System.out.println(getNumber("abdc"));
        System.out.println(getNumber("hello"));
    }
}
