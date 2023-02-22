package Introduction;

public class HowOld {

    public static int yearOfBirth(int age) {

        final int THIS_YEAR = 2022;
        int answer = 0;

        // Restrictions
        if(age > 0 & age <= 120) {
            answer = THIS_YEAR - (age - 1);
        }
        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(yearOfBirth(40));
        System.out.println(yearOfBirth(23));
    }
}
