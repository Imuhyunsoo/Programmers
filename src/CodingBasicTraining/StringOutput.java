package CodingBasicTraining;

import java.util.Scanner;

public class StringOutput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        // 制限事項
        if (str.length() < 1 | str.length() > 1000000) {
            str = null;
        }

        System.out.println(str);
    }
}
