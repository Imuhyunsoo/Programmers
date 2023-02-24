package Introduction;

public class AddFigure {

    public static int totalDigits(int n) {

        int answer = 0;
        String strNumber = String.valueOf(n);

        if(n >= 0 & n <= 1000000) {

            for(int i = 0; i < strNumber.length(); i++) {
                answer += Integer.parseInt(strNumber.substring(i, i+1));
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(totalDigits(1234));
        System.out.println(totalDigits(930211));
    }
}
