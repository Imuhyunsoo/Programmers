package Introduction;

public class GermGrowth {

    public static int getGermCount(int n, int t) {

        int answer = n;

        if (n >= 1 && t >= 1 && n <= 10 && t <= 15) {

            for (int i = 0; i < t; i++) {
                answer *= 2;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getGermCount(2,10));
        System.out.println(getGermCount(7,15));
    }
}
