package CodingBasicTraining;

public class SuccessionOfNumbers {

    public static int stringOddAndEvenSum(int[] num_list) {

        // 制限事項
        if (num_list.length < 2 | num_list.length > 10) {
            return -1;
        }

        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                odd.append(num_list[i]);
            } else {
                even.append(num_list[i]);
            }
        }

        return Integer.parseInt(String.valueOf(odd)) + Integer.parseInt(String.valueOf(even));
    }

    public static void main(String[] args) {

        // テストコード
        System.out.println(stringOddAndEvenSum(new int[] {3, 4, 5, 2, 1}));
        System.out.println(stringOddAndEvenSum(new int[] {5, 7, 8, 3}));
    }
}
