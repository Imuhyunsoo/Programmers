package CodingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountUp {

    public static int[] countUp(int start, int end) {

        // 制限実行
        if (start < 0 | end > 50) {
            return null;
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            answer.add(i);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(Arrays.toString(countUp(3, 10)));
    }
}
