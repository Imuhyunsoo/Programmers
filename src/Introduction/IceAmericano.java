package Introduction;

import java.util.Arrays;

public class IceAmericano {

    public static int[] maximumBuy(int money) {

        int[] answer = new int[2];

        // Restrictions
        if(money > 0 & money <= 1000000) {

            answer[0] = money / 5500;
            answer[1] = money % 5500;
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(Arrays.toString(maximumBuy(5500)));
        System.out.println(Arrays.toString(maximumBuy(15000)));
    }
}
