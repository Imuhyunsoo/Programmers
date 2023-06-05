package Introduction;

import java.util.Arrays;

public class CharacterCoordinates {

    public static int[] getCoordinates(String[] keyInput, int[] board) {

        if (keyInput.length > 50 | board[0] < 1 | board[1] < 1 | board[0] > 99 | board[1] > 99) {
            return null;
        }

        int[] answer = new int[2];

        for (String input : keyInput) {

            switch (input) {

                case "up":
                    if (answer[1] < board[1] / 2) {
                        answer[1]++;
                    }
                    break;

                case "down":
                    if (answer[1] > -(board[1] / 2)) {
                        answer[1]--;
                    }
                    break;

                case "left":
                    if (answer[0] > -(board[0] / 2)) {
                        answer[0]--;
                    }
                    break;

                case "right":
                    if (answer[0] < board[0] / 2) {
                        answer[0]++;
                    }
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] keyInput;
        int[] board;

        // TEST CODE
        keyInput = new String[] {"left", "right", "up", "right", "right"};
        board = new int[] {11, 11};
        System.out.println(Arrays.toString(getCoordinates(keyInput, board)));
        keyInput = new String[] {"down", "down", "down", "down", "down"};
        board = new int[] {7, 9};
        System.out.println(Arrays.toString(getCoordinates(keyInput, board)));
    }
}
