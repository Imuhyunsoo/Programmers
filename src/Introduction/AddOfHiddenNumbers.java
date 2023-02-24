package Introduction;

public class AddOfHiddenNumbers {

    public static int totalHiddenNumbers(String my_string) {

        int answer = 0;
        String[] numberArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // Restrictions
        if(my_string.length() >= 1 & my_string.length() <= 1000) {

            for(int i = 0; i < my_string.length(); i++) {
                for(int j = 0; j < numberArray.length; j++) {

                    if(numberArray[j].equals(my_string.substring(i, i + 1)))  {
                        answer += Integer.parseInt(my_string.substring(i, i+1));
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(totalHiddenNumbers("aAb1B2cC34oOp"));
        System.out.println(totalHiddenNumbers("1a2b3c4d123"));
    }
}
