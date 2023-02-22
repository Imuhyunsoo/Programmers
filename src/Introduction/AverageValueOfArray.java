package Introduction;

public class AverageValueOfArray {

    public double average(int[] numbers) {

        double answer = 0;

        if(numbers.length >= 1 & numbers.length <= 100) {

            for(int i = 0; i < numbers.length; i++) {

                if(!(numbers[i] >= 0 & numbers[i] <= 1000)) {
                    answer = 0;
                    break;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
