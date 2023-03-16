package Introduction;

public class RockPaperScissors {

    public static String getWinCase(String rsp) {

        String answer = "";

        // Restrictions
        if (rsp.length() > 0 & rsp.length() <= 100) {

            for (int i = 0; i < rsp.length(); i++) {
                if (rsp.charAt(i) == '0') {
                    answer += "5";
                } else if (rsp.charAt(i) == '2') {
                    answer += "0";
                } else {
                    answer += "2";
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getWinCase("2"));
        System.out.println(getWinCase("205"));
    }
}