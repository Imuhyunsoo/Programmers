package CodingBasicTraining;

public class DiceGame2 {

    public static int gameStart(int a, int b, int c) {

        // 制限事項
        if (a < 1 | a > 6 | b < 1 | b > 6 | c < 1 | c > 6) {
            return -1;
        }

        double temp = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);

        if (a == b & a == c) {
            return (int) ((a + b + c) * temp * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        } else if (!(a == b) & !(a == c) & !(b == c)) {
            return a + b + c;
        } else {
            return (int) ((a + b + c) * temp);
        }
    }

    public static void main(String[] args) {

        //　テストコード
        System.out.println(gameStart(2, 6, 1));
        System.out.println(gameStart(5, 3, 3));
        System.out.println(gameStart(4, 4, 4));
    }
}
