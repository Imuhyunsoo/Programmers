package Introduction;

public class Factual {

    public static int getFactual(int n) {

        // Restrictions
        if (n < 0 | n > 3628800) {
            return -1;
        }

        int answer = 1;
        int temp = 1;

        while (temp <= n) {
            temp *= ++answer;
        }

        return --answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getFactual(3628800));
        System.out.println(getFactual(7));
        System.out.println(getFactual(2));
    }
}
