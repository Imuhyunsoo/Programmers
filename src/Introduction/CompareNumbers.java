package Introduction;

public class CompareNumbers {

    public static int equalToNumbers(int num1, int num2) {

        int answer = 0;

        if((num1 >= 0 & num1 <= 10000) & (num2 >= 0 & num2 <= 10000)) {
            if(num1 == num2) {
                answer = 1;
            }
            else {
                answer = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(equalToNumbers(2,3));
        System.out.println(equalToNumbers(11,11));
        System.out.println(equalToNumbers(7,99));

    }
}
