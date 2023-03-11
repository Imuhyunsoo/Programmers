package Introduction;

public class StringInString {

    public static int checkIncludeString(String str1, String str2) {

        int answer = 2;

        // Restrictions
        if (str1.length() >= 1 & str2.length() >= 1 & str1.length() <= 100 & str2.length() <= 100) {

            if(str1.contains(str2)) {
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(checkIncludeString("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(checkIncludeString("ppprrrogrammers", "pppp"));
        System.out.println(checkIncludeString("AbcAbcA", "AAA"));
    }
}
