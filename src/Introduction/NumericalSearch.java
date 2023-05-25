package Introduction;

public class NumericalSearch {

    public static int search(int num, int k) {

        // Restrictions
        if (num < 0 | num > 1000000 | k < 0 | k > 10) {
            return -1;
        }

        int digitNum = String.valueOf(num).indexOf(String.valueOf(k)) + 1;
        return digitNum <= 0 ? -1 : digitNum;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(search(29183, 1));
        System.out.println(search(232443, 4));
        System.out.println(search(123456, 7));
        System.out.println(search(10,0));
    }
}
