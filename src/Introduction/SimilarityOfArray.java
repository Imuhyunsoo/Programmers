package Introduction;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SimilarityOfArray {

    public static int getSimilarityNum(String[] s1, String[] s2) {

        int answer = 0;

        // Restrictions
        if(s1.length >= 1 & s1.length <= 100 & s2.length >= 1 & s2.length <= 100) {

            Set<String> stringSet = new HashSet<>(Arrays.asList(s1));

            for (String s : s2) {

                if (stringSet.contains(s)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] s1;
        String[] s2;

        // TEST CODE
        s1 = new String[] {"a", "b", "c"};
        s2 = new String[] {"com", "b", "d", "p", "c"};
        System.out.println(getSimilarityNum(s1, s2));
        s1 = new String[] {"n", "omg"};
        s2 = new String[] {"m", "dot"};
        System.out.println(getSimilarityNum(s1, s2));
    }
}
