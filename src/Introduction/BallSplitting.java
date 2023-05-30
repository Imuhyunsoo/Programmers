package Introduction;

import java.math.BigInteger;

public class BallSplitting {

    public static int getCase(int balls, int share) {

        // Restrictions
        if (balls < 1 | balls > 30 | share < 1 | share > 30 | share > balls) {
            return -1;
        }

        BigInteger num1 = factorial(balls);
        BigInteger num2 = factorial(balls - share);
        BigInteger num3 = factorial(share);
        BigInteger div1 = num1.divide(num2);
        BigInteger div2 = div1.divide(num3);

        return div2.intValue();
    }

    public static BigInteger factorial(int n) {

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getCase(3, 2));
        System.out.println(getCase(5, 3));
        System.out.println(getCase(30, 15));
    }
}
