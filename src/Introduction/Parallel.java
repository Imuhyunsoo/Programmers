package Introduction;

import java.util.ArrayList;
import java.util.Collections;

public class Parallel {

    public static int isParallel(int[][] dots) {

        ArrayList<Double> test = new ArrayList<>();
        double x;
        double y;
        int[][] array = new int[][] {{1, 2}, {3, 0}, {0, 1}, {2, 3}, {0, 3}, {1, 2}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {

                x = dots[array[i][j]][0] - dots[array[i][j + 1]][0];
                y = dots[array[i][j]][1] - dots[array[i][j + 1]][1];

                if (x == 0 | y == 0) {
                    continue;
                }
                test.add(y / x);

                if (Collections.frequency(test, y / x) == 2) {
                    return 1;
                }
            }
            if (i % 2 != 0) {
                test.clear();
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(isParallel(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
        System.out.println(isParallel(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}));
        System.out.println(isParallel(new int[][]{{1, 5}, {2, 4}, {3, 9}, {4, 8}}));
        System.out.println(isParallel(new int[][]{{1, 0}, {0, 1}, {1, 2}, {2, 1}}));
    }
}
