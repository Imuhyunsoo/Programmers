package Introduction;

public class PROGRAMMERS_962 {

    public static String getSpaceAge(int age) {

        StringBuilder answer = new StringBuilder();
        String strAge = String.valueOf(age);
        char a = 97;

        // Restrictions
        if(age <= 1000) {

            for(int i = 0; i < strAge.length(); i++) {
                for(int j = 0; j < 10; j++) {
                    if(Integer.parseInt(strAge.substring(i,i+1)) == j) {
                        answer.append((char) (a + j));
                    }
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getSpaceAge(23));
        System.out.println(getSpaceAge(51));
        System.out.println(getSpaceAge(100));
    }
}
