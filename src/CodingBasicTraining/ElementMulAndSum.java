package CodingBasicTraining;

import java.util.Arrays;

public class ElementMulAndSum {

    public static int valCheck(int[] num_list) {

        // テストコード
        if (num_list.length < 2 | num_list.length > 10) {
            return -1;
        }

        return Arrays.stream(num_list).reduce(1, (x, y) -> x * y)
                < (Math.pow(Arrays.stream(num_list).sum(), 2)) ? 1 : 0;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(valCheck(new int[] {3, 4, 5, 2, 1}));
        System.out.println(valCheck(new int[] {5, 7, 8, 3}));
    }
}
