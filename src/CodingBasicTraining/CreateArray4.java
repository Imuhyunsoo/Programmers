package CodingBasicTraining;

import java.util.Arrays;
import java.util.Stack;


public class CreateArray4 {

    public static int[] create(int[] arr) {

        // 制限実行
        if (arr.length < 1 | arr.length > 100000) {
            return null;
        }

        Stack<Integer> stk = new Stack<>();
        int count = 0;

        while (count != arr.length) {

            if (stk.size() == 0) {
                stk.push(arr[count]);
                count++;
            } else {
                if (stk.peek() < arr[count]) {
                    stk.push(arr[count]);
                    count++;
                } else {
                    stk.pop();
                }
            }
        }
        return  stk.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(Arrays.toString(create(new int[]{1, 4, 2, 5, 3})));
        System.out.println(Arrays.toString(create(new int[] {4, 4})));
    }
}
