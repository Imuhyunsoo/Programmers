package Introduction;

public class ChangeIndexOfString {

    public static String changeStr(String my_string, int num1, int num2) {

        String answer = "";

        // Restrictions
        if (my_string.length() < 1 | my_string.length() > 100
                | (num1 & num2) < 0 | (num1 & num2) > my_string.length() | num1 == num2) {
            return "ERROR";
        }

        String firstTemp = my_string.substring(num1, num1 + 1);
        String lastTemp = my_string.substring(num2, num2 + 1);

        for (int i = 0; i < my_string.length(); i++) {

            if (i == num1) {
                answer += lastTemp;
            } else if (i == num2) {
                answer += firstTemp;
            } else {
                answer += my_string.substring(i, i + 1);
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(changeStr("hello", 1, 2));
        System.out.println(changeStr("I love you", 3, 6));
    }
}
