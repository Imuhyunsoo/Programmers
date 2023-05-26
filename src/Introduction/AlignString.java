package Introduction;

import java.util.Arrays;

public class AlignString {

    public static String lowerSort(String my_string) {

        // Restrictions
        if (my_string.length() == 0 | my_string.length() > 100) {
            return "ERROR";
        }

        String answer = "";
        String[] temps = my_string.toLowerCase().split("");

        Arrays.sort(temps);

        for (String temp : temps) {
            answer += temp;
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(lowerSort("Bcad"));
        System.out.println(lowerSort("heLLo"));
        System.out.println(lowerSort("Python"));
    }
}
