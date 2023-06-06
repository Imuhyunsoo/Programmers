package Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialSequence {

    public static int[] specialSort(int[] numList, int n) {

        // 制限事項
        if (n < 1 | n > 10000 | numList.length < 1 | numList.length > 100) {
            return null;
        }

        int temp = numList[0];
        List<Integer> nums = new ArrayList<>();
        int[] answer = new int[numList.length];

        for (int num : numList) {
            nums.add(num);
        }

        // 配列のアルゴリズム
        for (int i = 0; i < numList.length; i++) {
            for (Integer num : nums) {

                if (Math.abs(temp - n) == Math.abs(num - n)) {
                    if (temp < num) {
                        temp = num;
                    }
                } else if (Math.abs(temp - n) > Math.abs(num - n)) {
                    temp = num;
                }
            }
            answer[i] = temp;
            nums.remove(Integer.valueOf(temp));
            temp = 20000;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] numList;

        // テストコード
        numList = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(specialSort(numList, 4)));
        numList = new int[] {10000, 20, 36, 47, 40, 6, 10, 7000};
        System.out.println(Arrays.toString(specialSort(numList, 30)));
    }
}
