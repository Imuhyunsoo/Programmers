package Introduction;

public class ThrowBall {

    public static int getNextOrder(int[] numbers, int k) {

        // Restrictions
        if (numbers.length < 2 | numbers.length > 100 | k < 0 | k > 1000) {
            return -1;
        }

        int answer = 0;

        for(int i = 0; i < k - 1; i++) {

            if ((numbers.length - 1) < answer) {
                answer = 0;
            } else if ((numbers.length - 1) == answer) {
                answer = 1;
                continue;
            }
            answer += 2;
        }

        return numbers[answer];
    }

    public static void main(String[] args) {

        int[] test;

        // TEST CODE
        test = new int[] {1, 2, 3, 4};
        System.out.println(getNextOrder(test, 2));
        test = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println(getNextOrder(test, 5));
        test = new int[] {1, 2, 3};
        System.out.println(getNextOrder(test, 3));
    }
}
