package Introduction;

import java.util.Arrays;

public class ToSortStrings {

    public static int[] pickNumberAndASC(String my_string) {

        int[] answer;
        int count = 0;

        // Restrictions
        if (my_string.length() >= 1 && my_string.length() <= 100) {

            // Array.length
            for (int i = 0; i < my_string.length(); i++) {
                try {
                    Integer.parseInt(my_string.substring(i, (i + 1)));
                    count++;
                } catch (Exception e) {
                    continue;
                }
            }

            answer = new int[count];

            for (int i = 0; i < my_string.length(); i++) {
                try {
                    answer[count - 1] = Integer.parseInt(my_string.substring(i, (i + 1)));
                    count--;
                } catch (Exception e) {
                    continue;
                }
            }
            Arrays.sort(answer);

            return answer;
        }
        return null;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(Arrays.toString(pickNumberAndASC("hi12392")));
        System.out.println(Arrays.toString(pickNumberAndASC("p2o4i8gj2")));
        System.out.println(Arrays.toString(pickNumberAndASC("abcde0")));
    }
}
