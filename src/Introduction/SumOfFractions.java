package Introduction;

import java.util.Arrays;

public class SumOfFractions {

    public static void simplify(int[] array, int n) {

        while (n <= Math.sqrt(Math.max(array[0], array[1]))) {

            if((array[0] % n == 0) & (array[1] % n == 0)) {
                array[0] /= n;
                array[1] /= n;
            } else {
                n++;
            }
        }
    }

    public static int[] sum(int numer1, int denom1, int numer2, int denom2) {

        int[] answer = new int[2];

        // Restrictions
        if((numer1 > 0) & (denom1 > 0) & (numer2 > 0) & (denom2 > 0)
            & (numer1 < 1000) & (denom1 < 1000) & (numer2 < 1000) & (denom2 < 1000)) {

            if(denom1 != denom2) {
                    numer1 *= denom2;
                    numer2 *= denom1;
                    answer[0] = numer1 + numer2;
                    answer[1] = denom1 * denom2;
            }
            else {
                answer[0] = numer1 + numer2;
                answer[1] = denom1;
            }
        }
        simplify(answer,2);
        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(Arrays.toString(sum(1, 2, 3, 4)));
        System.out.println(Arrays.toString(sum(9, 2, 1, 3)));
        System.out.println(Arrays.toString(sum(1, 4, 3, 4)));
        System.out.println(Arrays.toString(sum(511, 512, 1, 512)));

    }

}
