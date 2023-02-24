package Introduction;

import java.util.Arrays;

public class DuplicateNumericCount {

    public static int getDuplicateNumCount(int[] array, int n) {

        int answer = 0;

        if(array.length >= 1 & array.length <= 100 & n >= 0 & n <= 1000 &
           Arrays.stream(array).min().getAsInt() >= 0 & Arrays.stream(array).max().getAsInt() <= 1000) {

            for(int i = 0; i < array.length; i++) {
                if(array[i] == n) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] array;

        // TEST CODE
        array = new int[] {1, 1, 2, 3, 4, 5};
        System.out.println(getDuplicateNumCount(array,1));
        array = new int[] {0, 2, 3, 4};
        System.out.println(getDuplicateNumCount(array,1));
    }
}
