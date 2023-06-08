package Introduction;

import java.util.Arrays;

public class SafeArea {

    public static int getSafeAreaNums(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == 1) {
                    dangerAreaCheck(board, i, j);
                }
            }
        }

        return board.length * board[0].length - (int) Arrays.stream(board)
                .flatMapToInt(Arrays::stream)
                .filter(num -> num == 2 || num == 1)
                .count();
    }

    public static void dangerAreaCheck(int[][] board, int i, int j) {

        int[][] dangerArea = new int[][] {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

        for (int k = 0; k < dangerArea.length; k++) {
            try {
                if (board[i - dangerArea[k][0]][j - dangerArea[k][1]] != 1) {
                    board[i - dangerArea[k][0]][j - dangerArea[k][1]] = 2;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                continue;
            }
        }
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(getSafeAreaNums(new int [][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(getSafeAreaNums(new int [][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}}));
        System.out.println(getSafeAreaNums(new int [][] {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}}));
    }
}
