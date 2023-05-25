package Introduction;

import java.util.Arrays;

public class ArrayRotation {

    public static int[] spin(int[] numbers, String direction) {

        if (numbers.length < 3 | numbers.length > 20) {
            return null;
        }

        switch (direction) {
            case "right":
                return right(numbers);
            case "left":
                return left(numbers);
            default:
                return null;
        }

    }

    public static int[] right(int[] numbers) {

        int[] answer = new int[numbers.length];

        answer[0] = numbers[numbers.length - 1];

        System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);

        return answer;
    }

    public static int[] left(int[] numbers) {

        int[] answer = new int[numbers.length];

        answer[numbers.length - 1] = numbers[0];

        System.arraycopy(numbers, 1, answer, 0, numbers.length - 1);

        return answer;
    }

    public static void main(String[] args) {

        int[] test;

        // TEST CODE
        test = new int[] {1, 2, 3};
        System.out.println(Arrays.toString(spin(test, "right")));
        test = new int[] {4, 455, 6, 4, -1, 45, 6};
        System.out.println(Arrays.toString(spin(test, "left")));
    }
}
