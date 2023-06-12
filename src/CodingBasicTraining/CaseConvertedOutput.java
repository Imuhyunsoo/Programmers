package CodingBasicTraining;

import java.util.Scanner;

public class CaseConvertedOutput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder result = new StringBuilder();

        // 制限事項
        if (!(str.length() < 1 | str.length() > 20)) {

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (Character.isUpperCase(c)) {
                    result.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(c);
                }
            }
        }

        System.out.println(result);
    }
}
