package Introduction;

public class LowerAndUpperCase {

    public static String reverseCase(String my_string) {

        String answer = "";

        // Restrictions
        if (my_string.length() >= 1 & my_string.length() <= 1000) {

            for (int i = 0; i < my_string.length(); i++) {

                if (Character.isUpperCase(my_string.charAt(i))) {
                    answer += my_string.substring(i,i+1).toLowerCase();
                } else {
                    answer += my_string.substring(i,i+1).toUpperCase();
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(reverseCase("cccCCC"));
        System.out.println(reverseCase("abCdEfghIJ"));
    }
}
