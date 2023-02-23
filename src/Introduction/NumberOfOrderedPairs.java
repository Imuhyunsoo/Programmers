package Introduction;

public class NumberOfOrderedPairs {

    public static int getNumPair(int n) {

        int answer = 0;

        // Restrictions
        if(n >= 1 & n <= 1000000) {

            for(int i = 1; i <= n; i++) {
                if(n % i == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getNumPair(20));
        System.out.println(getNumPair(100));
    }
}
