package Introduction;

public class PaperCut {

    public static int getMinimumCutting(int M, int N) {

        // Restrictions
        if (M < 0 | N < 0 | M > 100 | N > 100) {
            return -1;
        }

        if (M == 1 & N == 1) {
            return 0;
        }

        return (Math.min(M, N) - 1) + (Math.min(M, N)) * (Math.max(M, N) - 1);
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getMinimumCutting(2, 2));
        System.out.println(getMinimumCutting(2, 5));
        System.out.println(getMinimumCutting(1, 1));
    }
}
