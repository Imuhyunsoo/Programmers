package Introduction;

public class AverageValueOfArray {

    public static double average(int[] numbers) {

        double answer = 0;
        double sum = 0;

        // Restrictions
        if(numbers.length >= 1 & numbers.length <= 100) {

            for (int number : numbers) {

                // Restrictions
                if (!(number >= 0 & number <= 1000)) {
                    break;
                }
                sum += number;
            }
            answer = sum / numbers.length;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] array;

        // TEST CODE
        array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(average(array));
        array = new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println(average(array));
    }
}
