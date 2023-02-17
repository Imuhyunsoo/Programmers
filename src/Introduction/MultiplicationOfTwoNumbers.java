package Introduction;

public class MultiplicationOfTwoNumbers {

    public static int mulTwoNumbers(int num1, int num2) {

        int answer = 0;

        if((num1 >= 0) & (num1 <= 100) & (num2 >= 0) & (num2 <= 100)) {
            answer = num1 * num2;
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(mulTwoNumbers(27,19));
    }

}
