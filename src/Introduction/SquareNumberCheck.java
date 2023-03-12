package Introduction;

public class SquareNumberCheck {

    public static int solution(int n) {

        int answer = 2;

        // Restrictions
        if (n >= 1 & n <= 1000000) {

            for (int i = 2; i * i <= 1000000; i++) {
                if (n == i * i) {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(solution(144));
        System.out.println(solution(976));
    }
}
