package Introduction;

public class SumOfEvenNumbers {

    /***
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    } ***/

    public static int totalSumEvenNumbers(int n) {

        int answer = 0;
        int count = 0;

        // Restrictions
        if(n > 0 & n <= 1000) {

            while(true) {

                if(n - 2 >= 0) {
                    n -= 2;
                    count++;
                } else break;
            }

            for(int i = 1; i <= count; i++) {
                answer += 2 * i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(totalSumEvenNumbers(10));
        System.out.println(totalSumEvenNumbers(4));
    }
}
