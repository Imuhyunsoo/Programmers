package Introduction;

import java.util.*;

public class Ranking {

    public static int[] getRank(int[][] score) {

        if (score.length < 1 | score.length > 10) {
            return null;
        }

        TreeSet<Integer> scoreSet = new TreeSet<>();

        int[] answer = new int[score.length];
        int[] scoreList = new int[score.length];
        int check = 0;
        int count = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < 2; j++) {
                scoreList[i] += score[i][j];
            }
            scoreSet.add(scoreList[i]);
        }

        NavigableSet<Integer> scoreDESC = scoreSet.descendingSet();

        System.out.println(Arrays.toString(scoreList));
        System.out.println(scoreDESC);

        for(Integer num : scoreDESC) {
            for (int i = 0; i < answer.length; i++) {

                if (scoreList[i] == num & check == 0) {
                    answer[i] = ++count;
                    check++;
                } else if (scoreList[i] == num & check != 0) {
                    answer[i] = count;
                    check++;
                }
            }
            count += (check -1);
            check = 0;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[][] score;

        // TEST CODE
        score = new int[][] {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        System.out.println(Arrays.toString(getRank(score)));
        score = new int[][] {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        System.out.println(Arrays.toString(getRank(score)));

    }
}
