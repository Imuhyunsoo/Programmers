package Introduction;

public class StringCalculation {

    public static int calculation(String my_string) {

        if (my_string.length() < 5 | my_string.length() > 100) {
            return -1;
        }

        int answer = 0;
        String[] formula = my_string.split(" ");

        for (int i = 1; i < formula.length; i += 2) {

            switch (formula[i]) {
                case "+" :
                    formula[i + 1] = String.valueOf(Integer.parseInt(formula[i - 1]) + Integer.parseInt(formula[i + 1]));
                    break;
                case "-" :
                    formula[i + 1] = String.valueOf(Integer.parseInt(formula[i - 1]) - Integer.parseInt(formula[i + 1]));
                    break;
            }
        }

        return Integer.parseInt(formula[formula.length - 1]);
    }

    public static void main(String[] args) {

        // TEST CODE
        System.out.println(calculation("3 + 4"));
    }

}
