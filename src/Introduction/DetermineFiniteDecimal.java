package Introduction;

public class DetermineFiniteDecimal {

    public static int isFiniteDecimal(int a, int b) {

        // Restrictions
        if (a < 0 | b < 0 | a > 1000 | b > 1000) {
            return -1;
        }

        int count = 2;

        // 約分
        while (count < b) {

            if (a % count == 0 & b % count == 0) {
                a /= count;
                b /= count;
            } else {
                count++;
            }
        }

        // 有限少数を判別
        while (b != 1) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0){
                b /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        System.out.println(isFiniteDecimal(7, 20));
        System.out.println(isFiniteDecimal(11, 22));
        System.out.println(isFiniteDecimal(12, 21));
    }
}
