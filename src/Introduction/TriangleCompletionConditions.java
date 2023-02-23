package Introduction;

import java.util.Arrays;

public class TriangleCompletionConditions {

    public static int condition(int[] sides) {

        /***
         * best answer
        int answer = 0;
        Arrays.sort(sides);
        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
        */

        int answer = 2;
        int max = Arrays.stream(sides).max().getAsInt();
        int remaining = 0;
        int count = 0;

        // Restrictions
        if(sides.length == 3) {

            for (int side : sides) {

                // Restrictions
                if (side >= 1 & side <= 1000 & max > side) {
                    remaining += side;
                } else if(max == side) {
                    count++;
                }
            }

            if(max < remaining | count >= 2) {
                answer = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] sides;

        // TEST CODE
        sides = new int[] {1, 2, 3};
        System.out.println(condition(sides));
        sides = new int[] {3, 6, 2};
        System.out.println(condition(sides));
        sides = new int[] {199, 72, 222};
        System.out.println(condition(sides));
        sides = new int[] {3,3,2};
        System.out.println(condition(sides));
    }
}
