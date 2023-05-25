package Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisors {

    public static int[] getDivisors(int n) {

        // Restrictions
        if (n < 0 | n > 10000) {
            return null;
        }

        List<Integer> numList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                numList.add(i);
            }
        }

        int[] answer = new int[numList.size()];

        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(Arrays.toString(getDivisors(24)));
        System.out.println(Arrays.toString(getDivisors(29)));
    }
}
