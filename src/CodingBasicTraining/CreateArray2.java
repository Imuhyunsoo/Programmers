package CodingBasicTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArray2 {

    public static int[] create(int l, int r) {

        // 制限実行
        if (l < 1 | r < 1 | l > 1000000 | r > 1000000) {
            return null;
        }

        List<Integer> answer = new ArrayList<>();

        for (int bin = 1; ; bin++) {
            String temp = Integer.toBinaryString(bin);
            String replaced = temp.replace('1', '5');
            int value = Integer.parseInt(replaced);

            if (value > r) {
                break;
            }

            if (value < l) {
                continue;
            }

            answer.add(value);
        }

        if (answer.size() == 0) {
            answer.add(-1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray() ;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(Arrays.toString(create(5, 555)));
        System.out.println(Arrays.toString(create(10, 20)));
    }
}
