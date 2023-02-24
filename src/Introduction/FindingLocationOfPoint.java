package Introduction;

public class FindingLocationOfPoint {

    public static int getPointLocation(int[] dot) {

        int answer = 0;

        // Restrictions
        if(dot.length == 2 & Math.min(dot[0], dot[1]) >= -500  & Math.max(dot[0], dot[1]) <= 500 & dot[0] != 0 & dot[1] != 0 ) {

            if(dot[0] > 0 & dot[1] > 0) {
                answer = 1;
            } else if(dot[0] < 0 & dot[1] > 0) {
                answer = 2;
            } else if(dot[0] > 0) {
                answer = 4;
            } else {
                answer = 3;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] dot;

        // TEST CODE
        dot = new int[] {2,4};
        System.out.println(getPointLocation(dot));
        dot = new int[] {-7,9};
        System.out.println(getPointLocation(dot));
    }
}
