package Introduction;

public class CodeDecryption {

    public static String decode(String cipher, int code) {

        String answer = "";

        // Restrictions
        if (cipher.length() >= 1 & cipher.length() <= 1000 & code >= 1 & code <= cipher.length()) {

            for (int i = (code - 1); i < cipher.length(); i += code) {
                answer += cipher.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(decode("dfjardstddetckdaccccdegk", 4));
        System.out.println(decode("pfqallllabwaoclk", 2));
    }
}
