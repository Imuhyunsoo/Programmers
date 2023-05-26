package Introduction;

import java.util.Arrays;

public class DuplicateCharDeletion {

    public static String duplicateDeletion(String my_string) {

        // Restrictions
        if (my_string.length() < 1 | my_string.length() > 110) {
            return "ERROR";
        }

        StringBuilder answer = new StringBuilder();
        Object[] charList = Arrays.stream(my_string.split("")).distinct().toArray();

        for (Object str : charList) {
            answer.append(str);
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(duplicateDeletion("people"));
        System.out.println(duplicateDeletion("We are the world"));
    }
}
