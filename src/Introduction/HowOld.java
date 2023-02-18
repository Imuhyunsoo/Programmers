package Introduction;

public class HowOld {

    public static int yourOfBirth(int age) {

        final int THIS_YEAR = 2022;
        int answer = 0;

        if(age > 0 & age <= 120) {
            answer = THIS_YEAR - (age - 1);
        }
        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(yourOfBirth(40));
        System.out.println(yourOfBirth(23));
    }
}
