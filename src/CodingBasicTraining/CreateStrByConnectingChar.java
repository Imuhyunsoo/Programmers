package CodingBasicTraining;

import java.util.Arrays;

public class CreateStrByConnectingChar {

    public static String createStr(String my_string, int[] index_list) {

        // 制限実行
        if (my_string.length() < 1 | my_string.length() > 1000 | index_list.length < 1 | index_list.length > 1000
                | Arrays.stream(index_list).max().getAsInt() > my_string.length()
                | Arrays.stream(index_list).min().getAsInt() < 0) {
            return "ERROR";
        }

        StringBuilder answer = new StringBuilder();

        for (int j : index_list) {
            answer.append(my_string.charAt(j));
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(createStr("cvsgiorszzzmrpaqpe",
                new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(createStr("zpiaz", new int[] {1, 2, 0, 0, 3}));
    }
}
