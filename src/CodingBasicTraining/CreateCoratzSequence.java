package CodingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateCoratzSequence {

    public static int[] getCoratzSequence(int n) {

        // 制限実行
        if (n < 1 | n > 1000) {
            return null;
        }

        List<Integer> answer = new ArrayList<>();
        answer.add(n);

        while (n != 1) {

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            } answer.add(n);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(Arrays.toString(getCoratzSequence(10)));
    }
}
