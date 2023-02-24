package Introduction;

import java.util.Arrays;

public class LengthOfArrayString {

    public static int[] getStringArrayLength(String[] strlist) {

        int[] answer = new int[strlist.length];

        if(strlist.length >= 1 & strlist.length <= 100) {

            for(int i = 0; i < strlist.length; i++) {
                answer[i] = strlist[i].length();
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] strList;

        // TEST CODE
        strList = new String[] {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(getStringArrayLength(strList)));
        strList = new String[] {"I", "Love", "Programmers."};
        System.out.println(Arrays.toString(getStringArrayLength(strList)));
    }
}
