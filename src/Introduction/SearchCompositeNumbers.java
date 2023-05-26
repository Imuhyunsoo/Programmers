package Introduction;

public class SearchCompositeNumbers {

    public static int getCompositeNumCount(int n) {

        int count = 0;

        // Restrictions
        if (n < 1 | n > 100) {
            return -1;
        }

        for (int i = 4; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getCompositeNumCount(10));
        System.out.println(getCompositeNumCount(15));
    }
}
