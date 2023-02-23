package Introduction;

public class RepeatedCharacterOutput {

    public static String repeatedOutput(String my_string, int n) {

        StringBuilder answer = new StringBuilder();

        // Restrictions
        if(my_string.length() >= 2 & my_string.length() <= 5 & n >= 2 & n <= 10) {

            for(int i = 0; i < my_string.length(); i++) {
                answer.append(String.valueOf(my_string.charAt(i)).repeat(n));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(repeatedOutput("hello",3));
    }
}
