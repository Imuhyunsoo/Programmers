package Introduction;

public class DivisionOfTwoNumbers {

    public static int getQuotient(int num1, int num2) {

        int answer = 0;

        if((num1 > 0 & num1 <= 100) & (num2 > 0 & num2 <= 100)) {
            answer = num1 / num2;
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getQuotient(10,5));
        System.out.println(getQuotient(7,2));
    }

}
