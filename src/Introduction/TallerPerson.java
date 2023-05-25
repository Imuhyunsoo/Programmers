package Introduction;

import java.util.Arrays;

public class TallerPerson {

    public static int getTallerCount(int[] array, int height) {

        int answer = 0;

        // Restrictions
        if(array.length >= 1 & array.length <= 100 & height >= 1 & height <= 200) {

            Arrays.sort(array);

            // Restrictions
            if(array[0] >= 1 & array[array.length - 1] <= 200) {

                for (int j : array) {
                    if (j > height) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] array;

        // TEST CODE
        array = new int[] {149, 180, 192, 170};
        System.out.println(getTallerCount(array,167));
        array = new int[] {180, 120, 140};
        System.out.println(getTallerCount(array,190));
    }
}
