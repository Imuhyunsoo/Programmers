package Introduction;

public class SumOfTwoNumbers {

    public static int addTwoNumbers(int num1, int num2) {

        int answer = 0;

        // Restrictions
        if((num1 >= -50000 & num2 <= 50000) & (num2 >= -50000 & num2 <= 50000)) {
            answer = num1 + num2;
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(addTwoNumbers(2,3));
        System.out.println(addTwoNumbers(100,2));
    }
}
