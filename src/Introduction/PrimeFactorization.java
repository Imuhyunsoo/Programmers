package Introduction;

import java.util.Arrays;
import java.util.HashSet;

public class PrimeFactorization {

    public static int[] getPrimeFactorization(int n) {

        // Restrictions
        if (n < 2 | n > 10000) {
            return null;
        }

        int temp = n;
        int count = 2;
        HashSet<Integer> primeFactorizationNumbers = new HashSet<>();

        while (temp != 0) {
            if (temp % count == 0) {
                primeFactorizationNumbers.add(count);
                temp /= count;
            } else if (temp < count){
                break;
            } else {
                count++;
            }
        }

        int index = 0;
        int[] answer = new int[primeFactorizationNumbers.size()];

        for (int element : primeFactorizationNumbers) {
            answer[index++] = element;
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(Arrays.toString(getPrimeFactorization(12)));
        System.out.println(Arrays.toString(getPrimeFactorization(17)));
        System.out.println(Arrays.toString(getPrimeFactorization(420)));
        System.out.println(Arrays.toString(getPrimeFactorization(100)));
    }
}
