package Introduction;

public class SubtractionOfTwoNumbers {

    public static int subTwoNumbers(int num1, int num2) {

        int answer = 0;

        // Restrictions
        if((num1 >= -50000 & num2 <= 50000) & (num2 >= -50000 & num2 <= 50000)) {
            answer = num1 - num2;
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(subTwoNumbers(2,3));
        System.out.println(subTwoNumbers(100,2));
    }
}
