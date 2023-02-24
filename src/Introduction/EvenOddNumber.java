package Introduction;

import java.util.Arrays;

public class EvenOddNumber {

    public static int[] getEvenAndOddNumber(int[] num_list) {

        int[] answer = {0, 0};

        // Restrictions
        if(num_list.length >= 1 & num_list.length <= 100) {

            for (int j : num_list) {

                if (j % 2 == 0) {
                    answer[0]++;
                } else {
                    answer[1]++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] num_list;

        // TEST CODE
        num_list = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(getEvenAndOddNumber(num_list)));
        num_list = new int[] {1, 3, 5, 7};
        System.out.println(Arrays.toString(getEvenAndOddNumber(num_list)));
    }
}
