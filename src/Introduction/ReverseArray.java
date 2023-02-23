package Introduction;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverse(int[] num_list) {

        int[] answer = new int[num_list.length];

        boolean minimum = Arrays.stream(num_list).min().getAsInt() >= 0;
        boolean maximum = Arrays.stream(num_list).max().getAsInt() <= 1000;

        // Restrictions
        if( num_list.length <= 1000 & minimum & maximum) {

            for(int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[num_list.length - (i + 1)];
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] array;

        // TEST CODE
        array = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(array)));
        array = new int[] {1, 1, 1, 1, 1, 2};
        System.out.println(Arrays.toString(reverse(array)));
        array = new int[] {1, 0, 1, 1, 1, 3, 5};
        System.out.println(Arrays.toString(reverse(array)));
    }
}
