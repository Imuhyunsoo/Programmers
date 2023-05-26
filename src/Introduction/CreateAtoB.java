package Introduction;

import java.util.Arrays;

public class CreateAtoB {

    public static int conversionConfirmation(String before, String after) {

        // Restrictions
        if (before.length() != after.length() | before.length() == 0 | before.length() > 1000) {
            return -1;
        }

        int answer = 1;
        String[] beforeList = before.split("");
        String[] afterList = after.split("");

        Arrays.sort(beforeList);
        Arrays.sort(afterList);

        for (int i = 0; i < beforeList.length; i++) {

            if (!(beforeList[i].equals(afterList[i]))) {
                answer = 0;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(conversionConfirmation("olleh", "hello"));
        System.out.println(conversionConfirmation("allpe", "apple"));
    }
}
