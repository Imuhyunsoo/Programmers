package Introduction;

import java.util.Arrays;

public class HateEvenNumbers {

    public static int[] generateOddNumberArrayOrderByAsc(int n) {

        if(!(n >= 1 & n <= 100)) {
            return null;
        }

        // Restrictions
        int[] answer = new int[n / 2 + n % 2];
        int oddNum = 1;

        for(int i = 0; i < answer.length; i++) {

            answer[i] = oddNum;
            oddNum += 2;
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(Arrays.toString(generateOddNumberArrayOrderByAsc(10)));
        System.out.println(Arrays.toString(generateOddNumberArrayOrderByAsc(15)));
    }
}
