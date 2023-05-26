package Introduction;

public class HiddenSearchForNumbers {

    public static int searchNumber(String my_string) {

        if (my_string.length() < 1 | my_string.length() > 1000) {
            return -1;
        }

        boolean continuous = false;
        boolean switchOff = true;
        int temp = 0;
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            try {
                if(continuous) {
                    temp = Integer.parseInt(temp + my_string.substring(i, i+1));
                } else {
                    temp = Integer.parseInt(my_string.substring(i, i+1));
                    continuous = true;
                }
            } catch (NumberFormatException e) {
                answer += temp;
                temp = 0;
                continuous = false;
                switchOff = false;
            }
        }

        if (switchOff | continuous) {
            answer += temp;
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(searchNumber("aAb1B2cC34oOp"));
        System.out.println(searchNumber("1a2b3c4d123Z"));
    }
}
