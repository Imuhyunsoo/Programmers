package CodingBasicTraining;

import java.util.Scanner;

public class RepeatedOutputString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        // 制限
        if (!(str.length() < 1 | str.length() > 10 | n < 1 | n > 5)) {
            System.out.println(str.repeat(n));
        }
    }
}
