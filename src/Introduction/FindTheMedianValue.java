package Introduction;

import java.util.Arrays;

public class FindTheMedianValue {

    public static int getMedianValue(int[] array) {

        int answer = 0;

        // Restrictions
        if(array.length % 2 == 1 & array.length > 0 & array.length < 100) {

            for (int i : array) {

                // Restrictions
                if (!(i > -1000 & i < 1000)) {
                    return 0;
                }
            }
            Arrays.sort(array);
            answer = array[array.length / 2];
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        int[] array;

        array = new int[] {1, 2, 7, 10, 11};
        System.out.println(getMedianValue(array));
        array = new int[] {9, -1, 0};
        System.out.println(getMedianValue(array));
    }
}
