package Introduction;

import java.util.Arrays;

public class DoubleTheArray {

    public static int[] doubleOutput(int[] numbers) {

        int[] answer;
        answer = numbers;

        // Restrictions
        if(answer.length >= 1 & answer.length <= 1000) {

            for (int i = 0; i < answer.length; i++) {

                // Restrictions
                if (answer[i] >= -10000 & answer[i] <= 10000) {
                    answer[i] *= 2;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] array;

        // TEST CODE
        array = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(doubleOutput(array)));
        array = new int[] {1, 2, 100, -99, 1, 2, 3};
        System.out.println(Arrays.toString(doubleOutput(array)));
    }
}
