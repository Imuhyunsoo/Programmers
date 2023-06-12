package Introduction;

import java.util.Arrays;

public class Babble {

    public static int getPossiblePronunciation(String[] babbling) {

        // 制限事項
        if (babbling.length < 1 | babbling.length > 100) {
            return -1;
        }

        String[] testString = new String[] {"aya", "ye", "woo", "ma"};
        int count = 0;
        int i = 0;

        while (i < babbling.length) {
            while (count < testString.length) {

                if (babbling[i].contains(testString[count])) {
                    if (babbling[i].indexOf(testString[count]) == 0) {
                        babbling[i] = babbling[i].replace(testString[count], "");
                        count = 0;
                        continue;
                    }
                }
                count++;
            }
            count = 0;
            i++;
        }

        return (int) Arrays.stream(babbling)
                .filter(String::isEmpty)
                .count();
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(getPossiblePronunciation(new String[] {"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(getPossiblePronunciation(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
}
