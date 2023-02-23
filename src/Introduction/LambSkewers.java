package Introduction;

public class LambSkewers {

    public static int order(int n, int k) {

        int answer = 0;

        if(n > 0 & n < 1000 & k >= n/10 & k < 1000) {
            if(n / 10 >= 1) {
                k -= n / 10;
            }

            answer = n * 12000 + k * 2000;
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(order(10,3));
        System.out.println(order(64,6));
    }
}
