package Introduction;

public class RemoveVowels {

    public static String stringToRemoveVowels(String my_string) {

        String answer = "";
        String[] strArray = my_string.split("");
        String[] vowels = {"a", "e", "i", "o", "u"};
        int j;

        if (my_string.length() >= 1 & my_string.length() <= 1000) {

            for (int i = 0; i < my_string.length(); i++) {
                for (j = 0; j < vowels.length; j++) {

                    if (strArray[i].equals(vowels[j])) {
                        break;
                    }
                }
                if (j == 5) {
                    answer += strArray[i];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(stringToRemoveVowels("bus"));
        System.out.println(stringToRemoveVowels("nice to meet you"));
    }
}
