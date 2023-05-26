package Introduction;

import java.util.Arrays;

public class DetermineOrderOfMedical {

    public static int[] getSequence(int[] emergency) {

        // Restrictions
        if (emergency.length < 1 | emergency.length > 10 |
                Arrays.stream(emergency).min().getAsInt() < 1 | Arrays.stream(emergency).max().getAsInt() > 100) {

        }

        int[] copy = emergency.clone();
        int[] answer = new int[emergency.length];

        Arrays.sort(copy);

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if(emergency[i] == copy[j]) {
                    answer[i] = answer.length - j;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] test;

        // TEST CODE
        test = new int[]{3, 76, 24};
        System.out.println(Arrays.toString(getSequence(test)));
        test = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(getSequence(test)));
        test = new int[]{30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(getSequence(test)));
    }
}
