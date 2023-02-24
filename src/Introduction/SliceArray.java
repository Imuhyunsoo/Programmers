package Introduction;

import java.util.Arrays;

public class SliceArray {

    public static int[] getSliceArray(int[] numbers, int num1, int num2) {

        int[] answer = new int[num2 - num1 + 1];
        int count = 0;

        if(numbers.length >= 2 & numbers.length <= 30 & 0 <= num1 & num1 < num2 & num2 < numbers.length) {

            for(int i = num1; i <= num2; i++) {
                answer[count] = numbers[i];
                count++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] numbers;

        // TEST CODE

        numbers = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(getSliceArray(numbers, 1, 3)));
        numbers = new int[] {1, 3, 5};
        System.out.println(Arrays.toString(getSliceArray(numbers, 1, 2)));
    }
}
