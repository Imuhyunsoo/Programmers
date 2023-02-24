package Introduction;

import java.util.Arrays;

public class CreateMaximum {

    public static int getMaximumValue(int[] numbers) {

        /* best answer
         Arrays.sort(numbers);
         int firstMaxValue = numbers[numbers.length - 1];
         int secondMaxValue = numbers[numbers.length - 2];

         return firstMaxValue * secondMaxValue; */

        int answer = 0;
        int maxNumber = Arrays.stream(numbers).max().getAsInt();
        int overlap = 0;

        if(numbers.length >= 2 & numbers.length <= 100) {

            for (int number : numbers) {

                if (number >= 0 & number <= 10000 & answer < (number * maxNumber)) {
                    if (number != maxNumber | overlap >= 1) {
                        answer = number * maxNumber;
                    } else {
                        overlap++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] numbers;

        // TEST CODE
        numbers = new int[] {1, 2, 3, 4, 5};
        System.out.println(getMaximumValue(numbers));
        numbers = new int[] {0, 31, 24, 10, 1, 9};
        System.out.println(getMaximumValue(numbers));
    }
}
