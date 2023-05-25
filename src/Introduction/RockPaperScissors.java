package Introduction;

public class RockPaperScissors {

    public static String getWinCase(String rsp) {

        StringBuilder answer = new StringBuilder();

        // Restrictions
        if (rsp.length() > 0 & rsp.length() <= 100) {

            for (int i = 0; i < rsp.length(); i++) {
                if (rsp.charAt(i) == '0') {
                    answer.append("5");
                } else if (rsp.charAt(i) == '2') {
                    answer.append("0");
                } else {
                    answer.append("2");
                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getWinCase("2"));
        System.out.println(getWinCase("205"));
    }
}