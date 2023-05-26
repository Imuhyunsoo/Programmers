package Introduction;

public class TheNumberOfK {

    public static int getK(int i, int j, int k) {

        // Restrictions
        if (i < 1 | j < i | j > 100000 | k < 0 | k > 9) {
            return -1;
        }

        int answer = 0;
        String temp;

        for (int x = i; x <= j; x++) {
            temp = String.valueOf(x);
            for (int y = 0; y < temp.length(); y++) {
                if (temp.substring(y, y+1).equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(getK(1, 13, 1));
        System.out.println(getK(10, 50, 5));
        System.out.println(getK(3, 10, 2));
    }
}
