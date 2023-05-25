package Introduction;

public class Game369 {

    public static int checkNumber(int order) {

        int answer = 0;

        if (order < 1 | order > 1000000) {
            return -1;
        }

        String orderStr = String.valueOf(order);

        for (int i = 0; i < orderStr.length(); i++) {

            if ((orderStr.charAt(i) == '3') | (orderStr.charAt(i) == '6') | (orderStr.charAt(i) == '9')) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(checkNumber(3));
        System.out.println(checkNumber(29423));
    }
}
