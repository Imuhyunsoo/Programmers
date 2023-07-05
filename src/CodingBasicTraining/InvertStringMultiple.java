package CodingBasicTraining;

public class InvertStringMultiple {

    public static String invertString(String my_string, int[][] queries) {

        // 制限事項
        if (my_string.length() < 1 | my_string.length() > 1000 | queries.length < 1 | queries.length > 1000) {
            return "ERROR";
        }

        StringBuilder answer = new StringBuilder();

        for (int[] query : queries) {

            answer = new StringBuilder(my_string.substring(0, query[0]));

                for (int j = query[1]; j >= query[0]; j--) {
                answer.append(my_string.charAt(j));
            }
            my_string = answer + my_string.substring(query[1] + 1);
        }

        return my_string;
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(invertString("rermgorpsam", new int[][] {{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
        System.out.println(invertString("ababaa", new int[][] {{2, 3}}));
    }
}
