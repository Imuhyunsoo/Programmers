package Introduction;

public class SharingPizza {

    public static int orderToEveryoneOnePiece(int n) {

        int answer = 0;
        int quotient;

        if(n >= 1 & n <= 100) {

            quotient = n / 7;

            if(n % 7 >= 1) {
                answer = quotient + 1;
            } else {
                answer = quotient;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(orderToEveryoneOnePiece(7));
        System.out.println(orderToEveryoneOnePiece(1));
        System.out.println(orderToEveryoneOnePiece(15));
    }
}
