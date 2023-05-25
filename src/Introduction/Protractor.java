package Introduction;

public class Protractor {

    public static int angleChick(int angle) {

        int answer = 0;

        if(angle > 0 & angle < 90) {
            answer = 1;
        } else if(angle == 90) {
            answer = 2;
        } else if(angle > 90 & angle < 180) {
            answer = 3;
        } else if(angle == 180) {
            answer = 4;
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(angleChick(70));
        System.out.println(angleChick(91));
        System.out.println(angleChick(180));
    }
}
