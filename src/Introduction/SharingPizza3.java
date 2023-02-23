package Introduction;

public class SharingPizza3 {

    public static int orderBySamePieceEveryone(int slice, int n) {

        int answer = 1;

        // Restrictions
        if(slice >= 2 & slice <= 10 & n >= 1 & n <= 100) {

            while(true) {

                if((slice * answer - n) >= 0) {
                    return answer;
                }
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(orderBySamePieceEveryone(7, 10));
        System.out.println(orderBySamePieceEveryone(4, 12));
    }
}
