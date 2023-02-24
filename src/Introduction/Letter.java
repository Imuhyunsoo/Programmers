package Introduction;

public class Letter {

    public static int getMinimumWidthLength(String message) {

        int answer = 0;

        if(message.length() >= 1 & message.length() <= 50) {
            answer = message.length() * 2;
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getMinimumWidthLength("happy birthday!"));
        System.out.println(getMinimumWidthLength("I love you~"));
    }
}
