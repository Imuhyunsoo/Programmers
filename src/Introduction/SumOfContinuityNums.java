package Introduction;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SumOfContinuityNums {

    public static int[] getContinuityNumList(int num, int total) {

        // 制限事項
        if (num < 1 | num > 100 | total < 0 | total > 1000) {
            return null;
        }

        Set<Integer> nums = new TreeSet<>();
        int count = total == 0 ? -48 : -total;

        while (true) {

            for (int i = 0; i < num; i++) {
                nums.add(count + i);
            }

            int sum = nums.stream().mapToInt(Integer::intValue).sum();

            if (sum == total) {
                break;
            }
            nums.clear();
            count++;
        }

        return nums.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(Arrays.toString(getContinuityNumList(3, 12)));
        System.out.println(Arrays.toString(getContinuityNumList(5, 15)));
        System.out.println(Arrays.toString(getContinuityNumList(4, 14)));
        System.out.println(Arrays.toString(getContinuityNumList(5, 5)));
    }
}
