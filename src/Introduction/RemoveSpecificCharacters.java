package Introduction;

public class RemoveSpecificCharacters {

    public static String removeSpecificChar(String my_string, String letter) {

        StringBuilder answer = new StringBuilder();

        if(my_string.length() >= 1 & my_string.length() <= 100 & letter.length() == 1) {

            for(int i = 0; i < my_string.length(); i++) {

                if(my_string.charAt(i) == letter.charAt(0)) {
                    continue;
                }
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(removeSpecificChar("abcdef","f"));
        System.out.println(removeSpecificChar("BCBdbe","B"));
    }
}
