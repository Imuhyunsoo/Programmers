package Introduction;

import java.util.HashMap;
import java.util.Map;

public class DislikeOfEnglish {

    public static long getNumber(String numbers) {

        if (numbers.length() < 1 | numbers.length() > 50) {
            return -1;
        }

        long answer = 0;
        long digit = 1;
        String temp = "";
        Map<String, Integer> numStringList = new HashMap<>();
        String[] strNumbers = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < strNumbers.length; i++) {
            numStringList.put(strNumbers[i], i);
        }

        for (int i = numbers.length(); i > 0; i--) {

            temp = numbers.substring(i - 1, i) + temp;

            if (numStringList.containsKey(temp)) {
                answer += numStringList.get(temp) * digit;
                digit *= 10;
                temp = "";
            }

        }
        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getNumber("onetwothreefourfivesixseveneightnine"));
        System.out.println(getNumber("onefourzerosixseven"));
    }
}
