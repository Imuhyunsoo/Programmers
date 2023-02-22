package Introduction;

import java.util.Arrays;

public class FindingTheMostValue {

    public static int getMostFrequentValue(int[] array) {

        int[] countArray = new int[1000];

        for (int num : array) {
            countArray[num]++;
        }

        int maxCount = 0;
        int answer = 0;

        for (int i = 0; i < countArray.length; i++) {

            if (countArray[i] > maxCount) {
                maxCount = countArray[i];
                answer = i;
            } else if (countArray[i] == maxCount) {
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] array;

        // TEST CODE
        array = new int[]{1, 2, 3, 3, 3, 4};
        System.out.println(getMostFrequentValue(array));
        array = new int[]{1, 1, 2, 2};
        System.out.println(getMostFrequentValue(array));
        array = new int[]{1};
        System.out.println(getMostFrequentValue(array));
    }
}