package Introduction;

import java.util.Arrays;

public class CutAndSaveToArray {

    public static String[] sliceString(String my_str, int n) {

        if (my_str.length() < 1 | my_str.length() > 100 | n < 1 | n > my_str.length()) {
            return null;
        }

        int length  = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;

        String[] answer = new String[length];

        for (int i = 0; i < answer.length; i++) {
            int start = i * n;
            int end = Math.min((i + 1) * n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(Arrays.toString(sliceString("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(sliceString("abcdef123", 3)));

    }
}
