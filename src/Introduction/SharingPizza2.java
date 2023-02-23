package Introduction;

public class SharingPizza2 {

    public static int orderBySamePieceEveryone(int n) {

        /***
         * best answer
        int answer = 1;

        while (true) {
            if (6 * answer % n == 0) {
                return answer;
            }
            answer++;
        }*/

        int answer = 0;

        if (n >= 1 & n <= 100) {

            int conditionalValue = Math.min(6, n);

            answer = n * 6;

            for (int i = 2; i <= conditionalValue; i++) {
                if ((n % i == 0) & (6 % i == 0) & (answer % i == 0)) {
                    answer /= i;
                }
            }
        }
            while(answer % 6 == 0 & answer != 1) {
                answer /= 6;
            }

            return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(orderBySamePieceEveryone(6));
        System.out.println(orderBySamePieceEveryone(10));
        System.out.println(orderBySamePieceEveryone(4));
    }
}
