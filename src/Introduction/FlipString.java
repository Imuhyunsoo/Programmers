package Introduction;

public class FlipString {

    public static String reverseString(String my_string) {

        String answer = "";

        if(my_string.length() >= 1 & my_string.length() <= 1000){

            for(int i = 0; i < my_string.length(); i++) {
                answer += my_string.charAt(my_string.length() - i - 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(reverseString("jaron"));
        System.out.println(reverseString("bread"));
    }
}
