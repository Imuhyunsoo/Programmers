package Introduction;

public class DivisionOfTwoNumbers2 {

    public static int getQuotient(int num1, int num2) {

        int answer = 0;
        double result;

        // Restrictions
        if((num1 > 0 & num1 <= 100) & (num2 > 0 & num2 <= 100)) {
            result = (double) num1 / num2;
            answer = (int) (result * 1000);
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getQuotient(3,2));
        System.out.println(getQuotient(7,3));
        System.out.println(getQuotient(1,16));
    }
}
